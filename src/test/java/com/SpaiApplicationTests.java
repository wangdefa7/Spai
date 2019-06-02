package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import com.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpaiApplicationTests {
/*	@Resource
	private JdbcTemplate jdbcTemplate;*/
	/**
	 * Mysql集成Spring Boot简单测试
 */
	//@Test
/*	public void mySqlTest(){
		String sql = "select id,name,password from user";
		
		//System.out.println(jdbcTemplate.queryForList(sql));
		//query()方法：JdbcTemplate对象中的查询方法，通过传入sql语句和RowMapper对象，可以查询出数据库中的数据
		//RowMapper对象：RowMapper对象可以将查询出的每一行数据封装成用户定义的类，
		//在上面代码中，通过调用RowMapper中的方法mapRow，数据库中的每一行数据封装成AyUser对象，返回回去
		List<User> userList =(List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			}
		});
		System.out.println("查询成功：");
		for(User user:userList){
		   System.out.println("【id】: " + user.getId() + "；【name】: " + user.getName());
		}
	}

	
	*/
/*@Test
public void test() {
	Connection conn = null;
    String sql;
    // MySQL的JDBC URL编写方式：jdbc:mysql://主机名称：连接端口/数据库的名称?参数=值
    // 避免中文乱码要指定useUnicode和characterEncoding
    // 执行数据库操作之前要在数据库管理系统上创建一个数据库，名字自己定，
    // 下面语句之前就要先创建javademo数据库
    String url = "jdbc:mysql://localhost:3306/spai?"
            + "user=wdf&password=wdfwdf&useUnicode=true&characterEncoding=UTF8";

    try {
        // 之所以要使用下面这条语句，是因为要使用MySQL的驱动，所以我们要把它驱动起来，
        // 可以通过Class.forName把它加载进去，也可以通过初始化来驱动起来，下面三种形式都可以
        Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
        // or:
        // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
        // or：
        // new com.mysql.jdbc.Driver();

        System.out.println("成功加载MySQL驱动程序");
        // 一个Connection代表一个数据库连接
        conn = DriverManager.getConnection(url);
        // Statement里面带有很多方法，比如executeUpdate可以实现插入，更新和删除等
        Statement stmt = conn.createStatement();
        sql = "create table student(NO char(20),name varchar(20),primary key(NO))";
        int result = stmt.executeUpdate(sql);// executeUpdate语句会返回一个受影响的行数，如果返回-1就没有成功
        if (result != -1) {
            System.out.println("创建数据表成功");
            sql = "insert into student(NO,name) values('2012001','陶伟基')";
            result = stmt.executeUpdate(sql);
            sql = "insert into student(NO,name) values('2012002','周小俊')";
            result = stmt.executeUpdate(sql);
            sql = "select * from student";
            ResultSet rs = stmt.executeQuery(sql);// executeQuery会返回结果的集合，否则返回空值
            System.out.println("学号\t姓名");
            while (rs.next()) {
                System.out
                        .println(rs.getString(1) + "\t" + rs.getString(2));// 入如果返回的是int类型可以用getInt()
            }
        }
    } catch (SQLException e) {
        System.out.println("MySQL操作错误");
        e.printStackTrace();
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}*/

}
