package com.study.ch07.register;

public class ProductService {

    boolean isEmptyString(String str) {
        if(str == null) {
            return true;
        }
        // null이 아니면 주소참조
        // jdk 11 메서드
        // spacebar Empty->false(비어있지 않다.)
        // " " Empty->true null체크 x  값x 비어있는거 다르다.
        // isBlank 스페이스 제거 후 공백 체크
        return str.isBlank();
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스까지 데이터 전달함.");

        productRepository.saveProduct(product);
    }

}
