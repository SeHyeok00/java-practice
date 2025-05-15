import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1부터 100 사이의 숫자를 입력하세요: ");

        for (;;) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 100) {
                System.out.println("입력 완료! 프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }
        }
    }
}