package objects;

public class Items {
	
	private Integer id;
	private String name;
	private String decription;
	
	public Items() {
		
	}
	
	public Items(Integer id, String name, String decription) {
		this.id = id;
		this.name = name;
		this.decription = decription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDecription() {
		return decription;
	}

	public void setDecription(String decription) {
		this.decription = decription;
	}
	
	
}
