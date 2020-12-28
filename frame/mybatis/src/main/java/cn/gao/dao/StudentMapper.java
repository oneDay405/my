package cn.gao.dao;

import cn.gao.entity.Student;

public interface StudentMapper {
    Student selectStudentById(Integer id);
}
