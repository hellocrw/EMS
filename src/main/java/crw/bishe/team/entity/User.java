package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "user")
public class User {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 头像
     */
    @Column(name = "user_avatar")
    private String userAvatar;

    /**
     * 性别
     */
    private Byte gender;

    /**
     * 学校
     */
    private String university;

    /**
     * 学院
     */
    private String college;

    /**
     * 专业
     */
    private String profession;

    /**
     * 年级
     */
    private String grade;

    /**
     * 班级
     */
    @Column(name = "user_class")
    private String userClass;

    /**
     * 学号
     */
    @Column(name = "user_no")
    private Integer userNo;

    /**
     * 联系方式
     */
    @Column(name = "user_tel")
    private String userTel;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 掌握技能、能力
     */
    private String ability;

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名称
     *
     * @return user_name - 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名称
     *
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取头像
     *
     * @return user_avatar - 头像
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 设置头像
     *
     * @param userAvatar 头像
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * 获取学校
     *
     * @return university - 学校
     */
    public String getUniversity() {
        return university;
    }

    /**
     * 设置学校
     *
     * @param university 学校
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * 获取学院
     *
     * @return college - 学院
     */
    public String getCollege() {
        return college;
    }

    /**
     * 设置学院
     *
     * @param college 学院
     */
    public void setCollege(String college) {
        this.college = college;
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
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取班级
     *
     * @return user_class - 班级
     */
    public String getUserClass() {
        return userClass;
    }

    /**
     * 设置班级
     *
     * @param userClass 班级
     */
    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    /**
     * 获取学号
     *
     * @return user_no - 学号
     */
    public Integer getUserNo() {
        return userNo;
    }

    /**
     * 设置学号
     *
     * @param userNo 学号
     */
    public void setUserNo(Integer userNo) {
        this.userNo = userNo;
    }

    /**
     * 获取联系方式
     *
     * @return user_tel - 联系方式
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * 设置联系方式
     *
     * @param userTel 联系方式
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取掌握技能、能力
     *
     * @return ability - 掌握技能、能力
     */
    public String getAbility() {
        return ability;
    }

    /**
     * 设置掌握技能、能力
     *
     * @param ability 掌握技能、能力
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }
}