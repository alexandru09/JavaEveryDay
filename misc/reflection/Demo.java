package misc.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields) fieldNames.add(field.getName());
        return fieldNames;
    }

    public static void main(String[] args) {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();
        
        List<String> actualFieldNames = getFieldNames(fields);

        if (actualFieldNames.size() == 2 
            && Arrays.asList("name", "age").containsAll(actualFieldNames)) {
                System.out.println("Reflection works!");
        } else {
            System.out.println("Reflection is not real, it can't hurt you.");
        }
    }
}
