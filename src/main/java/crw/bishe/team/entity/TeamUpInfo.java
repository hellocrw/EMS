package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "team_up_info")
public class TeamUpInfo {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 组队ID号
     */
    @Column(name = "teamup_id")
    private Long teamupId;

    /**
     * 开始时间
     */
    @Column(name = "start_time")
    private Long startTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 队伍描述
     */
    private String describe;

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
     * 获取组队ID号
     *
     * @return teamup_id - 组队ID号
     */
    public Long getTeamupId() {
        return teamupId;
    }

    /**
     * 设置组队ID号
     *
     * @param teamupId 组队ID号
     */
    public void setTeamupId(Long teamupId) {
        this.teamupId = teamupId;
    }

    /**
     * 获取开始时间
     *
     * @return start_time - 开始时间
     */
    public Long getStartTime() {
        return startTime;
    }

    /**
     * 设置开始时间
     *
     * @param startTime 开始时间
     */
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取队伍描述
     *
     * @return describe - 队伍描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 设置队伍描述
     *
     * @param describe 队伍描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }
}