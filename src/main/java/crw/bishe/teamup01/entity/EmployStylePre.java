package crw.bishe.teamup01.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "employ_style_pre")
public class EmployStylePre {
    @Id
    private Integer id;

    @Column(name = "stu_no")
    private Integer stuNo;

    @Column(name = "stu_name")
    private String stuName;

    @Column(name = "graduation_year")
    private Date graduationYear;

    @Column(name = "job_title")
    private String jobTitle;

    private String motto;

    private String picurl;

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
     * @return graduation_year
     */
    public Date getGraduationYear() {
        return graduationYear;
    }

    /**
     * @param graduationYear
     */
    public void setGraduationYear(Date graduationYear) {
        this.graduationYear = graduationYear;
    }

    /**
     * @return job_title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return motto
     */
    public String getMotto() {
        return motto;
    }

    /**
     * @param motto
     */
    public void setMotto(String motto) {
        this.motto = motto;
    }

    /**
     * @return picurl
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * @param picurl
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}