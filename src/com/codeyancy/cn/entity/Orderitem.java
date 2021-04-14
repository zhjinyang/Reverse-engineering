package com.codeyancy.cn.entity;

public class Orderitem {
    private Long id;

    private Long orderId;

    private Integer goodNum;

    private Double goodMoney;

    private Long goodId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(Integer goodNum) {
        this.goodNum = goodNum;
    }

    public Double getGoodMoney() {
        return goodMoney;
    }

    public void setGoodMoney(Double goodMoney) {
        this.goodMoney = goodMoney;
    }

    public Long getGoodId() {
        return goodId;
    }

    public void setGoodId(Long goodId) {
        this.goodId = goodId;
    }
}