package Package2;

import javax.swing.JOptionPane;
import java.util.Random;

public class Boleto {
    private String tipo;
    private double valor, vencimento;
    int id;
    private Pessoa pessoa;
    int status = 0;
    
    //Metodos personalizados
    
    public Boleto() { // gera o id do boleto
        
        int limiteNumeros = 100000000;
        Random random = new Random();
        this.id = random.nextInt(limiteNumeros);
        
        // ver se tem o limite de 8 digitos, fique a vontade para mudar
        while (String.valueOf(this.id).length() < 8) {
            this.id = this.id * 10; // adiciona zeros
        }
    }

    public void emitirBoleto() {
        this.setTipo("Primeira via");
        this.setValor(128.06);
        JOptionPane.showMessageDialog(null, ""
                + "---------------------------------------"
                + "Id: " +this.getId()+""
                + "Nome" +pessoa.getNome()+""
                + "Valor: " +this.getValor()+""
                + "Vencimento: " +this.getVencimento()+""
                + "Tipo: " +this.getTipo()+""
                + "Status: " +this.getStatus());
    }
    
    public void emitirRenovação () {
        this.setTipo("Renovação");
        this.setValor(179.38);
        JOptionPane.showMessageDialog(null, ""
                + "---------------------------------------"
                + "Id: " +this.getId()+""
                + "Nome" +pessoa.getNome()+""
                + "Valor: " +this.getValor()+""
                + "Vencimento: " +this.getVencimento()+""
                + "Tipo: " +this.getTipo()+""
                + "Status: " +this.getStatus());
    }
    
    public void emitirSegundaVia() {
        this.setTipo("Segunda via");
        this.setValor(78.36);
        JOptionPane.showMessageDialog(null, ""
                + "---------------------------------------"
                + "Id: " +this.getId()+""
                + "Nome" +pessoa.getNome()+""
                + "Valor: " +this.getValor()+""
                + "Vencimento: " +this.getVencimento()+""
                + "Tipo: " +this.getTipo()+""
                + "Status: " +this.getStatus());
    }
    
    public void pagar() {
        if (status == 0) {
            status = 1;
            JOptionPane.showMessageDialog(null, "Boleto pago com sucesso");
            if (status == 1) {
                JOptionPane.showMessageDialog(null, "Boleto já foi pago");
            } else {
            JOptionPane.showMessageDialog(null, "Boleto foi cancelado");
        }
        }
        }
    
    public void cancelar() {
        if (status == 0) {
            status = 2;
            JOptionPane.showMessageDialog(null, "Boleto cancelado com sucesso");
        } else { if (status == 2) {
            JOptionPane.showMessageDialog(null, "Boleto já foi cancelado");
        } else {
            JOptionPane.showMessageDialog(null, "Boleto foi pago");
        }
    }
    }
    
    // metodos especiais
    
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getVencimento() {
        return vencimento;
    }

    public void setVencimento(double vencimento) {
        this.vencimento = vencimento;
    }
    
}