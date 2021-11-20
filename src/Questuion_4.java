import java.util.Scanner;

public class Questuion_4 {
    public static void main(String[] args) {
        System.out.println("Enter numer in kelometer");
        Scanner sc = new Scanner(System.in);
        Scanner Convert = new Scanner(System.in);
        float km = Convert.nextFloat();
        float Miles = km * 0.62131f;
        System.out.println(km + " KELOMETER IS EQUAL TO " + Miles + " MILES");

    }
}
