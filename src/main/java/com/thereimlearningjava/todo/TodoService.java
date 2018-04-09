package com.thereimlearningjava.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList();
	static {
		todos.add(new Todo("Learn JEE development", "Frank"));
		todos.add(new Todo("Spring MVC", "Lool"));
		todos.add(new Todo("Spring Rest Services", "Jamie"));
	}
	
	public List<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todos.add(todo);
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
		
	}
}
