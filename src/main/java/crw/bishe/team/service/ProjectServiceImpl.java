package crw.bishe.team.service;

import crw.bishe.team.dto.ProjectDto;
import crw.bishe.team.dtoEntityMapping.ProjectMapping;
import crw.bishe.team.entity.Project;
import crw.bishe.team.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description Description
 * @Author crw
 * @Date Created in 2020/1/19 0019
 * @Time 17:14
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectMapper projectMapper;
    private final ProjectMapping projectMapping;

    @Autowired
    public ProjectServiceImpl(ProjectMapper projectMapper, ProjectMapping projectMapping){
        this.projectMapper = projectMapper;
        this.projectMapping = projectMapping;
    }
    @Override
    public int create(ProjectDto projectDto) {
        if(projectDto == null ){
            return 0;
        }
        return projectMapper.insert(projectMapping.toEntity(projectDto));
    }

    @Override
    public int delete(String id) {
        if(id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        return projectMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int update(ProjectDto projectDto, String id) {
        if(projectDto == null || id == null){
            return 0;
        }
        Long key = Long.parseLong(id);
        if(projectMapper.selectByPrimaryKey(key) == null){
            return 0;
        }
        return projectMapper.updateByPrimaryKey(projectMapping.toEntity(projectDto));
    }

    @Override
    public List<ProjectDto> findAll() {
        List<Project> projects = projectMapper.selectAll();
        List<ProjectDto> projectDtos = new ArrayList<>();
        projects.forEach(project -> projectDtos.add(projectMapping.toDto(project)));
        return projectDtos;
    }
}
