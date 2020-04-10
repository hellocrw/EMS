package crw.bishe.team.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Description Description 分页请求参数
 * @Author crw
 * @Date Created in 2020/2/3 0003
 * @Time 17:42
 */
@ApiModel(value = "分页请求参数")
@Data
public class PageRequest {

    @ApiModelProperty(position = 1,value = "当前页码")
    private String pageNum;

    @ApiModelProperty(position = 2,value = "每页数量")
    private String pageSize;
}
