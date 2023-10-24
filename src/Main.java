import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> lis = new Pessoa().pessoas();

        lis.stream()
                .filter(pessoa -> pessoa.getGenero().startsWith("F"))
                .forEach(p -> System.out.println(p.getNome()));
    }
}
