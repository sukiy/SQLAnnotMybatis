package mybatis.dao;

import mybatis.entity.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Sukiy on 2018/1/29.
 */
public interface EmpDao {

    @Insert("insert into emp(ename,edno) values(#{ename},#{dept.dno})")
    boolean addEmp(Emp emp);

    @Delete("delete from emp where eno=#{eno}")
    boolean deleteEmp(Emp emp);

    @Select("select e.eno,e.ename,d.dname from emp e,dept d where e.edno=d.dno and eno=#{eno}")
    @ResultMap("mybatis.dao.EmpDao.empMap")
    Emp findEmpById(int id);

    @Update("update emp set ename=#{ename},edno=#{dept.dno} where eno=#{eno}")
    @ResultMap("mybatis.dao.EmpDao.empMap")
    boolean updateEmp(Emp emp);

    List findEmpList();
}
