package objects;

import java.util.ArrayList;
import java.util.List;

public class Users {

	private String first;
	private String last;
	private List<Items> items;
	
	public Users() {
		
	}

	public Users(String first, String last) {
		this.first = first;
		this.last = last;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}
	
	public void addItem(Items anItem) {

		if (items == null) {
			items = new ArrayList<>();
		}
		items.add(anItem);
	}
	
}
