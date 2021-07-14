package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Nkanban implements Serializable {
    private String kbno;

    private String documentid;

    private Short isdel;

    private String type;

    private String number1;

    private String werks;

    private String site;

    private String path;

    private Date tositetime;

    private String spj;

    private String kanr;

    private Short quantity;

    private String requestuser;

    private Date requesttime;

    private Date todate;

    private Short kbstatus;

    private String kbexecption;

    private Date getdate;

    private String fromnumer;

    private String enumber1;

    private String ewerks;

    private String deliverySite;

    private String esite;

    private Short equantity;

    private String ebath;

    private String epath;

    private Date edate;

    private Date etime;

    private Short status;

    private String exeception;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String execid;

    private Short serialnum;

    private String pdeliverySite;

    private Short serialnummove;

    private String ljgwid;

    private Short serialnumold;

    private Short countcanuse;

    private String jbarcode;

    private String matsort;

    private String fanlage2;

    private Date tositetimeearlyiest;

    private static final long serialVersionUID = 1L;

    public String getKbno() {
        return kbno;
    }

    public void setKbno(String kbno) {
        this.kbno = kbno == null ? null : kbno.trim();
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1 == null ? null : number1.trim();
    }

    public String getWerks() {
        return werks;
    }

    public void setWerks(String werks) {
        this.werks = werks == null ? null : werks.trim();
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public Date getTositetime() {
        return tositetime;
    }

    public void setTositetime(Date tositetime) {
        this.tositetime = tositetime;
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

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public String getRequestuser() {
        return requestuser;
    }

    public void setRequestuser(String requestuser) {
        this.requestuser = requestuser == null ? null : requestuser.trim();
    }

    public Date getRequesttime() {
        return requesttime;
    }

    public void setRequesttime(Date requesttime) {
        this.requesttime = requesttime;
    }

    public Date getTodate() {
        return todate;
    }

    public void setTodate(Date todate) {
        this.todate = todate;
    }

    public Short getKbstatus() {
        return kbstatus;
    }

    public void setKbstatus(Short kbstatus) {
        this.kbstatus = kbstatus;
    }

    public String getKbexecption() {
        return kbexecption;
    }

    public void setKbexecption(String kbexecption) {
        this.kbexecption = kbexecption == null ? null : kbexecption.trim();
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public String getFromnumer() {
        return fromnumer;
    }

    public void setFromnumer(String fromnumer) {
        this.fromnumer = fromnumer == null ? null : fromnumer.trim();
    }

    public String getEnumber1() {
        return enumber1;
    }

    public void setEnumber1(String enumber1) {
        this.enumber1 = enumber1 == null ? null : enumber1.trim();
    }

    public String getEwerks() {
        return ewerks;
    }

    public void setEwerks(String ewerks) {
        this.ewerks = ewerks == null ? null : ewerks.trim();
    }

    public String getDeliverySite() {
        return deliverySite;
    }

    public void setDeliverySite(String deliverySite) {
        this.deliverySite = deliverySite == null ? null : deliverySite.trim();
    }

    public String getEsite() {
        return esite;
    }

    public void setEsite(String esite) {
        this.esite = esite == null ? null : esite.trim();
    }

    public Short getEquantity() {
        return equantity;
    }

    public void setEquantity(Short equantity) {
        this.equantity = equantity;
    }

    public String getEbath() {
        return ebath;
    }

    public void setEbath(String ebath) {
        this.ebath = ebath == null ? null : ebath.trim();
    }

    public String getEpath() {
        return epath;
    }

    public void setEpath(String epath) {
        this.epath = epath == null ? null : epath.trim();
    }

    public Date getEdate() {
        return edate;
    }

    public void setEdate(Date edate) {
        this.edate = edate;
    }

    public Date getEtime() {
        return etime;
    }

    public void setEtime(Date etime) {
        this.etime = etime;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getExeception() {
        return exeception;
    }

    public void setExeception(String exeception) {
        this.exeception = exeception == null ? null : exeception.trim();
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

    public String getExecid() {
        return execid;
    }

    public void setExecid(String execid) {
        this.execid = execid == null ? null : execid.trim();
    }

    public Short getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(Short serialnum) {
        this.serialnum = serialnum;
    }

    public String getPdeliverySite() {
        return pdeliverySite;
    }

    public void setPdeliverySite(String pdeliverySite) {
        this.pdeliverySite = pdeliverySite == null ? null : pdeliverySite.trim();
    }

    public Short getSerialnummove() {
        return serialnummove;
    }

    public void setSerialnummove(Short serialnummove) {
        this.serialnummove = serialnummove;
    }

    public String getLjgwid() {
        return ljgwid;
    }

    public void setLjgwid(String ljgwid) {
        this.ljgwid = ljgwid == null ? null : ljgwid.trim();
    }

    public Short getSerialnumold() {
        return serialnumold;
    }

    public void setSerialnumold(Short serialnumold) {
        this.serialnumold = serialnumold;
    }

    public Short getCountcanuse() {
        return countcanuse;
    }

    public void setCountcanuse(Short countcanuse) {
        this.countcanuse = countcanuse;
    }

    public String getJbarcode() {
        return jbarcode;
    }

    public void setJbarcode(String jbarcode) {
        this.jbarcode = jbarcode == null ? null : jbarcode.trim();
    }

    public String getMatsort() {
        return matsort;
    }

    public void setMatsort(String matsort) {
        this.matsort = matsort == null ? null : matsort.trim();
    }

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public Date getTositetimeearlyiest() {
        return tositetimeearlyiest;
    }

    public void setTositetimeearlyiest(Date tositetimeearlyiest) {
        this.tositetimeearlyiest = tositetimeearlyiest;
    }
}