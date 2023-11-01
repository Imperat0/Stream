package domain;

import java.util.List;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private String genero;

    private int idade;

    public Pessoa(String nome, String genero, Integer idade) {
        this.genero = genero;
        this.idade = idade;
        this.nome = nome;
    }

    public Pessoa() {

    }

    public Pessoa(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(genero, pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, idade);
    }

    @Override
    public String toString() {
        return "domain.Pessoa{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", idade=" + idade +
                '}';
    }


    public List<Pessoa> pessoas() {
        Pessoa pessoa1 = new Pessoa("Daniel", "M", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", "M", 21);
        Pessoa pessoa3 = new Pessoa("Laura", "F", 19);
        Pessoa pessoa4 = new Pessoa("Cintia", "F", 55);

        return List.of(pessoa1,pessoa2,pessoa3,pessoa4);
    }
}
