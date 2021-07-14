package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Ndemand implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String execid;

    private String rfid;

    private String band;

    private String werks;

    private String spj;

    private String kanr;

    private String number1;

    private String fanlage2;

    private String cartype;

    private String deliverySite;

    private String path;

    private String site;

    private Short gwljsl;

    private String gwqj;

    private Short qjsl;

    private String tp;

    private Short tpsl;

    private Short ljsl;

    private Short bzsl;

    private Short quantity;

    private String ccid;

    private String ljid;

    private String xhdid;

    private String ljgwid;

    private Short status;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String zptype;

    private Short xzpriority;

    private Short tbljsl;

    private Short serialnum;

    private Short serialnummove;

    private Short serialnumold;

    private String yhtype;

    private String hk;

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

    public String getExecid() {
        return execid;
    }

    public void setExecid(String execid) {
        this.execid = execid == null ? null : execid.trim();
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid == null ? null : rfid.trim();
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band == null ? null : band.trim();
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getSpj() {
        return spj;
    }

    public void setSpj(String spj) {
        this.spj = spj == null ? null : spj.trim();
    }

    public String getKanr() {
        return kanr;
    }

    public void setKanr(String kanr) {
        this.kanr = kanr == null ? null : kanr.trim();
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1 == null ? null : number1.trim();
    }

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getDeliverySite() {
        return deliverySite;
    }

    public void setDeliverySite(String deliverySite) {
        this.deliverySite = deliverySite == null ? null : deliverySite.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public Short getGwljsl() {
        return gwljsl;
    }

    public void setGwljsl(Short gwljsl) {
        this.gwljsl = gwljsl;
    }

    public String getGwqj() {
        return gwqj;
    }

    public void setGwqj(String gwqj) {
        this.gwqj = gwqj == null ? null : gwqj.trim();
    }

    public Short getQjsl() {
        return qjsl;
    }

    public void setQjsl(Short qjsl) {
        this.qjsl = qjsl;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp == null ? null : tp.trim();
    }

    public Short getTpsl() {
        return tpsl;
    }

    public void setTpsl(Short tpsl) {
        this.tpsl = tpsl;
    }

    public Short getLjsl() {
        return ljsl;
    }

    public void setLjsl(Short ljsl) {
        this.ljsl = ljsl;
    }

    public Short getBzsl() {
        return bzsl;
    }

    public void setBzsl(Short bzsl) {
        this.bzsl = bzsl;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public String getCcid() {
        return ccid;
    }

    public void setCcid(String ccid) {
        this.ccid = ccid == null ? null : ccid.trim();
    }

    public String getLjid() {
        return ljid;
    }

    public void setLjid(String ljid) {
        this.ljid = ljid == null ? null : ljid.trim();
    }

    public String getXhdid() {
        return xhdid;
    }

    public void setXhdid(String xhdid) {
        this.xhdid = xhdid == null ? null : xhdid.trim();
    }

    public String getLjgwid() {
        return ljgwid;
    }

    public void setLjgwid(String ljgwid) {
        this.ljgwid = ljgwid == null ? null : ljgwid.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
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

    public String getZptype() {
        return zptype;
    }

    public void setZptype(String zptype) {
        this.zptype = zptype == null ? null : zptype.trim();
    }

    public Short getXzpriority() {
        return xzpriority;
    }

    public void setXzpriority(Short xzpriority) {
        this.xzpriority = xzpriority;
    }

    public Short getTbljsl() {
        return tbljsl;
    }

    public void setTbljsl(Short tbljsl) {
        this.tbljsl = tbljsl;
    }

    public Short getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(Short serialnum) {
        this.serialnum = serialnum;
    }

    public Short getSerialnummove() {
        return serialnummove;
    }

    public void setSerialnummove(Short serialnummove) {
        this.serialnummove = serialnummove;
    }

    public Short getSerialnumold() {
        return serialnumold;
    }

    public void setSerialnumold(Short serialnumold) {
        this.serialnumold = serialnumold;
    }

    public String getYhtype() {
        return yhtype;
    }

    public void setYhtype(String yhtype) {
        this.yhtype = yhtype == null ? null : yhtype.trim();
    }

    public String getHk() {
        return hk;
    }

    public void setHk(String hk) {
        this.hk = hk == null ? null : hk.trim();
    }
}