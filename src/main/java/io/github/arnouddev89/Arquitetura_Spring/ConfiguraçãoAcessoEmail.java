package io.github.arnouddev89.Arquitetura_Spring;

import io.github.arnouddev89.Arquitetura_Spring.todos.MailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguraçãoAcessoEmail {

    @Autowired
    private AppProperties appProperties;

    //@Bean
    public MailSender mailSender(){
        return null;
    }
}
