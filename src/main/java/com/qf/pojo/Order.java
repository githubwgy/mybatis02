package com.qf.pojo;

import java.util.Date;

/**
 * wgy 2019/7/6 9:43
 */
public class Order {
    private Integer id;
    private Integer userId; //user_id
    private String number;
    private Date createtime;
    private String note;

    private User user;

    public Order(Integer id, Integer userId, String number, Date createtime, String note) {
        this.id = id;
        this.userId = userId;
        this.number = number;
        this.createtime = createtime;
        this.note = note;
    }

    public Order() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", number='" + number + '\'' +
                ", createtime=" + createtime +
                ", note='" + note + '\'' +
                ", user=" + user +
                '}';
    }
}
