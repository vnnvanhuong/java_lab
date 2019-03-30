import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AllCarVisitor implements Visitor {

    @Override
    public void visit(Object object) {
        Method visitMethod;
        try {
            visitMethod = getClass().getMethod("visit", object.getClass());
            visitMethod.invoke(this, object);
        } catch (NoSuchMethodException e) {
            System.out.println("Skipped! No method 'visit' defined for " + object);
        } catch (SecurityException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException e) {
            e.printStackTrace();
        }
       
    }

    public void visit(Ferrari ferrari) {
        ferrari.setColor("green");
    }

    public void visit(Maserati maserati) {
        maserati.setColor("red");
    }
    
}