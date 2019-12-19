package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户头像
     */
    @Column(name = "user_avatar")
    private String userAvatar;

    /**
     * 性别
     */
    private String gender;

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
    private String uclass;

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
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户头像
     *
     * @return user_avatar - 用户头像
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * 设置用户头像
     *
     * @param userAvatar 用户头像
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
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
     * @return uclass - 班级
     */
    public String getUclass() {
        return uclass;
    }

    /**
     * 设置班级
     *
     * @param uclass 班级
     */
    public void setUclass(String uclass) {
        this.uclass = uclass;
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
}