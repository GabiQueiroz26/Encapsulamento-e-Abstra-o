public class Livraria {

    private String nomeLivro;
    private String nomeAutor;
    private String editora;
    private Double preco;

    public Livraria(String nomeLivro, String nomeAutor, String editora, Double preco) {
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.editora = editora;
        this.preco = preco;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) throws Exception {
        if(preco < 0){
            this.preco = preco;
        }else {
            throw new Exception("Preço");
        }
    }

    @Override
    public String toString() {
        return "Livraria [ Livro = " + nomeLivro + ", Autor(a) = " + nomeAutor + ", Editora = " + editora + ", Preço = $"  + preco + "]";
    }
    
}
