package com.runbom.demo.model;

import java.io.Serializable;

public class Wdeduction implements Serializable {
    private String id;

    private Short no;

    private String number1;

    private Short quantity;

    private String fanlage2;

    private String site;

    private String isdel;

    private String countid;

    private Short quantityn;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Short getNo() {
        return no;
    }

    public void setNo(Short no) {
        this.no = no;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1 == null ? null : number1.trim();
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
    }

    public String getCountid() {
        return countid;
    }

    public void setCountid(String countid) {
        this.countid = countid == null ? null : countid.trim();
    }

    public Short getQuantityn() {
        return quantityn;
    }

    public void setQuantityn(Short quantityn) {
        this.quantityn = quantityn;
    }
}