package com.q.Create.Builder;

public class Product {

    private String partA;
    private String partB;
    private String partC;
    private String partD;

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public void setPartD(String partD) {
        this.partD = partD;
    }

    public void show() {
        System.out.println("Product.show");
        System.out.println(this.partA);
        System.out.println(this.partB);
        System.out.println(this.partC);
        System.out.println(this.partD);

    }

}
