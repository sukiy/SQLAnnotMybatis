package mybatis.dao.impl;

import mybatis.dao.StuDao;
import mybatis.entity.TbStu;
import mybatis.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class StuDaoImpl implements StuDao{
    @Override
    public boolean addStu(TbStu stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        session.getMapper(StuDao.class).addStu(stu);
        System.out.println("添加成功");
        session.commit();
        return true;
    }

    @Override
    public boolean deleteStu(int id) {
        SqlSession session=MybatisUtil.getSqlSession();
        session.getMapper(StuDao.class).deleteStu(id);
        System.out.println("删除成功");
        session.commit();
        return true;
    }

    @Override
    public TbStu findStuById(int id) {
        SqlSession session= MybatisUtil.getSqlSession();
        TbStu stu=session.getMapper(StuDao.class).findStuById(id);
        System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSage()+","+stu.getSex());
        session.commit();
        return stu;
    }

    @Override
    public boolean updateStu(TbStu stu) {
        SqlSession session= MybatisUtil.getSqlSession();
        try {
            System.out.println(stu.getSname()+"-----------------------------");
            session.getMapper(StuDao.class).updateStu(stu);
            System.out.println("修改成功");
            session.commit();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return true;
    }

    @Override
    public List<TbStu> findStuList() {
        SqlSession session=MybatisUtil.getSqlSession();
        List<TbStu> stulist=session.getMapper(StuDao.class).findStuList();
        for (TbStu stu:stulist){
            System.out.println(stu.getSno()+","+stu.getSname()+","+stu.getSage()+","+stu.getSex());
        }
        session.commit();
        return stulist;
    }
}
