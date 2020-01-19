package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "team")
public class Team {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 团队ID
     */
    @Column(name = "team_id")
    private Long teamId;

    /**
     * 团队名称
     */
    @Column(name = "team_name")
    private String teamName;

    /**
     * 队长ID
     */
    @Column(name = "leader_id")
    private Long leaderId;

    /**
     * 团队描述
     */
    @Column(name = "team_describe")
    private String teamDescribe;

    /**
     * 团队类型
     */
    @Column(name = "team_type")
    private String teamType;

    /**
     * 团队人数
     */
    @Column(name = "team_number")
    private Integer teamNumber;

    /**
     * 团队创建日期
     */
    @Column(name = "team_date")
    private Date teamDate;

    /**
     * 团队状态
     */
    private Byte status;

    /**
     * 人员类型
     */
    private String staff;

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
     * 获取团队ID
     *
     * @return team_id - 团队ID
     */
    public Long getTeamId() {
        return teamId;
    }

    /**
     * 设置团队ID
     *
     * @param teamId 团队ID
     */
    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取团队名称
     *
     * @return team_name - 团队名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置团队名称
     *
     * @param teamName 团队名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * 获取队长ID
     *
     * @return leader_id - 队长ID
     */
    public Long getLeaderId() {
        return leaderId;
    }

    /**
     * 设置队长ID
     *
     * @param leaderId 队长ID
     */
    public void setLeaderId(Long leaderId) {
        this.leaderId = leaderId;
    }

    /**
     * 获取团队描述
     *
     * @return team_describe - 团队描述
     */
    public String getTeamDescribe() {
        return teamDescribe;
    }

    /**
     * 设置团队描述
     *
     * @param teamDescribe 团队描述
     */
    public void setTeamDescribe(String teamDescribe) {
        this.teamDescribe = teamDescribe;
    }

    /**
     * 获取团队类型
     *
     * @return team_type - 团队类型
     */
    public String getTeamType() {
        return teamType;
    }

    /**
     * 设置团队类型
     *
     * @param teamType 团队类型
     */
    public void setTeamType(String teamType) {
        this.teamType = teamType;
    }

    /**
     * 获取团队人数
     *
     * @return team_number - 团队人数
     */
    public Integer getTeamNumber() {
        return teamNumber;
    }

    /**
     * 设置团队人数
     *
     * @param teamNumber 团队人数
     */
    public void setTeamNumber(Integer teamNumber) {
        this.teamNumber = teamNumber;
    }

    /**
     * 获取团队创建日期
     *
     * @return team_date - 团队创建日期
     */
    public Date getTeamDate() {
        return teamDate;
    }

    /**
     * 设置团队创建日期
     *
     * @param teamDate 团队创建日期
     */
    public void setTeamDate(Date teamDate) {
        this.teamDate = teamDate;
    }

    /**
     * 获取团队状态
     *
     * @return status - 团队状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置团队状态
     *
     * @param status 团队状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取人员类型
     *
     * @return staff - 人员类型
     */
    public String getStaff() {
        return staff;
    }

    /**
     * 设置人员类型
     *
     * @param staff 人员类型
     */
    public void setStaff(String staff) {
        this.staff = staff;
    }
}