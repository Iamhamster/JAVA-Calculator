package test_1;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        String ends="";
        Scanner sc3 = new Scanner(System.in);

        do {
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.print("1번 숫자를 입력하시오: ");
            int num1 = sc.nextInt();
            System.out.print("2번 숫자를 입력하시오: ");
            int num2 = sc.nextInt();
            System.out.println("입력된 숫자= " + num1 + ", " + num2);
            char a;

            do {
                System.out.print("연산자(+,-,/,*)를 입력하시오: ");
                a = sc2.next().charAt(0);
                System.out.println("입력된 연산자= " + a);
            } while ((a != '+') && (a != '-') && (a != '/') && (a != '*'));

            int answer = 0;
            if (a == '+') {
                answer = num1 + num2;
            }
            else if (a == '-') {
                answer = num1 - num2;
            }
            else if (a == '/') {
                if(num2==0){
                    System.out.print("/n나눗셈 연산에서 분모(두번째 정수)에0이 입력될 수 없습니다.\n문제로 인해");
                    break;
                }
                answer = num1 / num2;
            }
            else if (a == '*') {
                answer = num1 * num2;
            }
            System.out.println("풀이: " + num1 + a + num2 + " = " + answer);
            System.out.print("끝내겠습니까?[끝낸다:exit, 더 한다:아무거나]: ");
            ends = sc3.nextLine();
        }
        while (!(ends.equals("exit")));
        System.out.println("\n종료되었습니다.");
    }
}