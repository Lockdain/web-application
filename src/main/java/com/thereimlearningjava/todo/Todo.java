package com.thereimlearningjava.todo;

public class Todo {
	
	private String name;
	private String category;
	private int id;
	
	public Todo(String name, String category) {
		super();
		this.name = name;
		this.id = System.identityHashCode(name);
		this.category = category;
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
	public String toString() {
		return "Todo [name=" + name + ", category=" + category + "]";
	}

	public Todo(int id) {
		super();
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

}
