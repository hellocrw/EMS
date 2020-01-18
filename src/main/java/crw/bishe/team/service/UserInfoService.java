package crw.bishe.team.service;


import crw.bishe.team.dto.UserInfoDto;
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
     * @param userInfoDto
     * @return
     */
    int persist(UserInfoDto userInfoDto);

    /**
     * 根据ID删除用户信息
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 修改用户信息
     * @param userInfoDto
     * @return
     */
    int update(UserInfoDto userInfoDto, String id);


    /**
     * 查找所有用户信息
     * @return
     */
    List<UserInfoDto> findAll();
}
