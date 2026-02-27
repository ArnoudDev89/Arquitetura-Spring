package io.github.arnouddev89.Arquitetura_Spring;

import io.github.arnouddev89.Arquitetura_Spring.todos.*;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ExemploInjecaoDependencia {
    public static void main(String[] args) throws Exception {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("url");
        dataSource.setUrl("user");
        dataSource.setUrl("password");

        Connection connection = dataSource.getConnection();

        EntityManager entityManager = null;

        TodoRepository repository = null;// SimpleJpaRepository<TodoEntity, Integer>();
        TodoValidator todoValidator = new TodoValidator(repository);
        MailSender sender = new MailSender();

        TodoService todoservice = new TodoService(repository, todoValidator, sender);

        //BeanGerenciado beanGerenciado = new BeanGerenciado(null);
        //beanGerenciado.setValidator(todoValidator);
        //if(condicao == true){
            //beanGerenciado.setValidator();
    }
}
