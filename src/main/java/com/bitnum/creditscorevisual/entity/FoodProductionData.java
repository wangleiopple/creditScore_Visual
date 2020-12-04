package com.bitnum.creditscorevisual.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FoodProductionData {
    @Id
    @GeneratedValue
    private Long  id;
    /**
     * 生产者名称
     */
    private String  productionName;
    /**
     * 社会信用代码
     */
    private String  creditCode;
    /**
     * 发定代表人/负责人
     */
    private  String principal;
    /**
     * 住所
     */
    private String address;
    /**
     * 许可证编号
     */
    private String permitNumber;
    /**
     * 日常监督管理机构
     */
    private String agencies;
    /**
     * 日常监督管理人员
     */
    private String agenciesMan;
    /**
     * 发证机关
     */
    private String  certificateOrgan;
    /**
     * 签发人
     */
    private String signer;
    /**
     * 发证日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date certificateDate;
    /**
     * 有效期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date validityDate;
    /**
     * 办理状态
     */
    private String transactState;
    /**
     * 申请类型
     */
    private String applicationType;
    /**
     * 联系人
     */
    private String contact;
    /**
     * 联系电话
     */
    private String  contactNumber;
    /**
     * 所属区域
     */
    private String area;
    /**
     * 生产地址
     */
    private String productionAddress;
    /**
     * 备注
     */
    private String remark;
    /**
     * 外设仓库地址
     */
    private String LocationWarehouse;

    /**
     * 食品/食品添加剂类型
     */
    private String foodType;
    /**
     * 类别名称
     */
    private String  typeName;
    /**
     * 产品明细
     */
    @Column(length = 2000)
    private String productDetail;
    /**
     * 类别编号
     */
    private String typeNumber;
    /**
     * qylsh
     */
    private String qylsh;
    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 成立日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date setDate;
    /**
     * 评级年度
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date ratingYear;
    /**
     * 年检频次范围
     */
    private String  frequency;
    /**
     * 风险等级
     */
    private String riskLevel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductionName() {
        return productionName;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPermitNumber() {
        return permitNumber;
    }

    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    public String getAgencies() {
        return agencies;
    }

    public void setAgencies(String agencies) {
        this.agencies = agencies;
    }

    public String getAgenciesMan() {
        return agenciesMan;
    }

    public void setAgenciesMan(String agenciesMan) {
        this.agenciesMan = agenciesMan;
    }

    public String getCertificateOrgan() {
        return certificateOrgan;
    }

    public void setCertificateOrgan(String certificateOrgan) {
        this.certificateOrgan = certificateOrgan;
    }

    public String getSigner() {
        return signer;
    }

    public void setSigner(String signer) {
        this.signer = signer;
    }

    public Date getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(Date certificateDate) {
        this.certificateDate = certificateDate;
    }

    public Date getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Date validityDate) {
        this.validityDate = validityDate;
    }

    public String getTransactState() {
        return transactState;
    }

    public void setTransactState(String transactState) {
        this.transactState = transactState;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getProductionAddress() {
        return productionAddress;
    }

    public void setProductionAddress(String productionAddress) {
        this.productionAddress = productionAddress;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getLocationWarehouse() {
        return LocationWarehouse;
    }

    public void setLocationWarehouse(String locationWarehouse) {
        LocationWarehouse = locationWarehouse;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public String getQylsh() {
        return qylsh;
    }

    public void setQylsh(String qylsh) {
        this.qylsh = qylsh;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public Date getSetDate() {
        return setDate;
    }

    public void setSetDate(Date setDate) {
        this.setDate = setDate;
    }

    public Date getRatingYear() {
        return ratingYear;
    }

    public void setRatingYear(Date ratingYear) {
        this.ratingYear = ratingYear;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }
}
