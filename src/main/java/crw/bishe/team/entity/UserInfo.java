package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "user_info")
public class UserInfo {
    /**
     * 序号
     */
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户编号
     */
    @Column(name = "userNo")
    private Integer userno;

    /**
     * 用户昵称
     */
    @Column(name = "userName")
    private String username;

    /**
     * 用户类型
     */
    @Column(name = "userType")
    private Byte usertype;

    /**
     * 头像Url
     */
    @Column(name = "imageUrl")
    private String imageurl;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户编号
     *
     * @return userNo - 用户编号
     */
    public Integer getUserno() {
        return userno;
    }

    /**
     * 设置用户编号
     *
     * @param userno 用户编号
     */
    public void setUserno(Integer userno) {
        this.userno = userno;
    }

    /**
     * 获取用户昵称
     *
     * @return userName - 用户昵称
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户昵称
     *
     * @param username 用户昵称
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取用户类型
     *
     * @return userType - 用户类型
     */
    public Byte getUsertype() {
        return usertype;
    }

    /**
     * 设置用户类型
     *
     * @param usertype 用户类型
     */
    public void setUsertype(Byte usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取头像Url
     *
     * @return imageUrl - 头像Url
     */
    public String getImageurl() {
        return imageurl;
    }

    /**
     * 设置头像Url
     *
     * @param imageurl 头像Url
     */
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }
}