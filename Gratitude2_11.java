public class Gratitude2_11 {
    public static void sayThankyou() {
        System.out.println("Thankyou for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I cloud ask you anything.");
    }
    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    }
    public static void main(String[] args) {
        sayThankyou();
        String expression = "Thankyou...wish you all the best!!";
        sayAdditionalGreetings(expression);
    }
}