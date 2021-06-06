import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class MethodsDemo {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        // write your code here
        Method[] methods = SomeClass.class.getDeclaredMethods();
        for (Method method: methods){
            method.setAccessible(true);
            System.out.println(method.invoke(null));
        }
    }
}