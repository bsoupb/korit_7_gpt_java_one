package chapter07.practiceApp;

/*
    필드 : 나이(int), 이름(name)
    메서드 : getAge(), getName(), isAvailable();
    생성자 : Entity(age, name)


 */

class Student {

    private int age;
    private String name;
    private boolean canDrink = true;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
        canDrink = true;
    }

    void study() {
        System.out.println("공부하는 학생");
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

}

class Minor extends Student {
    Minor(int age, String name) {
        super(age, name);
    }

    @Override
    void study() {
        System.out.println("수능을 공부하는 학생");
    }

    void isAvailableDrink(boolean canDrink) {
        if(!canDrink) {
            System.out.println("미성년자이므로 술을 마시지 못합니다");
        }
    }
}

class University extends Student {

    University(int age, String name) {
        super(age, name);
    }

    @Override
    void study() {
        System.out.println("전공을 공부하는 학생");
    }

    void notAvailableDrink(boolean canDrink) {
        if(canDrink) {
            System.out.println("술을 마실 수 있습니다");
        }
    }

}

public class Entity {


    

}
