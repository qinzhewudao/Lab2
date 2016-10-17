package bookinfor;

public class Author {
	private String Name;
	private String Age;
	private String Country;
	private String ISBN;
	private String Title;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private String Price;


	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
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
	
	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
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

	public String getAuthorID() {
		return AuthorID;
	}

	public void setAuthorID(String AuthorID) {
		this.AuthorID = AuthorID;
	}
}
