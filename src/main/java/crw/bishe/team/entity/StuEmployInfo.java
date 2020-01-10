package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "stu_employ_info")
public class StuEmployInfo {
    /**
     * 序号
     */
    @Id
    private Integer id;

    /**
     * 学号
     */
    @Column(name = "stu_no")
    private Integer stuNo;

    /**
     * 姓名
     */
    @Column(name = "stu_name")
    private String stuName;

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
     * 岗位名称
     */
    @Column(name = "job_name")
    private String jobName;

    /**
     * 职业类型
     */
    @Column(name = "occupational_type")
    private String occupationalType;

    /**
     * 薪酬（月薪）
     */
    private Integer pay;

    /**
     * 签约时间
     */
    @Column(name = "contract_time")
    private Date contractTime;

    /**
     * 协议试用期
     */
    private Integer probation;

    /**
     * 试用期开始时间
     */
    @Column(name = "probation_start_time")
    private Date probationStartTime;

    /**
     * 工作地点
     */
    @Column(name = "working_place")
    private String workingPlace;

    /**
     * 专业与就业相关度
     */
    private Boolean relevance;

    /**
     * 是否就业困难
     */
    @Column(name = "is_employ_difficulties")
    private Boolean isEmployDifficulties;

    /**
     * 是否就业
     */
    @Column(name = "is_employ")
    private Boolean isEmploy;

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
     * 获取学号
     *
     * @return stu_no - 学号
     */
    public Integer getStuNo() {
        return stuNo;
    }

    /**
     * 设置学号
     *
     * @param stuNo 学号
     */
    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }

    /**
     * 获取姓名
     *
     * @return stu_name - 姓名
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置姓名
     *
     * @param stuName 姓名
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
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
     * 获取岗位名称
     *
     * @return job_name - 岗位名称
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * 设置岗位名称
     *
     * @param jobName 岗位名称
     */
    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * 获取职业类型
     *
     * @return occupational_type - 职业类型
     */
    public String getOccupationalType() {
        return occupationalType;
    }

    /**
     * 设置职业类型
     *
     * @param occupationalType 职业类型
     */
    public void setOccupationalType(String occupationalType) {
        this.occupationalType = occupationalType;
    }

    /**
     * 获取薪酬（月薪）
     *
     * @return pay - 薪酬（月薪）
     */
    public Integer getPay() {
        return pay;
    }

    /**
     * 设置薪酬（月薪）
     *
     * @param pay 薪酬（月薪）
     */
    public void setPay(Integer pay) {
        this.pay = pay;
    }

    /**
     * 获取签约时间
     *
     * @return contract_time - 签约时间
     */
    public Date getContractTime() {
        return contractTime;
    }

    /**
     * 设置签约时间
     *
     * @param contractTime 签约时间
     */
    public void setContractTime(Date contractTime) {
        this.contractTime = contractTime;
    }

    /**
     * 获取协议试用期
     *
     * @return probation - 协议试用期
     */
    public Integer getProbation() {
        return probation;
    }

    /**
     * 设置协议试用期
     *
     * @param probation 协议试用期
     */
    public void setProbation(Integer probation) {
        this.probation = probation;
    }

    /**
     * 获取试用期开始时间
     *
     * @return probation_start_time - 试用期开始时间
     */
    public Date getProbationStartTime() {
        return probationStartTime;
    }

    /**
     * 设置试用期开始时间
     *
     * @param probationStartTime 试用期开始时间
     */
    public void setProbationStartTime(Date probationStartTime) {
        this.probationStartTime = probationStartTime;
    }

    /**
     * 获取工作地点
     *
     * @return working_place - 工作地点
     */
    public String getWorkingPlace() {
        return workingPlace;
    }

    /**
     * 设置工作地点
     *
     * @param workingPlace 工作地点
     */
    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    /**
     * 获取专业与就业相关度
     *
     * @return relevance - 专业与就业相关度
     */
    public Boolean getRelevance() {
        return relevance;
    }

    /**
     * 设置专业与就业相关度
     *
     * @param relevance 专业与就业相关度
     */
    public void setRelevance(Boolean relevance) {
        this.relevance = relevance;
    }

    /**
     * 获取是否就业困难
     *
     * @return is_employ_difficulties - 是否就业困难
     */
    public Boolean getIsEmployDifficulties() {
        return isEmployDifficulties;
    }

    /**
     * 设置是否就业困难
     *
     * @param isEmployDifficulties 是否就业困难
     */
    public void setIsEmployDifficulties(Boolean isEmployDifficulties) {
        this.isEmployDifficulties = isEmployDifficulties;
    }

    /**
     * 获取是否就业
     *
     * @return is_employ - 是否就业
     */
    public Boolean getIsEmploy() {
        return isEmploy;
    }

    /**
     * 设置是否就业
     *
     * @param isEmploy 是否就业
     */
    public void setIsEmploy(Boolean isEmploy) {
        this.isEmploy = isEmploy;
    }
}