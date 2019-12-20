package crw.bishe.team.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "log_info")
public class LogInfo {
    /**
     * 日志id
     */
    @Id
    @Column(name = "log_id")
    private Integer logId;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 操作类型
     */
    @Column(name = "operate_type")
    private String operateType;

    /**
     * 操作时间
     */
    @Column(name = "operate_date")
    private Date operateDate;

    /**
     * 操作结果
     */
    @Column(name = "operate_result")
    private String operateResult;

    /**
     * 获取日志id
     *
     * @return log_id - 日志id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * 设置日志id
     *
     * @param logId 日志id
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * 获取操作者
     *
     * @return operator - 操作者
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作者
     *
     * @param operator 操作者
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 获取操作类型
     *
     * @return operate_type - 操作类型
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * 设置操作类型
     *
     * @param operateType 操作类型
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    /**
     * 获取操作时间
     *
     * @return operate_date - 操作时间
     */
    public Date getOperateDate() {
        return operateDate;
    }

    /**
     * 设置操作时间
     *
     * @param operateDate 操作时间
     */
    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    /**
     * 获取操作结果
     *
     * @return operate_result - 操作结果
     */
    public String getOperateResult() {
        return operateResult;
    }

    /**
     * 设置操作结果
     *
     * @param operateResult 操作结果
     */
    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    @Override
    public String toString() {
        return "LogInfo{" +
                "logId=" + logId +
                ", operator='" + operator + '\'' +
                ", operateType='" + operateType + '\'' +
                ", operateDate=" + operateDate +
                ", operateResult='" + operateResult + '\'' +
                '}';
    }

    public LogInfo(Integer logId, String operator, String operateType, Date operateDate, String operateResult) {
        this.logId = logId;
        this.operator = operator;
        this.operateType = operateType;
        this.operateDate = operateDate;
        this.operateResult = operateResult;
    }
}