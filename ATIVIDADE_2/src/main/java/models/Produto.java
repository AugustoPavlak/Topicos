package models;

public class Produto {
	private Long id;
	private String name;
	private String image_url;
	private Double price;
	private String description;
	
	public Produto(Long id, String name, String image_url, Double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.image_url = image_url;
		this.price = price;
		this.description = description;
	}
	
	public Produto() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	} 
	
}
