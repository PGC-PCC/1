package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Wmatinfo implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String werks;

    private String fanlage2;

    private String number1;

    private String yhtype;

    private Short batch;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String dischangedescribe;

    private String dischangestatus;

    private String partstationdescribe;

    private String partstationstatus;

    private String gwstatus;

    private String gwdescribe;

    private String gwqjstatus;

    private String gwqjdescribe;

    private String linestatus;

    private String linedescribe;

    private String describe1;

    private String status1;

    private String describe2;

    private String status2;

    private String deliverySite;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDocumentid() {
        return documentid;
    }

    public void setDocumentid(String documentid) {
        this.documentid = documentid == null ? null : documentid.trim();
    }

    public Short getIsdel() {
        return isdel;
    }

    public void setIsdel(Short isdel) {
        this.isdel = isdel;
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1 == null ? null : number1.trim();
    }

    public String getYhtype() {
        return yhtype;
    }

    public void setYhtype(String yhtype) {
        this.yhtype = yhtype == null ? null : yhtype.trim();
    }

    public Short getBatch() {
        return batch;
    }

    public void setBatch(Short batch) {
        this.batch = batch;
    }

    public String getCreatorid() {
        return creatorid;
    }

    public void setCreatorid(String creatorid) {
        this.creatorid = creatorid == null ? null : creatorid.trim();
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname == null ? null : creatorname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getModifierid() {
        return modifierid;
    }

    public void setModifierid(String modifierid) {
        this.modifierid = modifierid == null ? null : modifierid.trim();
    }

    public String getModifiername() {
        return modifiername;
    }

    public void setModifiername(String modifiername) {
        this.modifiername = modifiername == null ? null : modifiername.trim();
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public String getDischangedescribe() {
        return dischangedescribe;
    }

    public void setDischangedescribe(String dischangedescribe) {
        this.dischangedescribe = dischangedescribe == null ? null : dischangedescribe.trim();
    }

    public String getDischangestatus() {
        return dischangestatus;
    }

    public void setDischangestatus(String dischangestatus) {
        this.dischangestatus = dischangestatus == null ? null : dischangestatus.trim();
    }

    public String getPartstationdescribe() {
        return partstationdescribe;
    }

    public void setPartstationdescribe(String partstationdescribe) {
        this.partstationdescribe = partstationdescribe == null ? null : partstationdescribe.trim();
    }

    public String getPartstationstatus() {
        return partstationstatus;
    }

    public void setPartstationstatus(String partstationstatus) {
        this.partstationstatus = partstationstatus == null ? null : partstationstatus.trim();
    }

    public String getGwstatus() {
        return gwstatus;
    }

    public void setGwstatus(String gwstatus) {
        this.gwstatus = gwstatus == null ? null : gwstatus.trim();
    }

    public String getGwdescribe() {
        return gwdescribe;
    }

    public void setGwdescribe(String gwdescribe) {
        this.gwdescribe = gwdescribe == null ? null : gwdescribe.trim();
    }

    public String getGwqjstatus() {
        return gwqjstatus;
    }

    public void setGwqjstatus(String gwqjstatus) {
        this.gwqjstatus = gwqjstatus == null ? null : gwqjstatus.trim();
    }

    public String getGwqjdescribe() {
        return gwqjdescribe;
    }

    public void setGwqjdescribe(String gwqjdescribe) {
        this.gwqjdescribe = gwqjdescribe == null ? null : gwqjdescribe.trim();
    }

    public String getLinestatus() {
        return linestatus;
    }

    public void setLinestatus(String linestatus) {
        this.linestatus = linestatus == null ? null : linestatus.trim();
    }

    public String getLinedescribe() {
        return linedescribe;
    }

    public void setLinedescribe(String linedescribe) {
        this.linedescribe = linedescribe == null ? null : linedescribe.trim();
    }

    public String getDescribe1() {
        return describe1;
    }

    public void setDescribe1(String describe1) {
        this.describe1 = describe1 == null ? null : describe1.trim();
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1 == null ? null : status1.trim();
    }

    public String getDescribe2() {
        return describe2;
    }

    public void setDescribe2(String describe2) {
        this.describe2 = describe2 == null ? null : describe2.trim();
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2 == null ? null : status2.trim();
    }

    public String getDeliverySite() {
        return deliverySite;
    }

    public void setDeliverySite(String deliverySite) {
        this.deliverySite = deliverySite == null ? null : deliverySite.trim();
    }
}