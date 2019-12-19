package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pro_info")
public class ProInfo {
    /**
     * 项目id
     */
    @Id
    @Column(name = "pro_id")
    private String proId;

    /**
     * 项目名称
     */
    @Column(name = "pro_name")
    private String proName;

    /**
     * 项目描述
     */
    @Column(name = "pro_describe")
    private String proDescribe;

    /**
     * 项目创建时间
     */
    @Column(name = "pro_date")
    private Date proDate;

    /**
     * 项目当前状态
     */
    @Column(name = "pro_status")
    private String proStatus;

    /**
     * 所属团队
     */
    @Column(name = "team_id")
    private String teamId;

    /**
     * 获取项目id
     *
     * @return pro_id - 项目id
     */
    public String getProId() {
        return proId;
    }

    /**
     * 设置项目id
     *
     * @param proId 项目id
     */
    public void setProId(String proId) {
        this.proId = proId;
    }

    /**
     * 获取项目名称
     *
     * @return pro_name - 项目名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * 设置项目名称
     *
     * @param proName 项目名称
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 获取项目描述
     *
     * @return pro_describe - 项目描述
     */
    public String getProDescribe() {
        return proDescribe;
    }

    /**
     * 设置项目描述
     *
     * @param proDescribe 项目描述
     */
    public void setProDescribe(String proDescribe) {
        this.proDescribe = proDescribe;
    }

    /**
     * 获取项目创建时间
     *
     * @return pro_date - 项目创建时间
     */
    public Date getProDate() {
        return proDate;
    }

    /**
     * 设置项目创建时间
     *
     * @param proDate 项目创建时间
     */
    public void setProDate(Date proDate) {
        this.proDate = proDate;
    }

    /**
     * 获取项目当前状态
     *
     * @return pro_status - 项目当前状态
     */
    public String getProStatus() {
        return proStatus;
    }

    /**
     * 设置项目当前状态
     *
     * @param proStatus 项目当前状态
     */
    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    /**
     * 获取所属团队
     *
     * @return team_id - 所属团队
     */
    public String getTeamId() {
        return teamId;
    }

    /**
     * 设置所属团队
     *
     * @param teamId 所属团队
     */
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}