import java.util.Scanner;

public class GetUseName {

    public static void main(String[] args) {
 Scanner in = new Scanner(System.in);
 String firstName ="";
 String  lastName ="";

 firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
 lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");

        System.out.println("\n" +firstName+ " " + lastName);

    }
}