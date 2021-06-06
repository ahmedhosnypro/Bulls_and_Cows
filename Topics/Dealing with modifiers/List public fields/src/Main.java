import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 Get list of public fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {

    public String[] getPublicFields(Object object) {
        // Add implementation here
        Field[] fieldsObject = object.getClass().getDeclaredFields();
        List<String> list = new ArrayList<>();
        for (Field field : fieldsObject) {
            if (Modifier.isPublic(field.getModifiers())){
                list.add(field.getName());
            }
        }
        Collections.sort(list);
        String[] result = list.toArray(new String[list.size()]);
        return result;
    }

}