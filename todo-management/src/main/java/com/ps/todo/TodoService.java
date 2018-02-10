package com.ps.todo;

import java.util.ArrayList;
import java.util.List;

import com.ps.todo.Todo;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();
	static{
		todos.add(new Todo("Learn Java", todos.size()+1, "Study"));
		todos.add(new Todo("Learn JSP and servlet", todos.size()+1, "Study"));
		todos.add(new Todo("Learn Spring", todos.size()+1, "Study"));
	}
	
	public static List<Todo> retrieveTodo(){

		return todos;
	}
	
	public static void addTodo(Todo todo){
		todos.add(new Todo(todo.getName(), todos.size()+1, todo.getCategory()));
	}
	
	public static void deleteTodo(Todo todo){
		todos.remove(todo);
	}
	
}
