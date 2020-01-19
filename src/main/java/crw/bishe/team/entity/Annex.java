package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "annex")
public class Annex {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 附件链接
     */
    private String link;

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
     * 获取附件链接
     *
     * @return link - 附件链接
     */
    public String getLink() {
        return link;
    }

    /**
     * 设置附件链接
     *
     * @param link 附件链接
     */
    public void setLink(String link) {
        this.link = link;
    }
}