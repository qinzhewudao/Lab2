package action;

import bookinfor.Author;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.opensymphony.xwork2.ActionSupport;

import bookcon.showbooks;

public class bookaction extends ActionSupport {

	private String ISBN;
	private String Title;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private String Price;

	private String Name;
	private String Age;
	private String Country;

	private List<Author> lista = new ArrayList<Author>();

	public List<Author> getLista() {
		return lista;
	}

	public void setLista(List<Author> lista) {
		this.lista = lista;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(String AuthorID) {
		this.AuthorID = AuthorID;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}

	public String getPublishDate() {
		return PublishDate;
	}

	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String Price) {
		this.Price = Price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getAge() {
		return Age;
	}

	public void setAge(String Age) {
		this.Age = Age;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String Country) {
		this.Country = Country;
	}

	public String execute() throws Exception {
		showbooks book = new showbooks();
		this.setLista(book.Choose(Name));
		return "success";
	}
	
	public String ShowAuthor() throws Exception {
		showbooks book = new showbooks();
		this.setLista(book.ChooseAuthor());
		return "success";
	}

	public String showDetails() throws Exception {
		showbooks info = new showbooks();
		this.setLista(info.showDetails(Title));
		return "success";
	}
    
	public String delete() throws Exception {
		showbooks one = new showbooks();
		this.setLista(one.deleteOne(AuthorID));
		return "deleteok";
	}

	public String judgeAuthor() throws Exception {
		showbooks book = new showbooks();
		this.setLista(book.queryAuthor(Name));
		if (lista.isEmpty()) {
			return "notinauthor";
		}
		else{
			return "addalready";	
		}
	}

	public String addAuthor() throws Exception {
		showbooks book = new showbooks();
		this.setLista(book.addOneAuthor(AuthorID, Name, Age, Country));
		return "addauthorok";
	}
	
	public String addBook() throws Exception {
		showbooks book = new showbooks();
		this.setLista(book.addOneBook(ISBN, Title, AuthorID, Publisher,PublishDate, Price)); 
		return "addbookok";
	}


	public String update() throws Exception {
		showbooks up = new showbooks();
		this.setLista(up.updateOne(AuthorID,Title, Publisher,PublishDate, Price));
		return "updateok";
	}
}