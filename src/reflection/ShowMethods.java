// Использование Reflection для полного списка методов класса, в том числе базовых
package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    private static String usage = "usage:\n"
            + "ShowMethods qualified.class.name\n"
            + "To show all methods in class or:\n"
            + "To search for methods involving 'word'";
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if (args.length < 1) {
            System.exit(0);
        }
        int lines = 0;
        for (String argument : args) {
            try {
                Class<?> c = Class.forName(argument);
                Method[] methods = c.getMethods();
                Constructor[] ctors = c.getConstructors();
                if (args.length == 1) {
                    for (Method method : methods)
                        System.out.println(p.matcher(method.toString())
                                .replaceAll(""));
                    for (Constructor ctor : ctors)
                        System.out.println(p.matcher(ctor.toString())
                                .replaceAll(""));
                    // lines = methods.length + ctors.length;
                } else {
                    for (Method method : methods)
                        if (method.toString().indexOf(argument) != -1) {
                            System.out.println(p.matcher(method.toString())
                                    .replaceAll(""));
                            System.out.println(method.toString());
                            lines++;
                        }
                    for (Constructor ctor : ctors) {
                        if (ctor.toString().indexOf(argument) != -1) {
                            System.out.println(p.matcher(ctor.toString())
                                    .replaceAll(""));
                            lines++;
                        }
                    }
                    System.out.println("NEXT");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("No such class: " + e);
            }
        }
    }
}
