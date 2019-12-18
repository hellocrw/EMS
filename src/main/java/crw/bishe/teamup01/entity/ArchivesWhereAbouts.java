package crw.bishe.teamup01.entity;

import javax.persistence.*;

@Table(name = "archives_where_abouts")
public class ArchivesWhereAbouts {
    @Id
    private Integer id;

    @Column(name = "stu_no")
    private Integer stuNo;

    @Column(name = "stu_name")
    private String stuName;

    @Column(name = "registered_residence")
    private String registeredResidence;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "archive_recipient")
    private String archiveRecipient;

    @Column(name = "receiving_address")
    private String receivingAddress;

    @Column(name = "contact_person")
    private String contactPerson;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "post_code")
    private Integer postCode;

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
     * @return registered_residence
     */
    public String getRegisteredResidence() {
        return registeredResidence;
    }

    /**
     * @param registeredResidence
     */
    public void setRegisteredResidence(String registeredResidence) {
        this.registeredResidence = registeredResidence;
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

    /**
     * @return archive_recipient
     */
    public String getArchiveRecipient() {
        return archiveRecipient;
    }

    /**
     * @param archiveRecipient
     */
    public void setArchiveRecipient(String archiveRecipient) {
        this.archiveRecipient = archiveRecipient;
    }

    /**
     * @return receiving_address
     */
    public String getReceivingAddress() {
        return receivingAddress;
    }

    /**
     * @param receivingAddress
     */
    public void setReceivingAddress(String receivingAddress) {
        this.receivingAddress = receivingAddress;
    }

    /**
     * @return contact_person
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * @param contactPerson
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * @return contact_phone
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * @param contactPhone
     */
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    /**
     * @return post_code
     */
    public Integer getPostCode() {
        return postCode;
    }

    /**
     * @param postCode
     */
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }
}