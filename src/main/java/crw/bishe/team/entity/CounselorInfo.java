package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "counselor_info")
public class CounselorInfo {
    /**
     * 序号
     */
    @Id
    private Integer id;

    /**
     * 教工号
     */
    @Column(name = "cou_no")
    private Integer couNo;

    /**
     * 姓名
     */
    @Column(name = "cou_name")
    private String couName;

    /**
     * 联系方式
     */
    @Column(name = "cou_phone")
    private String couPhone;

    /**
     * 辅导专业
     */
    @Column(name = "cou_profession")
    private String couProfession;

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
     * 获取教工号
     *
     * @return cou_no - 教工号
     */
    public Integer getCouNo() {
        return couNo;
    }

    /**
     * 设置教工号
     *
     * @param couNo 教工号
     */
    public void setCouNo(Integer couNo) {
        this.couNo = couNo;
    }

    /**
     * 获取姓名
     *
     * @return cou_name - 姓名
     */
    public String getCouName() {
        return couName;
    }

    /**
     * 设置姓名
     *
     * @param couName 姓名
     */
    public void setCouName(String couName) {
        this.couName = couName;
    }

    /**
     * 获取联系方式
     *
     * @return cou_phone - 联系方式
     */
    public String getCouPhone() {
        return couPhone;
    }

    /**
     * 设置联系方式
     *
     * @param couPhone 联系方式
     */
    public void setCouPhone(String couPhone) {
        this.couPhone = couPhone;
    }

    /**
     * 获取辅导专业
     *
     * @return cou_profession - 辅导专业
     */
    public String getCouProfession() {
        return couProfession;
    }

    /**
     * 设置辅导专业
     *
     * @param couProfession 辅导专业
     */
    public void setCouProfession(String couProfession) {
        this.couProfession = couProfession;
    }
}