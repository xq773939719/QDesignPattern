package com.q.Create.SimpleFactory;

public class SimpleFactory {

    public enum PRODUCT_TYPE {
        A,
        B,
    }

    public Product createProduct(PRODUCT_TYPE productType) {
        Product product = null;
        switch (productType) {
            case A -> product = new AProduct();
            case B -> product = new BProduct();
        }

        return product;
    }
}
