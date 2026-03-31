

    import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double degree = sc.nextDouble();

        double rad = degree * Math.PI / 180;

        double sine = Math.sin(rad);
        double cosine = Math.cos(rad);

        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
    }
}