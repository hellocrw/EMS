package crw.bishe.teamup01.entity;

import javax.persistence.*;

@Table(name = "unit_info")
public class UnitInfo {
    @Id
    private Integer id;

    @Column(name = "unit_type")
    private String unitType;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "unifie_social_credit_code")
    private Integer unifieSocialCreditCode;

    @Column(name = "industry_unit")
    private String industryUnit;

    @Column(name = "unit_area")
    private String unitArea;

    @Column(name = "unit_address")
    private String unitAddress;

    @Column(name = "unit_contactor")
    private String unitContactor;

    @Column(name = "unit_tel")
    private String unitTel;

    @Column(name = "unit_email")
    private String unitEmail;

    @Column(name = "unit_postcode")
    private Integer unitPostcode;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return unit_type
     */
    public String getUnitType() {
        return unitType;
    }

    /**
     * @param unitType
     */
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    /**
     * @return unit_name
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param unitName
     */
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    /**
     * @return unifie_social_credit_code
     */
    public Integer getUnifieSocialCreditCode() {
        return unifieSocialCreditCode;
    }

    /**
     * @param unifieSocialCreditCode
     */
    public void setUnifieSocialCreditCode(Integer unifieSocialCreditCode) {
        this.unifieSocialCreditCode = unifieSocialCreditCode;
    }

    /**
     * @return industry_unit
     */
    public String getIndustryUnit() {
        return industryUnit;
    }

    /**
     * @param industryUnit
     */
    public void setIndustryUnit(String industryUnit) {
        this.industryUnit = industryUnit;
    }

    /**
     * @return unit_area
     */
    public String getUnitArea() {
        return unitArea;
    }

    /**
     * @param unitArea
     */
    public void setUnitArea(String unitArea) {
        this.unitArea = unitArea;
    }

    /**
     * @return unit_address
     */
    public String getUnitAddress() {
        return unitAddress;
    }

    /**
     * @param unitAddress
     */
    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    /**
     * @return unit_contactor
     */
    public String getUnitContactor() {
        return unitContactor;
    }

    /**
     * @param unitContactor
     */
    public void setUnitContactor(String unitContactor) {
        this.unitContactor = unitContactor;
    }

    /**
     * @return unit_tel
     */
    public String getUnitTel() {
        return unitTel;
    }

    /**
     * @param unitTel
     */
    public void setUnitTel(String unitTel) {
        this.unitTel = unitTel;
    }

    /**
     * @return unit_email
     */
    public String getUnitEmail() {
        return unitEmail;
    }

    /**
     * @param unitEmail
     */
    public void setUnitEmail(String unitEmail) {
        this.unitEmail = unitEmail;
    }

    /**
     * @return unit_postcode
     */
    public Integer getUnitPostcode() {
        return unitPostcode;
    }

    /**
     * @param unitPostcode
     */
    public void setUnitPostcode(Integer unitPostcode) {
        this.unitPostcode = unitPostcode;
    }
}