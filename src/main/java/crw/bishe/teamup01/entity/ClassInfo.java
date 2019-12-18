package crw.bishe.teamup01.entity;

import javax.persistence.*;

@Table(name = "class_info")
public class ClassInfo {
    @Id
    private Integer id;

    @Column(name = "class_no")
    private Integer classNo;

    @Column(name = "class_name")
    private String className;

    @Column(name = "profession_no")
    private Integer professionNo;

    @Column(name = "profession_name")
    private String professionName;

    @Column(name = "class_num")
    private Integer classNum;

    private String nomitor;

    @Column(name = "monitor_tel")
    private String monitorTel;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return class_no
     */
    public Integer getClassNo() {
        return classNo;
    }

    /**
     * @param classNo
     */
    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    /**
     * @return class_name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * @return profession_no
     */
    public Integer getProfessionNo() {
        return professionNo;
    }

    /**
     * @param professionNo
     */
    public void setProfessionNo(Integer professionNo) {
        this.professionNo = professionNo;
    }

    /**
     * @return profession_name
     */
    public String getProfessionName() {
        return professionName;
    }

    /**
     * @param professionName
     */
    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    /**
     * @return class_num
     */
    public Integer getClassNum() {
        return classNum;
    }

    /**
     * @param classNum
     */
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    /**
     * @return nomitor
     */
    public String getNomitor() {
        return nomitor;
    }

    /**
     * @param nomitor
     */
    public void setNomitor(String nomitor) {
        this.nomitor = nomitor;
    }

    /**
     * @return monitor_tel
     */
    public String getMonitorTel() {
        return monitorTel;
    }

    /**
     * @param monitorTel
     */
    public void setMonitorTel(String monitorTel) {
        this.monitorTel = monitorTel;
    }
}