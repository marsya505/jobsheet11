import java.util.Scanner;
public class Greetings_11 {
    public static String getGreetingRecipient() {
        Scanner input11 = new Scanner(System.in);
        System.out.println("Input the name of people you want to greet : ");
        String recipientName = input11.nextLine();
        input11.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        System.out.println("Thankyou " +name+ " May the force be with you");
    }
}
