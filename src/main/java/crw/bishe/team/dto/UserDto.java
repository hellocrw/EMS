package crw.bishe.team.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 13:25
 */
@Data
@ToString(callSuper = true)
@ApiModel(description = "用户基本信息")
public class UserDto {

    @ApiModelProperty(position = 1, value = "ID", required = true)
    private String id;

    @ApiModelProperty(position = 2, value = "用户ID")
    private String userId;

    @ApiModelProperty(position = 3, value = "用户名称")
    private String userName;

    @ApiModelProperty(position = 4, value = "头像")
    private String userAvatar;

    @ApiModelProperty(position = 5, value = "性别")
    private String gender;

    @ApiModelProperty(position = 6, value = "学校")
    private String university;

    @ApiModelProperty(position = 7, value = "学院")
    private String college;

    @ApiModelProperty(position = 8, value = "专业")
    private String profession;

    @ApiModelProperty(position = 9, value = "年级")
    private String grade;

    @ApiModelProperty(position = 10, value = "班级")
    private String userClass;

    @ApiModelProperty(position = 11, value = "学号")
    private String userNo;

    @ApiModelProperty(position = 12, value = "联系方式")
    private String userTel;

    @ApiModelProperty(position = 13, value = "邮箱")
    private String email;

    @ApiModelProperty(position = 14, value = "掌握技能、能力")
    private String ability;

}
