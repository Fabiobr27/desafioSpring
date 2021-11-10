package com.SpringPrueba.Desafio3;

import com.SpringPrueba.Desafio3.entites.cliente;
import com.SpringPrueba.Desafio3.services.clienteServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio3Application implements CommandLineRunner {

    @Autowired
    private clienteServiceI ClienteServiceI;

    public static void main(String[] args) {
        SpringApplication.run(Desafio3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        cliente client1 = new cliente();
        client1.setNombre("Fabio");
        client1.setPrimerApellido("Benitez");
        client1.setSegundoApellido("Ramirez");
        client1.setDNI("12345678D");

        cliente client2 = new cliente();
        client2.setNombre("Luis");
        client2.setPrimerApellido("Hernandez");
        client2.setSegundoApellido("Garcia");
        client2.setDNI("87654321Z");

        ClienteServiceI.insert(client1);
        ClienteServiceI.insert(client2);

        ClienteServiceI.buscarTodo();
    }

}
