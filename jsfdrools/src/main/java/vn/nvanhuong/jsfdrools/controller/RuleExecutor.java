package vn.nvanhuong.jsfdrools.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import org.drools.RuleBase;
import org.drools.RuleBaseFactory;
import org.drools.WorkingMemory;
import org.drools.compiler.DroolsParserException;
import org.drools.compiler.PackageBuilder;

public class RuleExecutor {
	
	public void execute(List<Object> objects) throws DroolsParserException, IOException {
		RuleBase ruleBase = initialiseDrools();
        WorkingMemory workingMemory = initializeMessageObjects(ruleBase, objects);
        workingMemory.fireAllRules();
	}
	
	private RuleBase initialiseDrools() throws IOException, DroolsParserException {
        PackageBuilder packageBuilder = readRuleFiles();
        return addRulesToWorkingMemory(packageBuilder);
    }

    private PackageBuilder readRuleFiles() throws DroolsParserException, IOException {
        PackageBuilder packageBuilder = new PackageBuilder();
        String ruleFile = "/rules/default.drl";
        Reader reader = getRuleFileAsReader(ruleFile);
        packageBuilder.addPackageFromDrl(reader);
        return packageBuilder;
    }

    private Reader getRuleFileAsReader(String ruleFile) {
        InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);
        return new InputStreamReader(resourceAsStream);
    }

    private RuleBase addRulesToWorkingMemory(PackageBuilder packageBuilder) {
        RuleBase ruleBase = RuleBaseFactory.newRuleBase();
        org.drools.rule.Package rulesPackage = packageBuilder.getPackage();
        ruleBase.addPackage(rulesPackage);
        return ruleBase;
    }

    private WorkingMemory initializeMessageObjects(RuleBase ruleBase, List<Object> objects) {
        WorkingMemory workingMemory = ruleBase.newStatefulSession();
        for (Object object : objects) {
			workingMemory.insert(object);
	        workingMemory.insert(object);
        }
        return workingMemory;
    }
}

