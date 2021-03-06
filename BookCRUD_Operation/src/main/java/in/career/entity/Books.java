package in.career.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	@Id
	private Long id;
	private String title;
	private String author;
	private Integer year;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}

	public Books(Long id, String title, String author, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
	

}
