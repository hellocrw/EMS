package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "student_info")
public class StudentInfo {
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
     * 性别
     */
    private Boolean sex;

    /**
     * 身份证
     */
    @Column(name = "id_card")
    private Integer idCard;

    /**
     * 院系
     */
    private String department;

    /**
     * 专业
     */
    private String profession;

    /**
     * 学历
     */
    private String education;

    /**
     * 政治面貌
     */
    @Column(name = "political_status")
    private String politicalStatus;

    /**
     * 生源地
     */
    @Column(name = "biogenic_land")
    private String biogenicLand;

    /**
     * 毕业时间
     */
    @Column(name = "graduation_time")
    private Date graduationTime;

    /**
     * 个人联系电话
     */
    @Column(name = "stu_tel")
    private String stuTel;

    /**
     * 家庭联系人
     */
    @Column(name = "family_contact")
    private String familyContact;

    /**
     * 家庭电话
     */
    @Column(name = "home_tel")
    private String homeTel;

    /**
     * 家庭住址
     */
    @Column(name = "home_address")
    private String homeAddress;

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
     * 获取性别
     *
     * @return sex - 性别
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public Integer getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取院系
     *
     * @return department - 院系
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置院系
     *
     * @param department 院系
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取专业
     *
     * @return profession - 专业
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置专业
     *
     * @param profession 专业
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * 获取学历
     *
     * @return education - 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置学历
     *
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取政治面貌
     *
     * @return political_status - 政治面貌
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * 设置政治面貌
     *
     * @param politicalStatus 政治面貌
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    /**
     * 获取生源地
     *
     * @return biogenic_land - 生源地
     */
    public String getBiogenicLand() {
        return biogenicLand;
    }

    /**
     * 设置生源地
     *
     * @param biogenicLand 生源地
     */
    public void setBiogenicLand(String biogenicLand) {
        this.biogenicLand = biogenicLand;
    }

    /**
     * 获取毕业时间
     *
     * @return graduation_time - 毕业时间
     */
    public Date getGraduationTime() {
        return graduationTime;
    }

    /**
     * 设置毕业时间
     *
     * @param graduationTime 毕业时间
     */
    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    /**
     * 获取个人联系电话
     *
     * @return stu_tel - 个人联系电话
     */
    public String getStuTel() {
        return stuTel;
    }

    /**
     * 设置个人联系电话
     *
     * @param stuTel 个人联系电话
     */
    public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
    }

    /**
     * 获取家庭联系人
     *
     * @return family_contact - 家庭联系人
     */
    public String getFamilyContact() {
        return familyContact;
    }

    /**
     * 设置家庭联系人
     *
     * @param familyContact 家庭联系人
     */
    public void setFamilyContact(String familyContact) {
        this.familyContact = familyContact;
    }

    /**
     * 获取家庭电话
     *
     * @return home_tel - 家庭电话
     */
    public String getHomeTel() {
        return homeTel;
    }

    /**
     * 设置家庭电话
     *
     * @param homeTel 家庭电话
     */
    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    /**
     * 获取家庭住址
     *
     * @return home_address - 家庭住址
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * 设置家庭住址
     *
     * @param homeAddress 家庭住址
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}