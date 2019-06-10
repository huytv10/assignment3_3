import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap 1 số bất kỳ: ");
        int n;
        n = scanner.nextInt();

        int result = n;
        try {
            while (true) {
                result = timSoNguyenToTiepTheo(result);
                System.out.println(result);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
        }
    }

    public static boolean isSoNguyenTo(int x) {
        int squareRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= squareRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int timSoNguyenToTiepTheo(int a) {
        int result = a + 1;
        while (true) {
            if (isSoNguyenTo(result)) {
                return result;
            }
            result++;
        }
    }
}
