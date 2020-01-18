package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "unit_info")
public class UnitInfo {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    /**
     * 单位类型
     */
    @Column(name = "unit_type")
    private String unitType;

    /**
     * 就业单位名称
     */
    @Column(name = "unit_name")
    private String unitName;

    /**
     * 统一社会信用代码
     */
    @Column(name = "unifie_social_credit_code")
    private Integer unifieSocialCreditCode;

    /**
     * 单位所属行业
     */
    @Column(name = "industry_unit")
    private String industryUnit;

    /**
     * 单位所属地区
     */
    @Column(name = "unit_area")
    private String unitArea;

    /**
     * 单位详细地址
     */
    @Column(name = "unit_address")
    private String unitAddress;

    /**
     * 单位联系人
     */
    @Column(name = "unit_contactor")
    private String unitContactor;

    /**
     * 单位联系电话
     */
    @Column(name = "unit_tel")
    private String unitTel;

    /**
     * 单位联系邮箱
     */
    @Column(name = "unit_email")
    private String unitEmail;

    /**
     * 单位邮编
     */
    @Column(name = "unit_postcode")
    private Integer unitPostcode;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取单位类型
     *
     * @return unit_type - 单位类型
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * 设置单位类型
     *
     * @param unitType 单位类型
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * 获取就业单位名称
     *
     * @return unit_name - 就业单位名称
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * 设置就业单位名称
     *
     * @param unitName 就业单位名称
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * 获取统一社会信用代码
     *
     * @return unifie_social_credit_code - 统一社会信用代码
     */
    public Integer getUnifieSocialCreditCode() {
        return unifieSocialCreditCode;
    }

    /**
     * 设置统一社会信用代码
     *
     * @param unifieSocialCreditCode 统一社会信用代码
     */
    public void setUnifieSocialCreditCode(Integer unifieSocialCreditCode) {
        this.unifieSocialCreditCode = unifieSocialCreditCode;
    }

    /**
     * 获取单位所属行业
     *
     * @return industry_unit - 单位所属行业
     */
    public String getIndustryUnit() {
        return industryUnit;
    }

    /**
     * 设置单位所属行业
     *
     * @param industryUnit 单位所属行业
     */
    public void setIndustryUnit(String industryUnit) {
        this.industryUnit = industryUnit;
    }

    /**
     * 获取单位所属地区
     *
     * @return unit_area - 单位所属地区
     */
    public String getUnitArea() {
        return unitArea;
    }

    /**
     * 设置单位所属地区
     *
     * @param unitArea 单位所属地区
     */
    public void setUnitArea(String unitArea) {
        this.unitArea = unitArea;
    }

    /**
     * 获取单位详细地址
     *
     * @return unit_address - 单位详细地址
     */
    public String getUnitAddress() {
        return unitAddress;
    }

    /**
     * 设置单位详细地址
     *
     * @param unitAddress 单位详细地址
     */
    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    /**
     * 获取单位联系人
     *
     * @return unit_contactor - 单位联系人
     */
    public String getUnitContactor() {
        return unitContactor;
    }

    /**
     * 设置单位联系人
     *
     * @param unitContactor 单位联系人
     */
    public void setUnitContactor(String unitContactor) {
        this.unitContactor = unitContactor;
    }

    /**
     * 获取单位联系电话
     *
     * @return unit_tel - 单位联系电话
     */
    public String getUnitTel() {
        return unitTel;
    }

    /**
     * 设置单位联系电话
     *
     * @param unitTel 单位联系电话
     */
    public void setUnitTel(String unitTel) {
        this.unitTel = unitTel;
    }

    /**
     * 获取单位联系邮箱
     *
     * @return unit_email - 单位联系邮箱
     */
    public String getUnitEmail() {
        return unitEmail;
    }

    /**
     * 设置单位联系邮箱
     *
     * @param unitEmail 单位联系邮箱
     */
    public void setUnitEmail(String unitEmail) {
        this.unitEmail = unitEmail;
    }

    /**
     * 获取单位邮编
     *
     * @return unit_postcode - 单位邮编
     */
    public Integer getUnitPostcode() {
        return unitPostcode;
    }

    /**
     * 设置单位邮编
     *
     * @param unitPostcode 单位邮编
     */
    public void setUnitPostcode(Integer unitPostcode) {
        this.unitPostcode = unitPostcode;
    }
}