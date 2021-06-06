class AnnotationUtils {

    public static void printClassAnnotations(Class classObject) {
        // write your code here
        for (var annotation : classObject.getDeclaredAnnotations()) {
            System.out.println(annotation.annotationType().getSimpleName());
        }
    }
}