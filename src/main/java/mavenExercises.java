import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter something: ");
        String choice = scanner.nextLine();
        String reverseChoice = StringUtils.reverse(choice);
        String swapCase = StringUtils.swapCase(choice);
        boolean isNumber = StringUtils.isNumeric(choice);
        System.out.println("You entered: " + choice);
        if (isNumber == true) {
            System.out.println(choice + " is a number");
        } else {
            System.out.println(choice +" is not a number");
        }
        System.out.println("Flipped Case: " + swapCase);
        System.out.println("Reversed: " + reverseChoice);

    }
}
