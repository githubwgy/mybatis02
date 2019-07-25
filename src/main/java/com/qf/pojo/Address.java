package com.qf.pojo;

/**
 * wgy 2019/7/6 11:46
 */
public class Address {
    public Address(String add) {
        this.add = add;
    }

    public Address() {
    }
    private String add;

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Address{" +
                "add='" + add + '\'' +
                '}';
    }
}
