package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class LjgwCar implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String cx1;

    private String zptype;

    private Short xzpriority;

    private Short ljsl;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

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

    public String getCx1() {
        return cx1;
    }

    public void setCx1(String cx1) {
        this.cx1 = cx1 == null ? null : cx1.trim();
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

    public Short getLjsl() {
        return ljsl;
    }

    public void setLjsl(Short ljsl) {
        this.ljsl = ljsl;
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
}