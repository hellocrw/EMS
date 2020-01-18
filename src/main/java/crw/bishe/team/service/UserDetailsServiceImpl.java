package crw.bishe.team.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

/**
 * @description Description 自定义认证用户获取服务类
 * @Author crw
 * @create 2020/1/18
 * @Time 16:11
 **/
@Service
public class UserDetailsServiceImpl implements UserDetailsService  {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (StringUtils.isEmpty(username)){
            throw new UsernameNotFoundException("UserDetailsService没有接收到用户账号");
        }else {

        }
        return null;
    }
}
