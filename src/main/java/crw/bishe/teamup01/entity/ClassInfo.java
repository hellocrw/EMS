package crw.bishe.teamup01.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "classinformation")
public class ClassInfo {
    @Id
    private Integer id;
    @Column
    private Integer classNo;
    @Column
    private String className;
    @Column
    private String professionNo;
    @Column
    private String professionName;
    @Column
    private Integer classNum;
    @Column
    private String monitor;
    @Column
    private Integer monitorTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassNo() {
        return classNo;
    }

    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getProfessionNo() {
        return professionNo;
    }

    public void setProfessionNo(String professionNo) {
        this.professionNo = professionNo;
    }

    public String getProfessionName() {
        return professionName;
    }

    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    public Integer getClassNum() {
        return classNum;
    }

    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public Integer getMonitorTel() {
        return monitorTel;
    }

    public void setMonitorTel(Integer monitorTel) {
        this.monitorTel = monitorTel;
    }
}
