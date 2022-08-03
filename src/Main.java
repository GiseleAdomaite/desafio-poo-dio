import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescicao("O mellhor curso de Java da sua vida!!! ");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescicao("O mellhor curso de JS da sua vida!!! ");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Melhor mentor(a) de Java");
        mentoria.setData(LocalDate.now()); // informa a data atual.

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}