package crw.bishe.team.service;

import crw.bishe.team.dto.UserDto;

import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:48
 */
public interface UserService {
    /**
     * 增加用户信息
     * @param userDto
     * @return
     */
    int create(UserDto userDto);

    /**
     * 根据ID删除用户信息
     * @param id
     * @return
     */
    int delete(String id);

    /**
     * 修改用户信息
     * @param userDto
     * @return
     */
    int update(UserDto userDto, String id);


    /**
     * 查找所有用户信息
     * @return
     */
    List<UserDto> findAll();
}
