import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 Get sorted list of private fields the object declares (inherited fields should be skipped).
 */
class FieldGetter {
    public List<String> getPrivateFields(Object object) {
        Field[] fieldsObject = object.getClass().getDeclaredFields();
        List<String> list = new ArrayList<>();
        for (Field field : fieldsObject) {
            if (Modifier.isPrivate(field.getModifiers())){
                list.add(field.getName());
            }
        }
        Collections.sort(list);
        return list;
    }

}