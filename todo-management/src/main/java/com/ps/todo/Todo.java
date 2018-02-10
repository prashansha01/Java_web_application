package com.ps.todo;

public class Todo {
	private String name;
	private int id;
	private String category;

	public Todo(String name, String category) {
		super();
		this.name = name;
		this.category=category;
	}
	
	public Todo(String name, int id, String category) {
		super();
		this.name = name;
		this.id= id;
		this.category = category;
	}
	public Todo (int id){
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Todo [name=" + name + ", id=" + id + ", category=" + category
				+ "]";
	}

}
