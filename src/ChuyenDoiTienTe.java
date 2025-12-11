import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số tiền:");
        double usd = sc.nextDouble();
        double vnd = usd*25000;
        System.out.println("số tiền đổi ra là :"+vnd);
    }
}
