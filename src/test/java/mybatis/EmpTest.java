package mybatis;

import mybatis.dao.EmpDao;
import mybatis.dao.impl.EmpDaoImpl;
import mybatis.entity.Dept;
import mybatis.entity.Emp;
import org.junit.Test;

/**
 *
 * Created by Sukiy on 2018/1/29.
 */
public class EmpTest {

    EmpDao empDao=new EmpDaoImpl();

    @Test
    public void testMethod(){

    /*    Dept dept=new Dept(1,null);
        Emp emp=new Emp(0,"Tina");
        emp.setDept(dept);
        empDao.addEmp(emp);*/

    //empDao.deleteEmp(new Emp(2,null));

     //   empDao.findEmpById(3);

        Emp emp=new Emp();
        Dept dept=new Dept();
        dept.setDno(1);
        emp.setDept(dept);
        emp.setEname("oooo");
        empDao.updateEmp(emp);
    }
}
