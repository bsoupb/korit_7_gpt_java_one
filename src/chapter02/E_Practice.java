package chapter02;

import java.util.Scanner;

public class E_Practice {

    /*
        1. 점수에 따른 학점 출력 (if, else if, else 사용)

        사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요
        0 미만 또는 100 초과인 경우 : 유효하지 않은 점수입니다.
        90점 이상 : A
        80점 이상 : B
        70점 이상 : C
        60점 이상 : D
        그 외 : F

        2. 삼각형 모양의 별(*) 출력 (중첩 for 사용)
        (1)
        *
        **
        ***
        ****
        *****
        (2)
            *
           **
          ***
         ****
        *****
        (3)
        *****
        ****
        ***
        **
        *
        (4)
        *****
         ****
          ***
           **
            *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.
        System.out.print("점수를 입력하세요(0 ~ 100) : ");
        int score = sc.nextInt();

        if(score > 100 || score < 0) {
            System.out.println("유효하지 않은 점수입니다");
        } else if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else if(score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 2-(1)
        // 줄 수 : 1 ~ 5까지 반복
        // 각 줄의 별 개수 : 1에서 5로 증가
        int num = sc.nextInt();

        for(int i = 0; i < num; i++){   // 줄 수 (1부터 5까지)
            for(int j = 0; j < i + 1; j++){     // 각 줄의 별 갯수 (각 줄의 별 개수는 각 줄의 수 보다 "이하"의 값
                System.out.print("*");
            }
            System.out.println();   // 줄 바꿈 처리를 담당
        }

        // 2-(2)
        for(int i = 0; i < num; i++){       
            for(int j = i; j < num - 1; j++){   // 공백 반복 (4에서 0까지 감소)       j == 1; j <= num - i
                System.out.print(' ');
            }
            for(int j = 0; j < i + 1; j++){     // 별 반복 (j : 1 ~ 5)              j = 1; k <= i
                System.out.print('*');
            }
            System.out.println();   // 줄 바꿈 처리
        }

        // 2-(3)
        for(int i = 0; i < num; i++){       // 줄(row)을 제어           int i = height; i >= 1; i--
            for(int j = num - i; j > 0; j--){   // 각 줄의 별 출력      int j = 1; j <= i; j++
                System.out.print('*');
            }
            System.out.println();   // 줄바꿈
        }

        // 2-(4)
        for(int i = 0; i < num; i++){               // 줄(row) 제어        int i = height; i >= 1; i--
            for(int j = 0; j < i + 1; j++) {        // 공백 제어           int j = 1; j <= height - i; j++
                System.out.print(' ');
            }
            for(int j = num - i; j > 0; j--){       // 별 제어             int k = 1; k <= i; k++
                System.out.print('*');
            }
            System.out.println();
        }


        // cf) do-while문 사용 예제
        // : 사용자 입력값을 반복적으로 받아 조건에 맞는 값을 처리할 때 유용

        int number;
        do{
            System.out.println("1부터 10사이의 숫자를 입력하세요");
            number = sc.nextInt();
            // 입력값이 1 ~ 10 사이일 때 종료
        } while(number < 1 || number > 10);
            System.out.println("입력한 숫자는 : " + number);

        sc.close();

        // cf) 동일한 입력 공간(System.in)을 여러 번 여는 경우
        // : 표준 입력 스트림을 닫고 재실행하는 경우 에러 발생
        // - 운영체제 자원의 스트림이기 때문에 한 번 닫으면 다시 열 수 없음
    }
}
