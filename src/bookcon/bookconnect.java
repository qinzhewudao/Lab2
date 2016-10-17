package bookcon;

import java.sql.Connection;
import java.sql.DriverManager;

public class bookconnect {
	private String url = "jdbc:mysql://dumneerzmkfk.rds.sae.sina.com.cn:10429/bookdb?useUnicode=true&characterEncoding=utf-8&useSSL=false";
	private String username = "root";
	private String  password = "19960814";
	public Connection  GetConn() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = null;
		conn = DriverManager.getConnection(url, username, password);
		return conn;
	}
}
/**/