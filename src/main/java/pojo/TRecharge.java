package com.sample;


public class TRecharge {

  private long id;
  private long cusId;
  private long orderId;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;
  private double money;
  private long state;
  private long paymentType;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getCusId() {
    return cusId;
  }

  public void setCusId(long cusId) {
    this.cusId = cusId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }


  public long getState() {
    return state;
  }

  public void setState(long state) {
    this.state = state;
  }


  public long getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(long paymentType) {
    this.paymentType = paymentType;
  }

}
