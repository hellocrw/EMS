package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "apply")
public class Apply {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 团队ID号
     */
    @Column(name = "team_id")
    private Long teamId;

    /**
     * 申请ID号
     */
    @Column(name = "apply_id")
    private Long applyId;

    /**
     * 申请人ID号
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 申请人
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 申请时间
     */
    @Column(name = "apply_date")
    private Date applyDate;

    /**
     * 申请描述
     */
    private String decribe;

    /**
     * 联系方式
     */
    private String phone;

    /**
     * 申请状态
     */
    private Byte status;

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
     * 获取团队ID号
     *
     * @return team_id - 团队ID号
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * 设置团队ID号
     *
     * @param teamId 团队ID号
     */
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取申请ID号
     *
     * @return apply_id - 申请ID号
     */
    public Long getApplyId() {
        return applyId;
    }

    /**
     * 设置申请ID号
     *
     * @param applyId 申请ID号
     */
    public void setApplyId(Long applyId) {
        this.applyId = applyId;
    }

    /**
     * 获取申请人ID号
     *
     * @return user_id - 申请人ID号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置申请人ID号
     *
     * @param userId 申请人ID号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取申请人
     *
     * @return user_name - 申请人
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置申请人
     *
     * @param userName 申请人
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取申请时间
     *
     * @return apply_date - 申请时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请时间
     *
     * @param applyDate 申请时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取申请描述
     *
     * @return decribe - 申请描述
     */
    public String getDecribe() {
        return decribe;
    }

    /**
     * 设置申请描述
     *
     * @param decribe 申请描述
     */
    public void setDecribe(String decribe) {
        this.decribe = decribe;
    }

    /**
     * 获取联系方式
     *
     * @return phone - 联系方式
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系方式
     *
     * @param phone 联系方式
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取申请状态
     *
     * @return status - 申请状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置申请状态
     *
     * @param status 申请状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}