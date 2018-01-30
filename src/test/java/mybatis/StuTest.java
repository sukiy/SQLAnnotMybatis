package mybatis;

import mybatis.dao.StuDao;
import mybatis.dao.impl.StuDaoImpl;
import mybatis.entity.TbStu;
import org.junit.Test;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class StuTest {

    private StuDao stuDao=new StuDaoImpl();

    @Test
    public void main(){

      //  stuDao.addStu(new TbStu(0,"ddd",18,"女"));

      //  stuDao.deleteStu(1);

      //  stuDao.findStuById(2);

     /*   TbStu stu=new TbStu();
        stu = stuDao.findStuById(2);
        stu.setSname("zhananzhong");
        stu.setSex("女");
        stuDao.updateStu(stu);*/

     stuDao.findStuList();

    }
}
