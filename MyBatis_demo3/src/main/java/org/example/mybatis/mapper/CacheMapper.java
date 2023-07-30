package org.example.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.mybatis.pojo.Emp;

public interface CacheMapper {

    Emp getEmpByEid(@Param("eid") Integer eid);

    void insertEmp(Emp emp);
}
