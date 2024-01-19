package Package2;

import javax.swing.JOptionPane;

public class Cnh {
    private double dataDaEmissao, validade;
    private String assinatura, tipo;
    private Pessoa pessoa;
    //Metodos personalizados

    public Cnh(double dataDaEmissao, double validade, String assinatura, String tipo, Pessoa pessoa) {
        this.dataDaEmissao = dataDaEmissao;
        this.validade = validade;
        this.assinatura = assinatura;
        this.tipo = tipo;
        this.pessoa = pessoa;
    }
    
    public void mostrarCnh() {
        JOptionPane.showMessageDialog(null, ""
                + "Dados do cliente de cpf: "+pessoa.getCpf()+"\n\n"
                + "Nome: " +pessoa.getNome()+"\n"
                + "Data de emissão: " +this.getDataDaEmissao()+"\n"
                + "Validade: " +this.getValidade()+"\n"
                + "Assinatura:  " +this.getAssinatura()+"\n"
                + "Tipo: " +this.getTipo());
    }
    
    public void alertarDetran() {
        JOptionPane.showMessageDialog(null,""
                + "Informações enviadas, sua CNH física estará disponível entre 5 a 7 dias úteis\n "
                + "Por favor, fique atento as datas ");
                                            
    }
    
    // metodos especiais

    public double getDataDaEmissao() {
        return dataDaEmissao;
    }

    public void setDataDaEmissao(double dataDaEmissao) {
        this.dataDaEmissao = dataDaEmissao;
    }

    public double getValidade() {
        return validade;
    }

    public void setValidade(double validade) {
        this.validade = validade;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}