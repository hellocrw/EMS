package crw.bishe.team.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description Description 分页查询结果
 * @Author crw
 * @Date Created in 2020/2/3 0003
 * @Time 17:42
 */
@Data
public class PageResult {
    /**
     * 当前页码
     */
    private int pageNum;
    /**
     * 每页数量
     */
    private int pageSize;
    /**
     * 记录总数
     */
    private long totalSize;
    /**
     * 页码总数
     */
    private int totalPages;
    /**
     * 数据模型
     */
    private List<?> content;
}
