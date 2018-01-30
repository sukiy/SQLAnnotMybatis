package mybatis.dao.impl;

import mybatis.dao.EmpDao;
import mybatis.entity.Emp;
import mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class EmpDaoImpl implements EmpDao{
    @Override
    public boolean addEmp(Emp emp) {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            session.getMapper(EmpDao.class).addEmp(emp);
            session.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public boolean deleteEmp(Emp emp) {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            session.getMapper(EmpDao.class).deleteEmp(emp);
            System.out.println("删除成功");
            session.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public Emp findEmpById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            Emp emp=session.getMapper(EmpDao.class).findEmpById(id);
            System.out.println(emp.getEno()+","+emp.getEname()+","+emp.getDept().getDname());
            session.commit();
            return emp;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }

    @Override
    public boolean updateEmp(Emp emp) {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            session.getMapper(EmpDao.class).updateEmp(emp);
            session.commit();
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return false;
    }

    @Override
    public List findEmpList() {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            List list=session.getMapper(EmpDao.class).findEmpList();
            session.commit();
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return null;
    }
}
