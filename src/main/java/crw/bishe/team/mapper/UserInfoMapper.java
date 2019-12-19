package crw.bishe.team.mapper;

import crw.bishe.team.entity.UserInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

public interface UserInfoMapper extends Mapper<UserInfo> {
    @Select("select count(*) from user_info where user_name=#{arg0} and password = #{arg1}")
    public int findUser(String userName, String password);
}