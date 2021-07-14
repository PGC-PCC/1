package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Fanlage implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String werks;

    private String fanlage2;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String linetype;

    private String port;

    private String lineid;

    private String haverfid;

    private Short carcount1;

    private Short reservecount1;

    private Date strdate1;

    private Date enddate1;

    private Short carcount2;

    private Short reservecount2;

    private Date strdate2;

    private Date enddate2;

    private String linecode;

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

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port == null ? null : port.trim();
    }

    public String getLineid() {
        return lineid;
    }

    public void setLineid(String lineid) {
        this.lineid = lineid == null ? null : lineid.trim();
    }

    public String getHaverfid() {
        return haverfid;
    }

    public void setHaverfid(String haverfid) {
        this.haverfid = haverfid == null ? null : haverfid.trim();
    }

    public Short getCarcount1() {
        return carcount1;
    }

    public void setCarcount1(Short carcount1) {
        this.carcount1 = carcount1;
    }

    public Short getReservecount1() {
        return reservecount1;
    }

    public void setReservecount1(Short reservecount1) {
        this.reservecount1 = reservecount1;
    }

    public Date getStrdate1() {
        return strdate1;
    }

    public void setStrdate1(Date strdate1) {
        this.strdate1 = strdate1;
    }

    public Date getEnddate1() {
        return enddate1;
    }

    public void setEnddate1(Date enddate1) {
        this.enddate1 = enddate1;
    }

    public Short getCarcount2() {
        return carcount2;
    }

    public void setCarcount2(Short carcount2) {
        this.carcount2 = carcount2;
    }

    public Short getReservecount2() {
        return reservecount2;
    }

    public void setReservecount2(Short reservecount2) {
        this.reservecount2 = reservecount2;
    }

    public Date getStrdate2() {
        return strdate2;
    }

    public void setStrdate2(Date strdate2) {
        this.strdate2 = strdate2;
    }

    public Date getEnddate2() {
        return enddate2;
    }

    public void setEnddate2(Date enddate2) {
        this.enddate2 = enddate2;
    }

    public String getLinecode() {
        return linecode;
    }

    public void setLinecode(String linecode) {
        this.linecode = linecode == null ? null : linecode.trim();
    }
}