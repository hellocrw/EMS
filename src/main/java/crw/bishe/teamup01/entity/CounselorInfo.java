package crw.bishe.teamup01.entity;

import javax.persistence.*;

@Table(name = "counselor_info")
public class CounselorInfo {
    @Id
    private Integer id;

    @Column(name = "cou_no")
    private Integer couNo;

    @Column(name = "cou_name")
    private String couName;

    @Column(name = "cou_phone")
    private Integer couPhone;

    @Column(name = "cou_profession")
    private String couProfession;

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
     * @return cou_no
     */
    public Integer getCouNo() {
        return couNo;
    }

    /**
     * @param couNo
     */
    public void setCouNo(Integer couNo) {
        this.couNo = couNo;
    }

    /**
     * @return cou_name
     */
    public String getCouName() {
        return couName;
    }

    /**
     * @param couName
     */
    public void setCouName(String couName) {
        this.couName = couName;
    }

    /**
     * @return cou_phone
     */
    public Integer getCouPhone() {
        return couPhone;
    }

    /**
     * @param couPhone
     */
    public void setCouPhone(Integer couPhone) {
        this.couPhone = couPhone;
    }

    /**
     * @return cou_profession
     */
    public String getCouProfession() {
        return couProfession;
    }

    /**
     * @param couProfession
     */
    public void setCouProfession(String couProfession) {
        this.couProfession = couProfession;
    }
}