package crw.bishe.team.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 16:43
 */
@Data
@ToString(callSuper = true)
@ApiModel(description = "项目基本信息")
public class ProjectDto {

    @ApiModelProperty(position = 1, value = "ID", required = true)
    private String id;

    @ApiModelProperty(position = 2, value = "项目ID")
    private String proId;

    @ApiModelProperty(position = 3, value = "项目名称")
    private String proName;

    @ApiModelProperty(position = 4, value = "队长名称")
    private String leaderName;

    @ApiModelProperty(position = 5, value = "项目描述")
    private String proDescribe;

    @ApiModelProperty(position = 6, value = "项目创建时间")
    private String proDate;

    @ApiModelProperty(position = 7, value = "项目开始时间")
    private String proStartTime;

    @ApiModelProperty(position = 8, value = "项目结束时间")
    private String proEndTime;

    @ApiModelProperty(position = 9, value = "项目当前状态")
    private String proStatus;

    @ApiModelProperty(position = 10, value = "所属团队id号")
    private String teamId;

    @ApiModelProperty(position = 11, value = "团队名称")
    private String teamName;

    @ApiModelProperty(position = 12, value = "项目类型")
    private String proType;

    @ApiModelProperty(position = 13, value = "项目当前人数")
    private String proCurrentNum;

    @ApiModelProperty(position = 14, value = "项目限制人数")
    private String proLimiedNum;

    @ApiModelProperty(position = 15, value = "项目人数")
    private String number;

    @ApiModelProperty(position = 16, value = "查看人数")
    private String seeNum;

    @ApiModelProperty(position = 17, value = "需要人员类型")
    private String staff;
}
