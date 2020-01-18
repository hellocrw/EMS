package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "archives_where_abouts")
public class ArchivesWhereAbouts {
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
     * 户口档案去向
     */
    @Column(name = "registered_residence")
    private String registeredResidence;

    /**
     * 入户地址
     */
    @Column(name = "home_address")
    private String homeAddress;

    /**
     * 档案接收单位
     */
    @Column(name = "archive_recipient")
    private String archiveRecipient;

    /**
     * 接收地址
     */
    @Column(name = "receiving_address")
    private String receivingAddress;

    /**
     * 联系人
     */
    @Column(name = "contact_person")
    private String contactPerson;

    /**
     * 联系电话
     */
    @Column(name = "contact_phone")
    private String contactPhone;

    /**
     * 邮编
     */
    @Column(name = "post_code")
    private Integer postCode;

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
     * 获取户口档案去向
     *
     * @return registered_residence - 户口档案去向
     */
    public String getRegisteredResidence() {
        return registeredResidence;
    }

    /**
     * 设置户口档案去向
     *
     * @param registeredResidence 户口档案去向
     */
    public void setRegisteredResidence(String registeredResidence) {
        this.registeredResidence = registeredResidence;
    }

    /**
     * 获取入户地址
     *
     * @return home_address - 入户地址
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * 设置入户地址
     *
     * @param homeAddress 入户地址
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * 获取档案接收单位
     *
     * @return archive_recipient - 档案接收单位
     */
    public String getArchiveRecipient() {
        return archiveRecipient;
    }

    /**
     * 设置档案接收单位
     *
     * @param archiveRecipient 档案接收单位
     */
    public void setArchiveRecipient(String archiveRecipient) {
        this.archiveRecipient = archiveRecipient;
    }

    /**
     * 获取接收地址
     *
     * @return receiving_address - 接收地址
     */
    public String getReceivingAddress() {
        return receivingAddress;
    }

    /**
     * 设置接收地址
     *
     * @param receivingAddress 接收地址
     */
    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    /**
     * 获取联系人
     *
     * @return contact_person - 联系人
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * 设置联系人
     *
     * @param contactPerson 联系人
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * 获取联系电话
     *
     * @return contact_phone - 联系电话
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * 设置联系电话
     *
     * @param contactPhone 联系电话
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * 获取邮编
     *
     * @return post_code - 邮编
     */
    public Integer getPostCode() {
        return postCode;
    }

    /**
     * 设置邮编
     *
     * @param postCode 邮编
     */
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
}