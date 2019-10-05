package zayed.domain;

import java.util.List;

public class Calculator {
    private Integer add1;
    private Integer add2;
    private Integer mult1;
    private Integer mult2;
    private String sum;
    private String product;
    private List<String> errors;

    public Calculator() {
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getSum() {
        return this.sum;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return this.product;
    }

    public Integer getAdd1() {
        return this.add1;
    }

    public void setAdd1(Integer add1) {
        this.add1 = add1;
    }

    public Integer getAdd2() {
        return this.add2;
    }

    public void setAdd2(Integer add2) {
        this.add2 = add2;
    }

    public Integer getMult1() {
        return this.mult1;
    }

    public void setMult1(Integer mult1) {
        this.mult1 = mult1;
    }

    public Integer getMult2() {
        return this.mult2;
    }

    public void setMult2(Integer mult2) {
        this.mult2 = mult2;
    }

    public Integer getResult1() {
        return this.add1 + this.add2;
    }

    public Integer getResult2() {
        return this.mult1 * this.mult2;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
