package crw.bishe.team.config;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2019/12/24 0024
 * @Time 18:22
 */
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import javax.sql.DataSource;
public interface DbConfig {

    /**
     * 定义数据源
     *
     * @return
     * @throws Exception
     */
    DataSource  dataSource() throws Exception;

    /**
     * 定义session工厂
     *
     * @param dataSource
     * @return
     * @throws Exception
     */
    SqlSessionFactory sessionFactory(DataSource dataSource) throws Exception;

    /**
     * 定义失误管理器
     *
     * @param dataSource
     * @return
     */
    DataSourceTransactionManager transactionManager(DataSource dataSource);

}
