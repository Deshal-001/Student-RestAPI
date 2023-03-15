package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

   /* @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student s1= new Student("Kavindu Deshal", LocalDate.of(2001, Month.OCTOBER,16),"kavindu@gmail");
           Student s2=new Student("Himaru Deshan", LocalDate.of(2008, Month.SEPTEMBER,18),"kavindu@gmail");

            repository.saveAll(
                    List.of(s1,s2)
            );
        };
    }*/
}
