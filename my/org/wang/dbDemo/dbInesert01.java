package org.wang.dbDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class dbInesert01 {
	// 定义mysql的驱动程序
	public static final String DBDRIVER = "org.gjt.mm.mysql.Driver";
	// 定义mysql的连接地址
	public static final String DBURL = "jdbc:mysql://localhost:3306/wang";
	public static final String DBUSER = "root";
	public static final String DBPASS = "wang";
	/*
	 * INSERT INTO user(name,password,age,sex,birthday) VALUES
	 * ('李兴华','www.mldn.cn',30,'男','2008-08-27') ; INSERT INTO
	 * user(name,password,age,sex,birthday) VALUES
	 * ('李康','www.mldnjava.cn',23,'女','2005-08-27') ;
	 */
	public static void main(String[] args) throws Exception {
		Connection conn = null;// 连接数据库
		Statement stmt = null;// 数据库操作
		Class.forName(DBDRIVER);// 加载驱动程序
		String sql = "INSERT INTO user(name,password,age,sex,birthday)"
				+ " VALUES ('王耀光','wang',23,'男','1989-11-6');";
		conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
		stmt = conn.createStatement();// 实例化Staement对象
		stmt.executeUpdate(sql);//执行数据库更新操作
		stmt.close();//关闭操作
		conn.close(); // 关闭数据库
		System.out.println("插入成功");
	}
}
