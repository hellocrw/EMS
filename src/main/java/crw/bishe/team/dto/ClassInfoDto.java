package crw.bishe.team.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ClassInfoDto {

    @ApiModelProperty(position = 1, value = "序号，新增时应为null，系统会自动生成",required = true)
    private String id;

    @ApiModelProperty(position = 2,value = "班级代号")
    private String classNo;

    @ApiModelProperty(position = 3,value = "班级名称")
    private String className;

    @ApiModelProperty(position = 4,value = "专业代号")
    private String professionNo;

    @ApiModelProperty(position = 5,value = "专业名称")
    private String professionName;

    @ApiModelProperty(position = 6,value = "班级人数")
    private String classNum;

    @ApiModelProperty(position = 7,value = "就业人数")
    private String employNum;

    @ApiModelProperty(position = 8,value = "班长")
    private String nomitor;

    @ApiModelProperty(position = 9,value = "班长联系方式")
    private String monitorTel;
}
