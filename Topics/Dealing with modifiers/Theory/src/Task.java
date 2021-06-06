// You can experiment here, it won’t be checked

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task {
  public static void main(String[] args) throws Exception {

    Class classItem = System.class;
    Field field = classItem.getField("out");
    Method method = field.getType().getMethod("println", String.class);
    method.invoke(new PrintStream(System.err), "Ahmed");
    System.class
            .getField("out").getType()
            .getMethod("println", String.class)
            .invoke(new PrintStream(System.err), "Hello!");

  }
}
