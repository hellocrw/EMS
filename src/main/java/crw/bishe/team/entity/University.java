package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "university")
public class University {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 学校名称
     */
    private String university;

    /**
     * 学院名称
     */
    private String college;

    /**
     * 专业名称
     */
    private String profession;

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
     * 获取学校名称
     *
     * @return university - 学校名称
     */
    public String getUniversity() {
        return university;
    }

    /**
     * 设置学校名称
     *
     * @param university 学校名称
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * 获取学院名称
     *
     * @return college - 学院名称
     */
    public String getCollege() {
        return college;
    }

    /**
     * 设置学院名称
     *
     * @param college 学院名称
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * 获取专业名称
     *
     * @return profession - 专业名称
     */
    public String getProfession() {
        return profession;
    }

    /**
     * 设置专业名称
     *
     * @param profession 专业名称
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }
}