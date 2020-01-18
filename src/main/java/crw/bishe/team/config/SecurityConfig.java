package crw.bishe.team.config;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Description spring security 认证和授权 用于web登录和拦截请求等
 * @Author crw
 * @Date Created in 2019/12/18 0018
 * @Time 18:21
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) //开启security注解
@Log4j2
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().ignoringAntMatchers("/druid*/");
        http.authorizeRequests().
                antMatchers("/static/**").permitAll().anyRequest().authenticated()
                .and()
                .csrf().disable()
                .formLogin().permitAll()
                .and()
                .logout().permitAll();
    }

    //定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())   //在Spring Security 5.0中新增了多种加密方式，也改变了密码的格式
                .withUser("admin").password(new BCryptPasswordEncoder().encode("123456")).roles("ADMIN")
                .and()
                .withUser("crw").password(new BCryptPasswordEncoder().encode("123456")).roles("USER")
                .and()
                .withUser("hzc").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
    }
}
