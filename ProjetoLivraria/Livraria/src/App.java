import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do livro:");
        String nomeLivro = sc.nextLine();
        System.out.println("Digite o nome do autor do livro:");
        String nomeAutor =  sc.nextLine();
        System.out.println("Digite o nome da editora do livro: ");
        String editora =  sc.nextLine();
        System.out.println("Digite o preço do livro: ");
        Double preco =  sc.nextDouble();

        Livraria l = new Livraria(nomeLivro, nomeAutor, editora, preco);

       // System.out.printf(String.format("Nome do livro: %s \n" + "Nome do Autor(a): %s \n" + "Nome da Editora: %s \n" + "Preço do Livro: %d \n", l.getNomeLivro(), l.getNomeAutor(), l.getEditora(), l.getPreco()));

       System.out.println(l.toString());
        
        sc.close();
    }
}
