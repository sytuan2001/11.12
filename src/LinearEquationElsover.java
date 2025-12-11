import java.util.Scanner;

public class LinearEquationElsover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập a:");
        double a = sc.nextDouble();

        System.out.println("nhậpb:");
        double b = sc.nextDouble();

        if (a !=0 ) {
            double x = -b/a;
            System.out.println("ptrinh có nghiệm duy nhất:"+ x);
        } else {
            if (b != 0) {
                System.out.println("ptrinh vô nghiệm");
            } else {
                System.out.println("ptrinh vô số nghiệm");
            }
        }
    }
}
