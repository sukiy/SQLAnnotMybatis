package mybatis.dao;

import mybatis.entity.TbStu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Sukiy on 2018/1/29.
 */
public interface StuDao {

    @Insert("insert into stu(sname,sage,sex) values(#{sname},#{sage},#{sex})")
    boolean addStu(TbStu stu);

    @Delete("delete from stu where sno=#{sno}")
    boolean deleteStu(int id);

    @Select("select * from stu where sno=#{sno}")
    TbStu findStuById(int id);

    @Update("update stu set sname=#{sname},sage=#{sage},sex=#{sex} where sno=#{sno}")
    boolean updateStu(TbStu stu);


    @Results({
            @Result(property = "sno",column = "sno",id = true),
            @Result(property = "sname",column = "sname"),
            @Result(property = "sage",column = "sage"),
            @Result(property = "sex",column = "sex"),

    })
    @Select("select * from stu")
    List<TbStu> findStuList();
}
