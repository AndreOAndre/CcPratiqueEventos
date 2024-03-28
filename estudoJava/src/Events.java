import java.text.DateFormat;

public class Events {
    private String nome;
    private String horario;
    private String categoria;
    private String endereco;
    private String descricao;
    private String cidade;

    public void atribuirNomeEvento(String nomeEvento) {
        this.nome = nomeEvento;
    }

    public void atribuirhorarioEvento(String horarioEvento) {
        this.horario = horarioEvento;
    }

    public void atribuirCategoriaEvento(String categoriaEvento) {
        this.categoria = categoriaEvento;
    }

    public void atribuirEnderecoEvento(String enderecoEvento) {
        this.endereco = enderecoEvento;
    }

    public void atribuirDescricaoEvento(String descricaoEvento) {
        this.descricao = descricaoEvento;
    }

    public void atribuirCidadeEvento(String cidadeEvento) {
        this.cidade = cidadeEvento;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCidade() {
        return cidade;
    }


//    public void atribuirCidadeEvento(String cidadeEvento) {
//        this.cidade = cidadeEvento;
//    }


//    void criaEvents() {
//        System.out.println("nome: " + this.nome);
//        System.out.println("endereco: " + this.endereco);
//        System.out.println("cidade: " + this.cidade);
//
//    }


}