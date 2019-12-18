package crw.bishe.teamup01.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "job_info")
public class JobInfo {
    @Id
    private Integer id;

    @Column(name = "employ_infor_no")
    private String employInforNo;

    @Column(name = "corporate_name")
    private String corporateName;

    @Column(name = "company_profile")
    private String companyProfile;

    @Column(name = "recruitment_post")
    private String recruitmentPost;

    @Column(name = "job_requirements")
    private String jobRequirements;

    @Column(name = "working_place")
    private String workingPlace;

    @Column(name = "recruiting_numbers")
    private Integer recruitingNumbers;

    @Column(name = "recruiting_time")
    private Date recruitingTime;

    @Column(name = "recruiting_address")
    private String recruitingAddress;

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
     * @return employ_infor_no
     */
    public String getEmployInforNo() {
        return employInforNo;
    }

    /**
     * @param employInforNo
     */
    public void setEmployInforNo(String employInforNo) {
        this.employInforNo = employInforNo;
    }

    /**
     * @return corporate_name
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * @param corporateName
     */
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    /**
     * @return company_profile
     */
    public String getCompanyProfile() {
        return companyProfile;
    }

    /**
     * @param companyProfile
     */
    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    /**
     * @return recruitment_post
     */
    public String getRecruitmentPost() {
        return recruitmentPost;
    }

    /**
     * @param recruitmentPost
     */
    public void setRecruitmentPost(String recruitmentPost) {
        this.recruitmentPost = recruitmentPost;
    }

    /**
     * @return job_requirements
     */
    public String getJobRequirements() {
        return jobRequirements;
    }

    /**
     * @param jobRequirements
     */
    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
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
     * @return recruiting_numbers
     */
    public Integer getRecruitingNumbers() {
        return recruitingNumbers;
    }

    /**
     * @param recruitingNumbers
     */
    public void setRecruitingNumbers(Integer recruitingNumbers) {
        this.recruitingNumbers = recruitingNumbers;
    }

    /**
     * @return recruiting_time
     */
    public Date getRecruitingTime() {
        return recruitingTime;
    }

    /**
     * @param recruitingTime
     */
    public void setRecruitingTime(Date recruitingTime) {
        this.recruitingTime = recruitingTime;
    }

    /**
     * @return recruiting_address
     */
    public String getRecruitingAddress() {
        return recruitingAddress;
    }

    /**
     * @param recruitingAddress
     */
    public void setRecruitingAddress(String recruitingAddress) {
        this.recruitingAddress = recruitingAddress;
    }
}