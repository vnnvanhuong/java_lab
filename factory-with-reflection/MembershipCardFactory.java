import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class MembershipCardFactory {
    private static final Map<String, Class<? extends MemberShipCard>> registeredCards = new HashMap<>();

    static {
        registeredCards.put("silver", SilverCard.class);
        registeredCards.put("gold", GoldCard.class);
        registeredCards.put("platinum", PlatinumCard.class);
    }

    public static MemberShipCard get(String type) {
        Class<?> clazz = registeredCards.get(type);
        try {
            Constructor<?> constructor = clazz.getDeclaredConstructor(new Class[] {});
            return (MemberShipCard) constructor.newInstance(new Object[] {});
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
                | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
		return null;
	}

    
}