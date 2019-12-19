package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "user_team_info")
public class UserTeamInfo {
    /**
     * 用户项目表
     */
    @Id
    @Column(name = "ut_id")
    private String utId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 团队id
     */
    @Column(name = "team_id")
    private String teamId;

    /**
     * 是否是队长
     */
    @Column(name = "is_leader")
    private String isLeader;

    /**
     * 获取用户项目表
     *
     * @return ut_id - 用户项目表
     */
    public String getUtId() {
        return utId;
    }

    /**
     * 设置用户项目表
     *
     * @param utId 用户项目表
     */
    public void setUtId(String utId) {
        this.utId = utId;
    }

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
     * 获取团队id
     *
     * @return team_id - 团队id
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置团队id
     *
     * @param teamId 团队id
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * 获取是否是队长
     *
     * @return is_leader - 是否是队长
     */
    public String getIsLeader() {
        return isLeader;
    }

    /**
     * 设置是否是队长
     *
     * @param isLeader 是否是队长
     */
    public void setIsLeader(String isLeader) {
        this.isLeader = isLeader;
    }
}