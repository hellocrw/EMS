package crw.bishe.teamup01.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "student_info")
public class StudentInfo {
    @Id
    private Integer id;

    @Column(name = "stu_no")
    private Integer stuNo;

    @Column(name = "stu_name")
    private String stuName;

    private Boolean sex;

    @Column(name = "id_card")
    private Integer idCard;

    private String department;

    private String profession;

    private String education;

    @Column(name = "political_status")
    private String politicalStatus;

    @Column(name = "biogenic_land")
    private String biogenicLand;

    @Column(name = "graduation_time")
    private Date graduationTime;

    @Column(name = "stu_tel")
    private Integer stuTel;

    @Column(name = "family_contact")
    private String familyContact;

    @Column(name = "home_tel")
    private Integer homeTel;

    @Column(name = "home_address")
    private String homeAddress;

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
     * @return sex
     */
    public Boolean getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    /**
     * @return id_card
     */
    public Integer getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    /**
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return profession
     */
    public String getProfession() {
        return profession;
    }

    /**
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * @return education
     */
    public String getEducation() {
        return education;
    }

    /**
     * @param education
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * @return political_status
     */
    public String getPoliticalStatus() {
        return politicalStatus;
    }

    /**
     * @param politicalStatus
     */
    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    /**
     * @return biogenic_land
     */
    public String getBiogenicLand() {
        return biogenicLand;
    }

    /**
     * @param biogenicLand
     */
    public void setBiogenicLand(String biogenicLand) {
        this.biogenicLand = biogenicLand;
    }

    /**
     * @return graduation_time
     */
    public Date getGraduationTime() {
        return graduationTime;
    }

    /**
     * @param graduationTime
     */
    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    /**
     * @return stu_tel
     */
    public Integer getStuTel() {
        return stuTel;
    }

    /**
     * @param stuTel
     */
    public void setStuTel(Integer stuTel) {
        this.stuTel = stuTel;
    }

    /**
     * @return family_contact
     */
    public String getFamilyContact() {
        return familyContact;
    }

    /**
     * @param familyContact
     */
    public void setFamilyContact(String familyContact) {
        this.familyContact = familyContact;
    }

    /**
     * @return home_tel
     */
    public Integer getHomeTel() {
        return homeTel;
    }

    /**
     * @param homeTel
     */
    public void setHomeTel(Integer homeTel) {
        this.homeTel = homeTel;
    }

    /**
     * @return home_address
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * @param homeAddress
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}