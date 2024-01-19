package Package2;

import javax.swing.JOptionPane;

public class Exame {
    private boolean medico,psicologico, pratico, teorico;
    private double dataMedico = 0, dataPsicoloco = 0, dataPratico = 0;
    private int acertos = 0;
    private Sistema sistema;
    private Pessoa pessoa;
    //Metodos personalizados
    
    public void agendarExame() {
        if (this.getDataMedico() == 0) {
            this.setDataMedico(Double.parseDouble(JOptionPane.showInputDialog("Insira a data desejada para realizar"
                    + " o exame médico, por favor.")));
        }
            if (this.getDataPratico() == 0) {
                this.setDataPratico(Double.parseDouble(JOptionPane.showInputDialog("Insira a data desejada para realizar "
                        + "o exame pratico, por favor.")));
            } 
                if (this.getDataPsicoloco() == 0) {
                    this.setDataPsicoloco(Double.parseDouble(JOptionPane.showInputDialog("Insira a data desejada para realizar"
                            + " o exame psicológico, por favor.")));
                } else {
                    JOptionPane.showMessageDialog(null, "Todos os medicos estão agendados");
                }
                
    }
    
    
    public void alterarDataExame() { // igual o outro, só muda o texto
        if (this.getDataMedico() != 0) {
            this.setDataMedico(Integer.parseInt(JOptionPane.showInputDialog("Data anterior: "
                    + "" + this.getDataMedico() + "\n\n" + "Insira a data desejada, ou confirme a anterior.")));
        }
            if (this.getDataPratico() != 0) {
                this.setDataPratico(Integer.parseInt(JOptionPane.showInputDialog("Data anterior: "
                        + "" + this.getDataPratico() + "\n\n" + "Insira a data desejada, ou confirme a anterior.")));
            }
                if (this.getDataPsicoloco() != 0) {
                    this.setDataPsicoloco(Integer.parseInt(JOptionPane.showInputDialog("Data anterior: "
                            + "" + this.getDataPsicoloco() + "\n\n" + "Insira a data desejada, ou confirme a anterior.")));
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum exame agendado");
                }
    }
            
    public void confirAprovação() {
        if (this.getDataMedico() != 0 && pessoa.getTentativaM() != 2) {
            this.setMedico(true);
        } else { 
            if (this.getDataPratico() != 0 && pessoa.getTentativaPr() != 2) {
            this.setPratico(true);
        } else {
            if (this.getDataPsicoloco() != 0 && pessoa.getTentativaPs() != 2) {
            this.setPsicologico(true);
        } else {
            this.setMedico(false);
            this.setPratico(false);
            this.setPsicologico(false);
        }
            
        }
        }
    }
    
    public void confirReprovação() {
        if (this.isMedico() == false)  {
            pessoa.setTentativaM(pessoa.getTentativaM() + 1);
        }
        if (this.isPratico() == false) {
            pessoa.setTentativaPr(pessoa.getTentativaPr() + 1);
        }
        if (this.isPsicologico() == false) {
            pessoa.setTentativaPs(pessoa.getTentativaPs() + 1);
        }
        if (this.isTeorico() == false) {
            pessoa.setTentativaT(pessoa.getTentativaT() + 1);
        }
    }
    
    public void regisResulExame() { // armazenar a infomação
        this.isMedico();
        this.isPratico();
        this.isPsicologico();
        sistema.regisResultado();
    }
    
    // metodos especiais

    public boolean isMedico() {
        return medico;
    }

    public void setMedico(boolean medico) {
        this.medico = medico;
    }

    public boolean isPsicologico() {
        return psicologico;
    }

    public void setPsicologico(boolean psicologico) {
        this.psicologico = psicologico;
    }

    public boolean isPratico() {
        return pratico;
    }

    public void setPratico(boolean pratico) {
        this.pratico = pratico;
    }

    public boolean isTeorico() {
        return teorico;
    }

    public void setTeorico(boolean teorico) {
        this.teorico = teorico;
    }

    public double getDataMedico() {
        return dataMedico;
    }

    public void setDataMedico(double dataMedico) {
        this.dataMedico = dataMedico;
    }

    public double getDataPsicoloco() {
        return dataPsicoloco;
    }

    public void setDataPsicoloco(double dataPsicoloco) {
        this.dataPsicoloco = dataPsicoloco;
    }

    public double getDataPratico() {
        return dataPratico;
    }

    public void setDataPratico(double dataPratico) {
        this.dataPratico = dataPratico;
    }

    public int getAcertos() {
        return acertos;
    }

    public void setAcertos(int acertos) {
        this.acertos = acertos;
    }
    
    
    
}