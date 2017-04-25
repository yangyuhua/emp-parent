package org.emp.web.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author yyhua
 * @Description 用审计实体的父类
 * @since 2015-07-15
 */
public class BaseAuditEntity extends BaseEntity implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 区县代码
     */
    private String QXDM;

    /**
     * 区县名称
     */
    private String QXMC;

    /**
     * 登记机构
     */
    private String DJJG;

    /**
     * 创建人Id
     */
    private Long fCreatorId;

    /**
     * 创建时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date fCreateTime;

    /**
     * 创建人登录名
     */
    private String fCreatorLoginName;

    /**
     * 创建人姓名
     */
    private String fCreatorName;

    /**
     * 创建ip
     */
    private String fCreatorIp;

    /**
     * 更新人id
     */
    private Long fLastUpdaterId;

    /**
     * 更新时间
     */
    @Temporal(TemporalType.TIMESTAMP)
    private Date fLastUpdateTime;

    /**
     * 更新人登录名
     */
    private String fLastUpdaterLoginName;

    /**
     * 更新人姓名
     */
    private String fLastUpdaterName;

    /**
     * 更新ip
     */
    private String fLastUpdaterIp;

    @PrePersist
    public void createAuditInfo() {
        audit(true);
    }

    @PreUpdate
    public void updateAuditInfo() {
        audit(false);
    }

    /**
     * 记录创建或更新时设置审计信息
     *
     * @param isCreate
     */
    protected void audit(boolean isCreate) {

    }

    public String getQXDM() {
        return QXDM;
    }

    public void setQXDM(String qXDM) {
        QXDM = qXDM;
    }

    public Long getfCreatorId() {
        return fCreatorId;
    }

    public void setfCreatorId(Long fCreatorId) {
        this.fCreatorId = fCreatorId;
    }

    public Long getfLastUpdaterId() {
        return fLastUpdaterId;
    }

    public void setfLastUpdaterId(Long fLastUpdaterId) {
        this.fLastUpdaterId = fLastUpdaterId;
    }

    public Date getfCreateTime() {
        return fCreateTime;
    }

    public void setfCreateTime(Date fCreateTime) {
        this.fCreateTime = fCreateTime;
    }

    public String getfCreatorLoginName() {
        return fCreatorLoginName;
    }

    public void setfCreatorLoginName(String fCreatorLoginName) {
        this.fCreatorLoginName = fCreatorLoginName;
    }

    // public String getfCreatorName() throws IllegalAccessException,
    // NativeException {
    // return LoadDll.DeCode(this.fCreatorName);
    // }
    //
    // public void setfCreatorName(String fCreatorName) throws
    // IllegalAccessException,
    // NativeException {
    // String value = fCreatorName;
    // this.fCreatorName = LoadDll.EnCode(value);
    // }

    public String getfCreatorName() {
        return fCreatorName;
    }

    public void setfCreatorName(String fCreatorName) {
        this.fCreatorName = fCreatorName;
    }

    public String getfCreatorIp() {
        return fCreatorIp;
    }

    public void setfCreatorIp(String fCreatorIp) {
        this.fCreatorIp = fCreatorIp;
    }

    public Date getfLastUpdateTime() {
        return fLastUpdateTime;
    }

    public void setfLastUpdateTime(Date fLastUpdateTime) {
        this.fLastUpdateTime = fLastUpdateTime;
    }

    public String getfLastUpdaterLoginName() {
        return fLastUpdaterLoginName;
    }

    public void setfLastUpdaterLoginName(String fLastUpdaterLoginName) {
        this.fLastUpdaterLoginName = fLastUpdaterLoginName;
    }

    public String getfLastUpdaterName() {
        return fLastUpdaterName;
    }

    public void setfLastUpdaterName(String fLastUpdaterName) {
        this.fLastUpdaterName = fLastUpdaterName;
    }

    public String getfLastUpdaterIp() {
        return fLastUpdaterIp;
    }

    public void setfLastUpdaterIp(String fLastUpdaterIp) {
        this.fLastUpdaterIp = fLastUpdaterIp;
    }

    public String getQXMC() {
        return QXMC;
    }

    public void setQXMC(String qXMC) {
        QXMC = qXMC;
    }

    public String getDJJG() {
        return DJJG;
    }

    public void setDJJG(String dJJG) {
        DJJG = dJJG;
    }

}
