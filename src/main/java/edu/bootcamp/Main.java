package edu.bootcamp;

import edu.bootcamp.domain.Bootcamp;


public class Main {
    public static void main(String[] args) {

        Bootcamp bootJava = new Bootcamp();
        bootJava.setName("Courso de Java do zero ao avançado");
        bootJava.setDescription("Este é um curso focado em iniciantes em programação Java");
        bootJava.setCategory("Dev Back-end");

        Bootcamp bootJs = new Bootcamp();
        bootJs.setName("Courso de JavaScript do zero ao avançado");
        bootJs.setDescription("Este é um curso focado em iniciantes em programação Js");
        bootJs.setCategory("Dev Front-end e Back-end");
    }
}