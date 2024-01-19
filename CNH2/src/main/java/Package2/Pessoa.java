package Package2;

public class Pessoa {
    private String nome;
    private String endereco;
    private int idade;
    private int tentativa;
    private int cpf;
    private int senha;
    private int tentativaM = 0, tentativaPr = 0, tentativaPs = 0, tentativaT = 0;
    
    public Pessoa(){}

    public int getTentativaM() {
        return tentativaM;
    }

    public void setTentativaM(int tentativaM) {
        this.tentativaM = tentativaM;
    }

    public int getTentativaPr() {
        return tentativaPr;
    }

    public void setTentativaPr(int tentativaPr) {
        this.tentativaPr = tentativaPr;
    }

    public int getTentativaPs() {
        return tentativaPs;
    }

    public void setTentativaPs(int tentativaPs) {
        this.tentativaPs = tentativaPs;
    }

    public int getTentativaT() {
        return tentativaT;
    }

    public void setTentativaT(int tentativaT) {
        this.tentativaT = tentativaT;
    }

    public Pessoa(String a, String b, int c, int d, int e, int f) {
        this.setNome(a);
        this.setEndereco(b);
        this.setIdade(c);
        this.setTentativa(d);
        this.setCpf(e);
        this.setSenha(f);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getTentativa() {
        return tentativa;
    }

    public void setTentativa(int tentativa) {
        this.tentativa = tentativa;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
      
}
