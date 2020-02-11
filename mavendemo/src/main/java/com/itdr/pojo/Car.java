package com.itdr.pojo;

import org.springframework.stereotype.Component;

/**
 * ClassName: Car
 * 日期: 2020/2/5 15:37
 *
 * @author Air张
 * @since JDK 1.8
 */

@Component
public class Car {
    private String cname;
    private String color;
    private Integer price;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void a(){
        System.out.println("初始化方法");
    }
    public void b(){
        System.out.println("销毁方法");
    }
}
