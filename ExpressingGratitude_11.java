import java.util.Scanner;
public class ExpressingGratitude_11 {
    public static String getGreetingRecipient() {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input11.nextLine();
        input11.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
        sayAdditionalGreetings(name);
    }
    public static void sayAdditionalGreetings(String recipientName) {
        System.out.println("I appreciate your dedication" + recipientName);
    }
    public static void main(String[] args) {
        sayThankyou();
    }
}