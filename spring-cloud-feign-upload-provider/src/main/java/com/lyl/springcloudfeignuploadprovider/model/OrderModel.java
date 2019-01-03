package com.lyl.springcloudfeignuploadprovider.model;

import java.sql.Date;

/**
 * ClassName OrderModel
 * Author liyunlong
 * Data 上午 11:02
 * Version 1.0
 **/
public class OrderModel {
    private Long orderNo;
    private Date createTime;
    private Date payTime;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public OrderModel() {
    }

    public OrderModel(Long orderNo, Date createTime, Date payTime) {
        this.orderNo = orderNo;
        this.createTime = createTime;
        this.payTime = payTime;
    }
}
