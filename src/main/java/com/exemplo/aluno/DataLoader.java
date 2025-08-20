package com.exemplo.aluno;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {
    @Bean
    CommandLineRunner initDatabase(AlunoRepository repository) {
        return args -> {
            Aluno aluno1 = new Aluno();
            aluno1.setNome("Maria Silva");
            aluno1.setCurso("Engenharia");
            aluno1.setIdade(22);
            repository.save(aluno1);

            Aluno aluno2 = new Aluno();
            aluno2.setNome("João Souza");
            aluno2.setCurso("Matemática");
            aluno2.setIdade(20);
            repository.save(aluno2);
        };
    }
}
