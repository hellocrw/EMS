package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "class_info")
public class ClassInfo {
    /**
     * 序号
     */
    @Id
    private Integer id;

    /**
     * 班级代号
     */
    @Column(name = "class_no")
    private Integer classNo;

    /**
     * 班级名称
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 专业代号
     */
    @Column(name = "profession_no")
    private Integer professionNo;

    /**
     * 专业名称
     */
    @Column(name = "profession_name")
    private String professionName;

    /**
     * 班级人数
     */
    @Column(name = "class_num")
    private Integer classNum;

    /**
     * 就业人数
     */
    @Column(name = "employ_num")
    private Integer employNum;

    /**
     * 班长
     */
    private String nomitor;

    /**
     * 班长联系方式
     */
    @Column(name = "monitor_tel")
    private String monitorTel;

    /**
     * 获取序号
     *
     * @return id - 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置序号
     *
     * @param id 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取班级代号
     *
     * @return class_no - 班级代号
     */
    public Integer getClassNo() {
        return classNo;
    }

    /**
     * 设置班级代号
     *
     * @param classNo 班级代号
     */
    public void setClassNo(Integer classNo) {
        this.classNo = classNo;
    }

    /**
     * 获取班级名称
     *
     * @return class_name - 班级名称
     */
    public String getClassName() {
        return className;
    }

    /**
     * 设置班级名称
     *
     * @param className 班级名称
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * 获取专业代号
     *
     * @return profession_no - 专业代号
     */
    public Integer getProfessionNo() {
        return professionNo;
    }

    /**
     * 设置专业代号
     *
     * @param professionNo 专业代号
     */
    public void setProfessionNo(Integer professionNo) {
        this.professionNo = professionNo;
    }

    /**
     * 获取专业名称
     *
     * @return profession_name - 专业名称
     */
    public String getProfessionName() {
        return professionName;
    }

    /**
     * 设置专业名称
     *
     * @param professionName 专业名称
     */
    public void setProfessionName(String professionName) {
        this.professionName = professionName;
    }

    /**
     * 获取班级人数
     *
     * @return class_num - 班级人数
     */
    public Integer getClassNum() {
        return classNum;
    }

    /**
     * 设置班级人数
     *
     * @param classNum 班级人数
     */
    public void setClassNum(Integer classNum) {
        this.classNum = classNum;
    }

    /**
     * 获取就业人数
     *
     * @return employ_num - 就业人数
     */
    public Integer getEmployNum() {
        return employNum;
    }

    /**
     * 设置就业人数
     *
     * @param employNum 就业人数
     */
    public void setEmployNum(Integer employNum) {
        this.employNum = employNum;
    }

    /**
     * 获取班长
     *
     * @return nomitor - 班长
     */
    public String getNomitor() {
        return nomitor;
    }

    /**
     * 设置班长
     *
     * @param nomitor 班长
     */
    public void setNomitor(String nomitor) {
        this.nomitor = nomitor;
    }

    /**
     * 获取班长联系方式
     *
     * @return monitor_tel - 班长联系方式
     */
    public String getMonitorTel() {
        return monitorTel;
    }

    /**
     * 设置班长联系方式
     *
     * @param monitorTel 班长联系方式
     */
    public void setMonitorTel(String monitorTel) {
        this.monitorTel = monitorTel;
    }
}