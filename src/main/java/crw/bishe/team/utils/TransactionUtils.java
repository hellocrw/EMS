package crw.bishe.team.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

/**
 * @Description 事务操作工具类
 * @Author crw
 * @Date Created in 2019/12/20 0020
 * @Time 14:53
 */
@Component
public class TransactionUtils {
    @Autowired
    private DataSourceTransactionManager dataSourceTransactionManager;

    public TransactionStatus begin(){
        TransactionStatus transaction = dataSourceTransactionManager.getTransaction(new DefaultTransactionAttribute());
        return transaction;
    }

    public void commit(TransactionStatus transaction){
        dataSourceTransactionManager.commit(transaction);
    }

    public void rollback(TransactionStatus transaction){
        dataSourceTransactionManager.rollback(transaction);
    }
}
