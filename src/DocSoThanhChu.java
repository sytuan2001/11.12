import java.util.Scanner;

public class DocSoThanhChu {
    public static String readOneDigit(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static String readTeen(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String readTens(int n) {
        switch (n) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }


    public static String readTwoDigits(int n) {
        if (n < 10)
            return readOneDigit(n);

        if (n < 20)
            return readTeen(n);

        int tens = n / 10;
        int ones = n % 10;

        if (ones == 0)
            return readTens(tens);

        return readTens(tens) + " " + readOneDigit(ones);
    }


    public static String readThreeDigits(int n) {
        int hundreds = n / 100;
        int lastTwo = n % 100;

        String result = readOneDigit(hundreds) + " hundred";

        if (lastTwo == 0)
            return result;

        return result + " and " + readTwoDigits(lastTwo);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số (0–999): ");
        int number = sc.nextInt();

        if (number < 0 || number >= 1000) {
            System.out.println("out of ability");
            return;
        }

        if (number < 10)
            System.out.println(readOneDigit(number));
        else if (number < 100)
            System.out.println(readTwoDigits(number));
        else
            System.out.println(readThreeDigits(number));
    }

}
