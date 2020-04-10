package crw.bishe.team.utils;

import com.github.pagehelper.PageInfo;
import crw.bishe.team.vo.PageResult;

/**
 * @Description Description 分页查询工具
 * @Author crw
 * @Date Created in 2020/2/3 0003
 * @Time 21:55
 */
public class PageUtils {
    public static PageResult getPageResult(PageInfo pageInfo) {
        PageResult pageResult = new PageResult();
        pageResult.setPageSize(pageInfo.getPageSize());
        pageResult.setPageNum(pageInfo.getPageNum());
        pageResult.setTotalSize(pageInfo.getTotal());
        pageResult.setTotalPages(pageInfo.getPages());
        pageResult.setContent(pageInfo.getList());
        return pageResult;
    }
}
