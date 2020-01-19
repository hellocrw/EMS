package crw.bishe.team.aop;

import crw.bishe.team.utils.TransactionUtils;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.transaction.TransactionStatus;

/**
 * @Description aop事务管理
 * @Author crw
 * @Date Created in 2019/12/20 0020
 * @Time 14:37
 */
@Configuration
@Aspect
@Log4j2
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)  //防止单例线程安全问题
public class TransactionAspect {

    @Autowired
    private TransactionUtils transactionUtils;
    //切入点
    @Pointcut("execution(public * crw.bishe.team.service.*Impl.*.*(..)) ")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object logAround(ProceedingJoinPoint pjd) throws Throwable {
        TransactionStatus begin = transactionUtils.begin();
        try {
            Object proceed = pjd.proceed();
            transactionUtils.commit(begin);
            log.info("事务已提交");
            return proceed;
        } catch (Exception e) {
            transactionUtils.rollback(begin);
            return "事务已回滚!";
        }
    }
}
