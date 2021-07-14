package com.runbom.demo.model;

import java.io.Serializable;
import java.util.Date;

public class Gw implements Serializable {
    private String id;

    private String documentid;

    private Short isdel;

    private String werks;

    private String site;

    private Short batch;

    private String creatorid;

    private String creatorname;

    private Date createtime;

    private String modifierid;

    private String modifiername;

    private Date modifytime;

    private String fanlage2;

    private Short serialnum;

    private String band;

    private String fzsite;

    private String pmodifierid;

    private String pmodifiername;

    private Date pmodifytime;

    private Short serialnum2;

    private Short ishand;

    private String bandfanlageid;

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

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
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

    public String getFanlage2() {
        return fanlage2;
    }

    public void setFanlage2(String fanlage2) {
        this.fanlage2 = fanlage2 == null ? null : fanlage2.trim();
    }

    public Short getSerialnum() {
        return serialnum;
    }

    public void setSerialnum(Short serialnum) {
        this.serialnum = serialnum;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band == null ? null : band.trim();
    }

    public String getFzsite() {
        return fzsite;
    }

    public void setFzsite(String fzsite) {
        this.fzsite = fzsite == null ? null : fzsite.trim();
    }

    public String getPmodifierid() {
        return pmodifierid;
    }

    public void setPmodifierid(String pmodifierid) {
        this.pmodifierid = pmodifierid == null ? null : pmodifierid.trim();
    }

    public String getPmodifiername() {
        return pmodifiername;
    }

    public void setPmodifiername(String pmodifiername) {
        this.pmodifiername = pmodifiername == null ? null : pmodifiername.trim();
    }

    public Date getPmodifytime() {
        return pmodifytime;
    }

    public void setPmodifytime(Date pmodifytime) {
        this.pmodifytime = pmodifytime;
    }

    public Short getSerialnum2() {
        return serialnum2;
    }

    public void setSerialnum2(Short serialnum2) {
        this.serialnum2 = serialnum2;
    }

    public Short getIshand() {
        return ishand;
    }

    public void setIshand(Short ishand) {
        this.ishand = ishand;
    }

    public String getBandfanlageid() {
        return bandfanlageid;
    }

    public void setBandfanlageid(String bandfanlageid) {
        this.bandfanlageid = bandfanlageid == null ? null : bandfanlageid.trim();
    }
}