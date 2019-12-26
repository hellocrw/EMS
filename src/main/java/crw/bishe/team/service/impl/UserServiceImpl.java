package crw.bishe.team.service.impl;

import crw.bishe.team.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/25 0025
 * @Time 17:46
 */
public class UserServiceImpl implements UserService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
