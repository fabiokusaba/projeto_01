public class Pessoa {
    private String nome;
    private String email;
    private int idade;
    private String profissao;
    private String telefone;

    public Pessoa() {}

    public Pessoa(String nome, String email, int idade, String profissao, String telefone) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.profissao = profissao;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void apresentarse() {
        System.out.println("Prazer, me chamo " + this.nome + " tenho " + this.idade + " e sou " + this.profissao);
    }
}
