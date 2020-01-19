package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "user_team")
public class UserTeam {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 用户项目ID
     */
    @Column(name = "ut_id")
    private Long utId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 团队ID
     */
    @Column(name = "team_id")
    private Long teamId;

    /**
     * 是否是队长
     */
    @Column(name = "is_leader")
    private Byte isLeader;

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
     * 获取用户项目ID
     *
     * @return ut_id - 用户项目ID
     */
    public Long getUtId() {
        return utId;
    }

    /**
     * 设置用户项目ID
     *
     * @param utId 用户项目ID
     */
    public void setUtId(Long utId) {
        this.utId = utId;
    }

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取是否是队长
     *
     * @return is_leader - 是否是队长
     */
    public Byte getIsLeader() {
        return isLeader;
    }

    /**
     * 设置是否是队长
     *
     * @param isLeader 是否是队长
     */
    public void setIsLeader(Byte isLeader) {
        this.isLeader = isLeader;
    }
}