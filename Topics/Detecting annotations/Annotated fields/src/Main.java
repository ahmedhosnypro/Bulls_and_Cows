import java.lang.reflect.*;
import java.util.ArrayList;

/**
 Get an array of fields the object declares that contain annotations (inherited fields should be skipped).
 */
class AnnotationsUtil {

    public static String[] getFieldsContainingAnnotations(Object object) {
        // Add implementation here
        Field[] fields = object.getClass().getDeclaredFields();
        ArrayList<String> list = new ArrayList<>();
        for (Field field: fields){
             if (field.getDeclaredAnnotations().length != 0){
                 list.add(field.getName());
             }
        }
        return list.toArray(new String[0]);
    }

}