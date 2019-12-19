package crw.bishe.team.mapper;

import crw.bishe.team.entity.StudentInfo;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface StudentInfoMapper extends Mapper<StudentInfo> {
    @Select("select * from student_info")
    List<StudentInfo> selectStu();
    @Select("select * from student_info where id = #{id}")
    StudentInfo getById(int id);
}
