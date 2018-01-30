package mybatis.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Sukiy on 2018/1/29.
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;

    static {

            //先通过查找mybatis核心配置文件，并得到一个输入流
        try {
            InputStream is= Resources.getResourceAsStream("mybatis.xml");
            //将输入流传递给SqlSessionFactoryBuilder对象去解析配置文件
            //并构建一个SqlSessionFactory对象
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //根据SqlSessionFactory构建session对象
    public static SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
