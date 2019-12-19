package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "team_info")
public class TeamInfo {
    /**
     * 队伍id
     */
    @Id
    @Column(name = "team_id")
    private String teamId;

    /**
     * 队伍名称
     */
    @Column(name = "team_name")
    private String teamName;

    /**
     * 团队描述
     */
    @Column(name = "team_describe")
    private String teamDescribe;

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
     * 获取队伍id
     *
     * @return team_id - 队伍id
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置队伍id
     *
     * @param teamId 队伍id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取队伍名称
     *
     * @return team_name - 队伍名称
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * 设置队伍名称
     *
     * @param teamName 队伍名称
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
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
}