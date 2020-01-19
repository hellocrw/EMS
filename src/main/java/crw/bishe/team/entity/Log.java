package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log")
public class Log {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 日志ID
     */
    @Column(name = "log_id")
    private Long logId;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 操作类型
     */
    private String type;

    /**
     * 操作时间
     */
    private Date time;

    /**
     * 操作结果
     */
    private String result;

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
     * 获取日志ID
     *
     * @return log_id - 日志ID
     */
    public Long getLogId() {
        return logId;
    }

    /**
     * 设置日志ID
     *
     * @param logId 日志ID
     */
    public void setLogId(Long logId) {
        this.logId = logId;
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
     * 获取用户
     *
     * @return user_name - 用户
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户
     *
     * @param userName 用户
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取操作类型
     *
     * @return type - 操作类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置操作类型
     *
     * @param type 操作类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取操作时间
     *
     * @return time - 操作时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置操作时间
     *
     * @param time 操作时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取操作结果
     *
     * @return result - 操作结果
     */
    public String getResult() {
        return result;
    }

    /**
     * 设置操作结果
     *
     * @param result 操作结果
     */
    public void setResult(String result) {
        this.result = result;
    }
}