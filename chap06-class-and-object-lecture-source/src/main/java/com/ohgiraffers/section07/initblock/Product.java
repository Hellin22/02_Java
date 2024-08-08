package com.ohgiraffers.section07.initblock;

public class Product {
    private String name = "아이폰";         // 상품명
    private int price;           // 상품가격
    private static String brand; // 제조사

    {
        System.out.println("초기화 블럭 실행...");
        name = "엘지폰";
        System.out.println("name = " + name);
        brand = "AEW";
    }

    static{
//        name="사이온";
        brand="엘지";
    }

    public Product() {
        System.out.println("Produce 기본 생성자 호출됨...");
        name = "아이폰";
        System.out.println("name = " + name);
    }

    @Override
    public String toString() {
        return "product{" +
                "name='" + this.name + '\'' +
                ", price=" + this.price +
                ", brand='" + Product.brand + '\'' +
                '}';
    }
}
