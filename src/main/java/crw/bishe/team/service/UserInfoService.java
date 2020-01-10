package crw.bishe.team.service;


import crw.bishe.team.entity.UserInfo;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/10 0010
 * @Time 23:30
 */
public interface UserInfoService {
    /**
     * 增加用户信息
     * @param userInfo
     * @return
     */
    int persist(UserInfo userInfo);

    /**
     * 根据ID删除用户信息
     * @param id
     * @return
     */
    int delete(Long id);

    /**
     * 跟新用户信息
     * @param userInfo
     * @return
     */
    int update(UserInfo userInfo, Long id);

    /**
     * 通过ID查找用户信息
     * @param id
     * @return
     */
    UserInfo findById(Long id);

    /**
     * 分页查找用户信息
     * @param pageNo 页数
     * @param PageSize 页大小
     * @return
     */
    List<UserInfo> findByPage(int pageNo, int PageSize);

    /**
     * 查找所有用户信息
     * @return
     */
    List<UserInfo> findAll();
}
