package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_info")
public class JobInfo {
    /**
     * 序号
     */
    @Id
    private Integer id;

    /**
     * 就业信息编号
     */
    @Column(name = "employ_infor_no")
    private String employInforNo;

    /**
     * 招聘公司/企业
     */
    @Column(name = "corporate_name")
    private String corporateName;

    /**
     * 公司简介
     */
    @Column(name = "company_profile")
    private String companyProfile;

    /**
     * 招聘岗位
     */
    @Column(name = "recruitment_post")
    private String recruitmentPost;

    /**
     * 职位要求
     */
    @Column(name = "job_requirements")
    private String jobRequirements;

    /**
     * 工作地点
     */
    @Column(name = "working_place")
    private String workingPlace;

    /**
     * 招聘人数
     */
    @Column(name = "recruiting_numbers")
    private Integer recruitingNumbers;

    /**
     * 招聘时间
     */
    @Column(name = "recruiting_time")
    private Date recruitingTime;

    /**
     * 招聘地点
     */
    @Column(name = "recruiting_address")
    private String recruitingAddress;

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
     * 获取就业信息编号
     *
     * @return employ_infor_no - 就业信息编号
     */
    public String getEmployInforNo() {
        return employInforNo;
    }

    /**
     * 设置就业信息编号
     *
     * @param employInforNo 就业信息编号
     */
    public void setEmployInforNo(String employInforNo) {
        this.employInforNo = employInforNo;
    }

    /**
     * 获取招聘公司/企业
     *
     * @return corporate_name - 招聘公司/企业
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * 设置招聘公司/企业
     *
     * @param corporateName 招聘公司/企业
     */
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    /**
     * 获取公司简介
     *
     * @return company_profile - 公司简介
     */
    public String getCompanyProfile() {
        return companyProfile;
    }

    /**
     * 设置公司简介
     *
     * @param companyProfile 公司简介
     */
    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    /**
     * 获取招聘岗位
     *
     * @return recruitment_post - 招聘岗位
     */
    public String getRecruitmentPost() {
        return recruitmentPost;
    }

    /**
     * 设置招聘岗位
     *
     * @param recruitmentPost 招聘岗位
     */
    public void setRecruitmentPost(String recruitmentPost) {
        this.recruitmentPost = recruitmentPost;
    }

    /**
     * 获取职位要求
     *
     * @return job_requirements - 职位要求
     */
    public String getJobRequirements() {
        return jobRequirements;
    }

    /**
     * 设置职位要求
     *
     * @param jobRequirements 职位要求
     */
    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
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
     * 获取招聘人数
     *
     * @return recruiting_numbers - 招聘人数
     */
    public Integer getRecruitingNumbers() {
        return recruitingNumbers;
    }

    /**
     * 设置招聘人数
     *
     * @param recruitingNumbers 招聘人数
     */
    public void setRecruitingNumbers(Integer recruitingNumbers) {
        this.recruitingNumbers = recruitingNumbers;
    }

    /**
     * 获取招聘时间
     *
     * @return recruiting_time - 招聘时间
     */
    public Date getRecruitingTime() {
        return recruitingTime;
    }

    /**
     * 设置招聘时间
     *
     * @param recruitingTime 招聘时间
     */
    public void setRecruitingTime(Date recruitingTime) {
        this.recruitingTime = recruitingTime;
    }

    /**
     * 获取招聘地点
     *
     * @return recruiting_address - 招聘地点
     */
    public String getRecruitingAddress() {
        return recruitingAddress;
    }

    /**
     * 设置招聘地点
     *
     * @param recruitingAddress 招聘地点
     */
    public void setRecruitingAddress(String recruitingAddress) {
        this.recruitingAddress = recruitingAddress;
    }
}