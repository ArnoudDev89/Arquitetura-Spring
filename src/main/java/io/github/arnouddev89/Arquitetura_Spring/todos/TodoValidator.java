package io.github.arnouddev89.Arquitetura_Spring.todos;


import org.springframework.stereotype.Component;

@Component
public class TodoValidator {

    private TodoRepository repository;


    public TodoValidator(TodoRepository repository) {
        this.repository = repository;
    }

    public void validar(TodoEntity todo){
        if(existeTodoComDescricao(todo.getDescricao())){
            throw new IllegalArgumentException(
                    "já existe um TODO com esta descricao!");
        }
    }
    public boolean existeTodoComDescricao(String descricao){
        return repository.existsByDescricao(descricao);
    }
}