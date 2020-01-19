package crw.bishe.team.dtoEntityMapping;

import crw.bishe.team.dto.ProjectDto;
import crw.bishe.team.entity.Project;
import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 17:01
 */
@Component("projectMapping")
public class ProjectMappingImpl implements ProjectMapping {
    @Override
    public Project toEntity(ProjectDto projectDto) {
        if(projectDto == null){
            return null;
        }
        Project project = new Project();
        if(projectDto.getId() == null || projectDto.getId() == ""){
            project.setId(null);
        }else{
            project.setId(Long.parseLong(projectDto.getId()));
        }
        project.setProId(projectDto.getProId());
        project.setProName(projectDto.getProName());
        project.setLeaderName(projectDto.getLeaderName());
        project.setProDescribe(projectDto.getProDescribe());
        project.setProDate(Date.valueOf(projectDto.getProDate()));
        project.setProStartTime(Date.valueOf(projectDto.getProStartTime()));
        project.setProEndTime(Date.valueOf(projectDto.getProEndTime()));
        project.setProStatus(projectDto.getProStatus());
        project.setTeamId(projectDto.getTeamId());
        project.setTeamName(projectDto.getTeamName());
        project.setProType(projectDto.getProType());
        project.setProCurrentNum(Integer.parseInt(projectDto.getProCurrentNum()));
        project.setProLimiedNum(Integer.parseInt(projectDto.getProLimiedNum()));
        project.setNumber(Integer.parseInt(projectDto.getNumber()));
        project.setSeeNum(Integer.parseInt(projectDto.getSeeNum()));
        project.setStaff(Byte.parseByte(projectDto.getStaff()));
        return project;
    }

    @Override
    public ProjectDto toDto(Project project) {
        if(project == null){
            return null;
        }
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(String.valueOf(project.getId()));
        projectDto.setProId(project.getProId());
        projectDto.setProName(project.getProName());
        projectDto.setLeaderName(project.getLeaderName());
        projectDto.setProDescribe(project.getProDescribe());
        projectDto.setProDate(String.valueOf(project.getProDate()));
        projectDto.setProStartTime(String.valueOf(project.getProStartTime()));
        projectDto.setProEndTime(String.valueOf(project.getProEndTime()));
        projectDto.setProStatus(project.getProStatus());
        projectDto.setTeamId(project.getTeamId());
        projectDto.setTeamName(project.getTeamName());
        projectDto.setProType(project.getProType());
        projectDto.setProCurrentNum(String.valueOf(project.getProCurrentNum()));
        projectDto.setProLimiedNum(String.valueOf(project.getProLimiedNum()));
        projectDto.setNumber(String.valueOf(project.getNumber()));
        projectDto.setSeeNum(String.valueOf(project.getSeeNum()));
        projectDto.setStaff(String.valueOf(project.getStaff()));
        return projectDto;
    }
}
