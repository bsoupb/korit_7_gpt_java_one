package chapter03;

import java.util.ArrayList;

public class E_Array {
    public static void main(String[] args) {
        /*
            크기 10의 ArrayList를 생성, 1 ~ 10 까지의 숫자를 추가한 뒤 출력
            : 반복문을 사용(1부터 10까지 증가하는 숫자)

            추가한 숫자 중 홀수만 제거하고 결과를 출력
            : 반복문과 조건문 사용

            인덱스 3에 값 50을 삽입하고 결과를 출력
         */

        ArrayList<Integer> list = new ArrayList<>(10);

        for(int i = 0; i < 10; i++){
            int realNum = i + 1;
            list.add(realNum);
        }
        System.out.print(list);

        int len = list.size();

        for(int i = 0; i < list.size(); i++){
            // 홀수 조건
            if(list.get(i) % 2 != 0){
                list.remove(i);
                
                // 요소를 삭제하고 난 후 인덱스 조정 (ArrayList의 경우 크기가 동적으로 변경)

                // cf) 인덱스 조정을 하지 않을 경우 정상 동작이 않는 경우
                // : 연속된 요소를 제거할 때 (홀수가 연속될 경우)
                // list = [1, 3, 5, 7, 9];

                // i = 0 일 때 list.remove(0)
                // >> 리스트 [3, 5, 7, 9] 이고 i = 1
                // >> (3을 건너뛰고) 5가 삭제
                // 따라서 요소를 삭제한 경우(홀수 제거) 인덱스 번호를 조정
                
                i--;
            }
        }

        System.out.println(list);

        list.add(3, 50);
        System.out.println(list);


    }
}
