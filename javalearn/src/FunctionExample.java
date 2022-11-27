
/**
 * Function Signature
 * <Access Modifier> <Return Type> <Function Name>(Function Parameters)
 */

public class FunctionExample {

    public static void main(String[] args) {
        String[] persons = new String[]{"Alex","Bob","Mark"};

        for (String person : persons)  {
            greet(person);
        }
    }

    public static void greet(String name) {
        System.out.println("Hello "+name);
    }
}
