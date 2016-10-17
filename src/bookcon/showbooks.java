package bookcon;

import bookinfor.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.opensymphony.xwork2.ActionContext;

import bookcon.bookconnect;

public class showbooks{


	List<Author> lista = new ArrayList<Author>();

	private Connection conn = null;
	private bookconnect bookcon = new bookconnect();



	public List<Author> Choose(String na) throws Exception {
		lista = new ArrayList<Author>();
		try {
			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "SELECT book.ISBN AS ISBN,book.Title AS Title,book.AuthorID AS AuthorID,book.Publisher AS Publisher,book.PublishDate AS PublishDate,book.Price AS Price,Author.Name AS Name,Author.Age AS Age,Author.Country AS Country FROM book JOIN Author  ON Author.AuthorID=book.AuthorID  where Author.Name ="+ "'" + na + "'";
			ResultSet set = stat.executeQuery(sqlStatement);
			while (set.next()) {
				Author Author = new Author();
				Author.setTitle(set.getString("Title"));   
				Author.setAuthorID(set.getString("AuthorID")); //showDetails()通过AuthorID查找information，故必须有
				lista.add(Author);
			}
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Author> ChooseAuthor() throws Exception {
		lista = new ArrayList<Author>();

			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "SELECT Name FROM Author";
			ResultSet set = stat.executeQuery(sqlStatement);
			while (set.next()) 
			{
				Author Author = new Author();
				Author.setName(set.getString("Name"));
				lista.add(Author);
			}
			conn.close(); // 关闭数据库连接


		return lista;
	}

	public List<Author> showDetails(String tit) throws Exception {
		lista = new ArrayList<Author>();
		try {
			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "SELECT book.ISBN AS ISBN,book.Title AS Title,book.AuthorID AS AuthorID,book.Publisher AS Publisher,book.PublishDate AS PublishDate,book.Price AS Price,Author.Name AS Name,Author.Age AS Age,Author.Country AS Country FROM book JOIN Author  ON Author.AuthorID=book.AuthorID  where book.Title="+ "'" + tit + "'";
			ResultSet set = stat.executeQuery(sqlStatement);
			while (set.next()) {
				Author Author = new Author();
				Author.setName(set.getString("Name"));
				Author.setCountry(set.getString("Country"));
				Author.setAge(set.getString("Age"));
				Author.setAuthorID(set.getString("AuthorID"));
				Author.setISBN(set.getString("ISBN"));
				Author.setTitle(set.getString("Title"));
				Author.setPublisher(set.getString("Publisher"));
				Author.setPublishDate(set.getString("PublishDate"));
				Author.setPrice(set.getString("Price"));
				lista.add(Author);
			}
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public List<Author> deleteOne(String id) throws Exception {
		lista = new ArrayList<Author>();
		try {
			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "DELETE from book where AuthorID ="+ "'" + id + "'";
			stat.executeUpdate(sqlStatement);
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Author> addOneBook(String isn,String tit,String id,String pub,String pubdt,String pri)
    {
		lista = new ArrayList<Author>();
		try {
        	conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "INSERT into book (ISBN,Title,AuthorID,Publisher,PublishDate,Price) values ('" +isn+ "','"+tit+ "','"+ id+ "','"+pub+ "','"+ pubdt+ "','"+ pri+ "')";
			stat.executeUpdate(sqlStatement);			
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
    }
	
	public List<Author> addOneAuthor(String id,String na,String ag,String conty)
    {
		lista = new ArrayList<Author>();
		try {
        	conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "INSERT into Author (AuthorID,Name,Age,Country) values ('" +id+ "','"+na+ "','"+ ag+ "','"+conty+  "')";
			stat.executeUpdate(sqlStatement);			
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
    }
	
	public List<Author> updateOne(String id,String tit,String pub,String pubdt,String pri) //更新book
    {
		lista = new ArrayList<Author>();
		try {
			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "UPDATE book SET Publisher='"+pub+"',PublishDate='"+pubdt+"',Price='"+pri+"',AuthorID='"+id+"'where Title="+ "'" + tit + "'";
			stat.executeUpdate(sqlStatement);
            conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
    }

	public List<Author> queryAuthor(String na) throws Exception {
		lista = new ArrayList<Author>();
		try {
			conn = bookcon.GetConn();
			Statement stat = conn.createStatement();
			String sqlStatement = "SELECT AuthorID , Name , Age , Country FROM  Author  where Author.Name="+ "'" + na + "'";
			ResultSet set = stat.executeQuery(sqlStatement);
			while (set.next()) {
				Author Author = new Author();
				Author.setName(set.getString("Name"));
				Author.setCountry(set.getString("Country"));
				Author.setAge(set.getString("Age"));
				Author.setAuthorID(set.getString("AuthorID"));
				lista.add(Author);
			}
			conn.close(); // 关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}
}