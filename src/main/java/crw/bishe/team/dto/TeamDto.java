package crw.bishe.team.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 14:38
 */
@Data
@ToString(callSuper = true)
@ApiModel(description = "团队基本信息")
public class TeamDto {

    @ApiModelProperty(position = 1, value = "ID", required = true)
    private String id;

    @ApiModelProperty(position = 2, value = "团队ID")
    private String teamId;

    @ApiModelProperty(position = 3, value = "团队名称")
    private String teamName;

    @ApiModelProperty(position = 4, value = "队长ID")
    private String leaderId;

    @ApiModelProperty(position = 5, value = "团队描述")
    private String teamDescribe;

    @ApiModelProperty(position = 6, value = "团队类型")
    private String teamType;

    @ApiModelProperty(position = 7, value = "团队人数")
    private String teamNumber;

    @ApiModelProperty(position = 8, value = "团队创建日期")
    private String teamDate;

    @ApiModelProperty(position = 9, value = "团队状态")
    private String status;

    @ApiModelProperty(position = 10, value = "人员类型")
    private String staff;
}
