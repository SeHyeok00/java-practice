import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int drinkPrice = 0;
        int sizePrice = 0;
        int optionPrice = 0;

        System.out.println("음료를 선택하세요.");
        System.out.println("1. 아메리카노, 2. 카페라떼, 3. 카푸치노");
        int drinkChoice = sc.nextInt();

        if (drinkChoice == 1) {
            drinkPrice = 3000;
        } else if (drinkChoice == 2) {
            drinkPrice = 4000;
        } else if (drinkChoice == 3) {
            drinkPrice = 4500;
        } else {
            System.out.print("음료를 다시 선택하세요.");
            return;
        }


        System.out.println("사이즈를 선택하세요.");
        System.out.println("1. Small, 2. Medium, 3. Large");
        int sizeChoice = sc.nextInt();

        if (sizeChoice == 1) {
            sizePrice = 0;
        } else if (sizeChoice == 2) {
            sizePrice = 500;
        } else if (sizeChoice == 3) {
            sizePrice = 1000;
        } else {
            System.out.print("사이즈를 다시 선택하세요.");
            return;
        }


        System.out.println("옵션을 선택하세요.");
        System.out.println("1. 기본 , 2. 샷 추가, 3. 시럽 추가, 4. 샷과 시럽 모두 추가");
        int oprionChoice = sc.nextInt();

        if (oprionChoice == 1) {
            optionPrice = 0;
        } else if (oprionChoice == 2) {
            optionPrice = 500;
        } else if (oprionChoice == 3) {
            optionPrice = 300;
        } else if (oprionChoice == 4) {
            optionPrice = 800;
        } else {
            System.out.print("옵션을 다시 선택하세요.");
            return;
        }

        int totalPrice = drinkPrice + sizePrice + optionPrice;
        System.out.println("최종 가격은 " + totalPrice + "원입니다.");
        sc.close();
    }
}