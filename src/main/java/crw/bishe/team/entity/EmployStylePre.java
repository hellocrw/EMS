package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "employ_style_pre")
public class EmployStylePre {
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
     * 毕业年份
     */
    @Column(name = "graduation_year")
    private Date graduationYear;

    /**
     * 职位名称
     */
    @Column(name = "job_title")
    private String jobTitle;

    /**
     * 座右铭
     */
    private String motto;

    /**
     * 图片地址
     */
    private String picurl;

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
     * 获取毕业年份
     *
     * @return graduation_year - 毕业年份
     */
    public Date getGraduationYear() {
        return graduationYear;
    }

    /**
     * 设置毕业年份
     *
     * @param graduationYear 毕业年份
     */
    public void setGraduationYear(Date graduationYear) {
        this.graduationYear = graduationYear;
    }

    /**
     * 获取职位名称
     *
     * @return job_title - 职位名称
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 设置职位名称
     *
     * @param jobTitle 职位名称
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 获取座右铭
     *
     * @return motto - 座右铭
     */
    public String getMotto() {
        return motto;
    }

    /**
     * 设置座右铭
     *
     * @param motto 座右铭
     */
    public void setMotto(String motto) {
        this.motto = motto;
    }

    /**
     * 获取图片地址
     *
     * @return picurl - 图片地址
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * 设置图片地址
     *
     * @param picurl 图片地址
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }
}