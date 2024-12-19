package chapter07.practiceApp;

import java.time.chrono.MinguoEra;

/*
    App 클래스
    - Entity의 객체(부모1, 자식2)를 활용하는 시스템 구현
    
    ex) 동물(상품, 과일, 학생) 관리 시스템
 */
public class App {

    private boolean canDo;

    void isChecked(Student student, boolean canDo) {
        System.out.println("축제에 참석합니다");
    }
    
    public static void main(String[] args) {

        Student stu1 = new  Minor(14, "홍길동");
        

    }
}
