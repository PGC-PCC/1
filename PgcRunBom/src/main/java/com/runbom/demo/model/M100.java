package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class M100 implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String spj;

    private String kanr;

    private String werk;

    private String fanlage2;

    private String cartype;

    private String chassis;

    private Short serial;

    private Date m100timr;

    private Date lendtime;

    private String execid;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private Short mark;

    private String mj;

    private String cckanr;

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

    public String getWerk() {
        return werk;
    }

    public void setWerk(String werk) {
        this.werk = werk == null ? null : werk.trim();
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

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis == null ? null : chassis.trim();
    }

    public Short getSerial() {
        return serial;
    }

    public void setSerial(Short serial) {
        this.serial = serial;
    }

    public Date getM100timr() {
        return m100timr;
    }

    public void setM100timr(Date m100timr) {
        this.m100timr = m100timr;
    }

    public Date getLendtime() {
        return lendtime;
    }

    public void setLendtime(Date lendtime) {
        this.lendtime = lendtime;
    }

    public String getExecid() {
        return execid;
    }

    public void setExecid(String execid) {
        this.execid = execid == null ? null : execid.trim();
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

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public String getMj() {
        return mj;
    }

    public void setMj(String mj) {
        this.mj = mj == null ? null : mj.trim();
    }

    public String getCckanr() {
        return cckanr;
    }

    public void setCckanr(String cckanr) {
        this.cckanr = cckanr == null ? null : cckanr.trim();
    }
}