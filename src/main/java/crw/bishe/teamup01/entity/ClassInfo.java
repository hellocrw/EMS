package crw.bishe.teamup01.entity;

import javax.persistence.*;

@Table(name = "classinfo")
public class ClassInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer classNo;
    private String className;
    private Integer professionNo;
    private String professionName;
    private Integer classNum;
    private String nomitor;
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

    public Integer getProfessionNo() {
        return professionNo;
    }

    public void setProfessionNo(Integer professionNo) {
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

    public String getNomitor() {
        return nomitor;
    }

    public void setNomitor(String nomitor) {
        this.nomitor = nomitor;
    }

    public Integer getMonitorTel() {
        return monitorTel;
    }

    public void setMonitorTel(Integer monitorTel) {
        this.monitorTel = monitorTel;
    }
}
