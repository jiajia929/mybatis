package org.example.mybatis.test;

import java.sql.*;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.example.mybatis.mapper.SQLMapper;
import org.example.mybatis.pojo.User;
import org.example.mybatis.utils.SqlSessionUtils;
import org.junit.Test;

public class SQLMapperTest {

    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("j");
        System.out.println(list);
    }

    @Test
    public void testDeleteMore() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        int result = mapper.deleteMore("5,6");
        System.out.println(result);
    }

    @Test
    public void testGetUserByTableName() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByTableName("t_user");
        System.out.println(list);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        User user = new User(null,"张三","123456",23,"男","3378453807@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

    @Test
    public void testJDBC() throws Exception {
        Class.forName("");
        Connection connection = DriverManager.getConnection("", "", "");
        PreparedStatement preparedStatement = connection.prepareStatement("insert", Statement.RETURN_GENERATED_KEYS);
        preparedStatement.executeUpdate();
        ResultSet resultSet = preparedStatement.getGeneratedKeys();
    }
}
