package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.UserInfoDto;
import crw.bishe.team.entity.UserInfo;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/17 0017
 * @Time 16:12
 */
public interface UserInfoMapping {

    /**
     * 将用户entity转为dto
     * @param userInfo entity
     * @return unserInfoDto
     */
    public UserInfoDto toDto(UserInfo userInfo);

    /**
     * 将用户dto转为entity
     * @param userInfoDto dto
     * @return entity
     */
    public UserInfo toEntity(UserInfoDto userInfoDto);
}
