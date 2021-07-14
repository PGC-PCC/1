package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class FisPool implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String fanlage2;

    private String kanr;

    private String spj;

    private Date rfidtime;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String execid;

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

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public String getKanr() {
        return kanr;
    }

    public void setKanr(String kanr) {
        this.kanr = kanr == null ? null : kanr.trim();
    }

    public String getSpj() {
        return spj;
    }

    public void setSpj(String spj) {
        this.spj = spj == null ? null : spj.trim();
    }

    public Date getRfidtime() {
        return rfidtime;
    }

    public void setRfidtime(Date rfidtime) {
        this.rfidtime = rfidtime;
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
}