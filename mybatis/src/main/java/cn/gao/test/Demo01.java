package cn.gao.test;

import cn.gao.dao.StuDao;
import cn.gao.entity.Student;
import cn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StuDao stuDao = sqlSession.getMapper(StuDao.class);
        List<Student> allStudent = stuDao.getAllStudent();
        for (Student stu : allStudent) {
            System.out.println(stu);
        }
        sqlSession.commit();
        sqlSession.close();
    }
}
