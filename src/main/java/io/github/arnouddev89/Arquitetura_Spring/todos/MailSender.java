package io.github.arnouddev89.Arquitetura_Spring.todos;


import org.springframework.stereotype.Component;

@Component
public class MailSender {

    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem: " + mensagem);
    }
}
