package chapter07.orderApp;

/*
    Electronics 클래스 (자식 클래스)

    +) 전자 제품은 특별 세율 적용 : 15%
 */

public class Electronics extends Product{
    Electronics(String name, int price) {
        super(name, price);
    }

    // int getPrice() { return price; }

    @Override
    double calculateTax() {
        return getPrice() * 0.15;       // getPrice() : 자식클래스 (this 생략)
    }
}
