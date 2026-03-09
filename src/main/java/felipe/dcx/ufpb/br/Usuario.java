package felipe.dcx.ufpb.br;

public class Usuario {

    private String cpf;
    private String nome;
    private String telefone;

    public Usuario(String cpf, String nome, String teleofne){
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = teleofne;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
