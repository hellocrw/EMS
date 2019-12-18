package crw.bishe.teamup01.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "stu_employ_info")
public class StuEmployInfo {
    @Id
    private Integer id;

    @Column(name = "stu_no")
    private Integer stuNo;

    @Column(name = "stu_name")
    private String stuName;

    @Column(name = "unit_name")
    private String unitName;

    @Column(name = "unifie_social_credit_code")
    private Integer unifieSocialCreditCode;

    @Column(name = "job_name")
    private String jobName;

    @Column(name = "occupational_type")
    private String occupationalType;

    private Integer pay;

    @Column(name = "contract_time")
    private Date contractTime;

    private Integer probation;

    @Column(name = "probation_start_time")
    private Date probationStartTime;

    @Column(name = "working_place")
    private String workingPlace;

    private Boolean relevance;

    @Column(name = "is_employ_difficulties")
    private Boolean isEmployDifficulties;

    @Column(name = "is_employ")
    private Boolean isEmploy;

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
     * @return stu_no
     */
    public Integer getStuNo() {
        return stuNo;
    }

    /**
     * @param stuNo
     */
    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    /**
     * @return stu_name
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
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
     * @return job_name
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * @param jobName
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * @return occupational_type
     */
    public String getOccupationalType() {
        return occupationalType;
    }

    /**
     * @param occupationalType
     */
    public void setOccupationalType(String occupationalType) {
        this.occupationalType = occupationalType;
    }

    /**
     * @return pay
     */
    public Integer getPay() {
        return pay;
    }

    /**
     * @param pay
     */
    public void setPay(Integer pay) {
        this.pay = pay;
    }

    /**
     * @return contract_time
     */
    public Date getContractTime() {
        return contractTime;
    }

    /**
     * @param contractTime
     */
    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    /**
     * @return probation
     */
    public Integer getProbation() {
        return probation;
    }

    /**
     * @param probation
     */
    public void setProbation(Integer probation) {
        this.probation = probation;
    }

    /**
     * @return probation_start_time
     */
    public Date getProbationStartTime() {
        return probationStartTime;
    }

    /**
     * @param probationStartTime
     */
    public void setProbationStartTime(Date probationStartTime) {
        this.probationStartTime = probationStartTime;
    }

    /**
     * @return working_place
     */
    public String getWorkingPlace() {
        return workingPlace;
    }

    /**
     * @param workingPlace
     */
    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    /**
     * @return relevance
     */
    public Boolean getRelevance() {
        return relevance;
    }

    /**
     * @param relevance
     */
    public void setRelevance(Boolean relevance) {
        this.relevance = relevance;
    }

    /**
     * @return is_employ_difficulties
     */
    public Boolean getIsEmployDifficulties() {
        return isEmployDifficulties;
    }

    /**
     * @param isEmployDifficulties
     */
    public void setIsEmployDifficulties(Boolean isEmployDifficulties) {
        this.isEmployDifficulties = isEmployDifficulties;
    }

    /**
     * @return is_employ
     */
    public Boolean getIsEmploy() {
        return isEmploy;
    }

    /**
     * @param isEmploy
     */
    public void setIsEmploy(Boolean isEmploy) {
        this.isEmploy = isEmploy;
    }
}