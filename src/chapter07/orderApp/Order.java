package chapter07.orderApp;

/*
    Order 클래스 - 실제 주문 로직이 구현
    
    특정 제품(Product)과 수량을 기반으로 주문을 생성
    +) 총 가격(세금 포함)을 계산하는 역할
 */

public class Order {
    private Product product;    // 각 주문마다 따로 만들지 않아도 됨
    private int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // 총 가격 계산 메서드
    double calculateTotalPrice() {
        double tax = product.calculateTax();
        double totalPrice = (product.getPrice() + tax) * quantity;

        return totalPrice;
    }

    // 주문 정보를 반환하는 메서드
    @Override
    public String toString() {
        return "Order Detail[ " + product.getName() + " * " + "Quantity : "  + quantity + " >> " + calculateTotalPrice() + " ]";
        // Order Detail[ snake * 2 >> 18000 ]
    }
    
    // toString()
    // : '클래스명@해당객체의주소값'이 문자열로 출력
    // >> 객체를 문자열로 표현할 때 사용
    // >> 모든 클래스의 최상위 클래스인 Object 클래스에 정의

}
