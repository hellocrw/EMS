package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "admin_info")
public class AdminInfo {
    /**
     * 序号
     */
    @Id
    private Long id;

    /**
     * 管理员编号
     */
    @Column(name = "adminId")
    private String adminid;

    /**
     * 管理员昵称
     */
    @Column(name = "adminName")
    private String adminname;

    /**
     * 管理员类型
     */
    @Column(name = "adminType")
    private Byte admintype;

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
     * 获取管理员编号
     *
     * @return adminId - 管理员编号
     */
    public String getAdminid() {
        return adminid;
    }

    /**
     * 设置管理员编号
     *
     * @param adminid 管理员编号
     */
    public void setAdminid(String adminid) {
        this.adminid = adminid;
    }

    /**
     * 获取管理员昵称
     *
     * @return adminName - 管理员昵称
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * 设置管理员昵称
     *
     * @param adminname 管理员昵称
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    /**
     * 获取管理员类型
     *
     * @return adminType - 管理员类型
     */
    public Byte getAdmintype() {
        return admintype;
    }

    /**
     * 设置管理员类型
     *
     * @param admintype 管理员类型
     */
    public void setAdmintype(Byte admintype) {
        this.admintype = admintype;
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