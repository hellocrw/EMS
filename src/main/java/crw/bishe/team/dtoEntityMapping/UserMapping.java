package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UserDto;
import crw.bishe.team.entity.User;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:33
 */
public interface UserMapping {

    /**
     * 将用户dto转为entity
     * @param userDto
     * @return user
     */
    User toEntity(UserDto userDto);

    /**
     * 将用户entity 转为 dto
     * @param user
     * @return userDto
     */
    UserDto toDto(User user);
}
