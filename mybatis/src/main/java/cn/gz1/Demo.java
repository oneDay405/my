package cn.gz1;

import cn.utils.MybatisUtils;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Demo {
    @Test
    public void test01() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentDao dao = sqlSession.getMapper(StudentDao.class);
        /*数据分页*/
        PageHelper.startPage(1, 4);
        List<Student> students = dao.selectAllStudent();


        for (Student student : students) {
            System.out.println(student);
        }



    }
}
