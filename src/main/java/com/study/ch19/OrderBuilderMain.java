package com.study.ch19;

public class OrderBuilderMain {
    public static void main(String[] args) {
        Order order = Order.builder().
                orderId(100).
                consumerName("홍길동").
                price(1450000).
                stock(2)
                .productName("Samsung Galaxy Book2 pro").build();
        order.showOrderInfo();
    }
}
