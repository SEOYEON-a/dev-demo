package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoRepository;


@Controller
public class TodoController {
	
	private final TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todo";
    }

    @PostMapping("/add")
    public String addTodo(@RequestParam String content) {
        todoRepository.save(new Todo(content));
        System.out.println("추가 요청 content = " + content);
        return "redirect:/";
    }
    
    @PostMapping("done/{id}")
    public String markDone(@PathVariable Long id) {
        todoRepository.findById(id).ifPresent(todo -> {
            todo.setDone(true);
            todoRepository.save(todo);
        });
        return "redirect:/";
    }

    // 삭제 처리
    @PostMapping("/delete/{id}")
    public String deleteTodo(@PathVariable Long id) {
        todoRepository.deleteById(id);
        return "redirect:/";
    }

}
