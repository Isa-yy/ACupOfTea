package com.a_cup_of_tea.entity;

/**
 * 订单实体类
 *
 * @author Isa Huang
 */
public class Order {
    private Integer oid;
    private Integer userid;
    private Integer teaid;
    private Integer num;
    private String temperature;
    private String sweaty;
    private String situation;

    public Order() {

    }



    public Order(Integer oid, Integer userid, Integer teaid, Integer num, String temperature, String sweaty, String situation) {
        this.oid = oid;
        this.userid = userid;
        this.teaid = teaid;
        this.num = num;
        this.temperature = temperature;
        this.sweaty = sweaty;
        this.situation = situation;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public String getTemperature() {
        return temperature;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSweaty() {
        return sweaty;
    }

    public void setSweaty(String sweaty) {
        this.sweaty = sweaty;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }
}