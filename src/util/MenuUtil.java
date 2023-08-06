package util;
import static util.InputUtil.*;
public class MenuUtil {
    public static int entryMenu() {
        System.out.println("""
                           [1].Sign In
                           [0].System Exit
                           """
        );
        return intInput("Choose an option: ");
    }
    public static int accountMenu() {
        System.out.println("""
                           [1].Card to Card
                           [2].Show Balance
                           [3].Back to the main page
                           """
        );
        return intInput("Choose an option: ");
    };
}
