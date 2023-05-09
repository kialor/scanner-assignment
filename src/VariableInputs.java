import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args){
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner3.nextLine();

        System.out.println("Enter an integer:");
        int integer = Integer.valueOf(scanner3.nextLine());

        System.out.println("Enter a double:");
        double value = Double.valueOf(scanner3.nextLine());

        System.out.println("Enter a boolean value:");
        boolean input = Boolean.valueOf(scanner3.nextLine());

        System.out.println("Your string is " +text);
        System.out.println("Your integer is " +integer);
        System.out.println("Your double is " +value);
        System.out.println("Your boolean is " +input);
    }
}
