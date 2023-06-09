package misc.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example from https://www.baeldung.com/java-reflection
 */
public class Demo {
    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) fieldNames.add(field.getName());
        return fieldNames;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();
        
        List<String> actualFieldNames = getFieldNames(fields);

        if (actualFieldNames.size() == 2 
            && Arrays.asList("name", "age").containsAll(actualFieldNames)) {
                System.out.println("Reflection works!");
        } else {
            System.out.println("Reflection is not real, it can't hurt you.");
        }

        Object goat = new Goat("goat");
        Class<?> clazz = goat.getClass();
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        System.out.println(clazz.getCanonicalName());

        Class<?> goatClass = Class.forName("misc.reflection.Goat");
        Class<?> animalClass = Class.forName("misc.reflection.Goat");

        int goatMods = goatClass.getModifiers();
        int animalMods = animalClass.getModifiers();

        System.out.println(Modifier.isPublic(goatMods));
        System.out.println(Modifier.isAbstract(animalMods));
        System.out.println(Modifier.isPublic(animalMods));

        Package pkg = clazz.getPackage();
        System.out.println(pkg.getName());

        Class<?> goatSuperClass = clazz.getSuperclass();
        System.out.println(goatSuperClass);

        Class<?>[] goatInterfaces = clazz.getInterfaces();
        Constructor<?>[] goatConstructor = clazz.getConstructors();
        Field[] field = clazz.getDeclaredFields();
    }
}
