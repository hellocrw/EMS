package crw.bishe.team.entity;

import javax.persistence.*;

@Table(name = "role")
public class Role {
    /**
     * ID
     */
    @Id
    private Long id;

    /**
     * 角色ID号
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

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
     * 获取角色ID号
     *
     * @return role_id - 角色ID号
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID号
     *
     * @param roleId 角色ID号
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}