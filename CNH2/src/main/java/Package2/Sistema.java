package Package2;

import com.mycompany.cnh2.Prova;
import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Sistema {
    private Pessoa pessoa;
    private Exame exame;
    private Prova prova;
    private String [][] questoes;
    private String[] respostas;
    private boolean [] usadas;
    
    //Metodos personalizados
    
    public void liberar2Tentativa() { // limitar, após selecionar a segunda tentativa de um teste, n será mais possivel
        if (pessoa.getTentativaM() <= 2 && pessoa.getTentativaPr() <= 2 && pessoa.getTentativaPs() <= 2 && pessoa.getTentativaT() <= 2) {
        pessoa.setTentativaM(2);
        pessoa.setTentativaPs(2);
        pessoa.setTentativaPr(2);
        pessoa.setTentativaT(2);
        JOptionPane.showMessageDialog(null, "2º Tentativa liberada");
        }
    }
    
    public void reiniciarUsada() {
        for (int i = 0; i < usadas.length; i++) {
            usadas[i] = false;
        }
    }
    
    public List<Integer> sortearQuestao(int max) { //Ver como a questão sorteada ter a resposta certa
        if (pessoa.getTentativaT() <=2) {
        List<Integer> naoUsada = new ArrayList<>(); // lista das questões não usadas
        List<Integer> numerosSorteados = new ArrayList<>();
        
        
        for (int l = 0; l < usadas.length; l++) {
            if (!usadas[l]) {
                naoUsada.add(l);
                break; // para o for, e chaga as questoes não usadas
            }
        }
        if (naoUsada.isEmpty()) { // se todas forem usadas, ele reinicia
            reiniciarUsada();
            naoUsada.addAll(Arrays.asList(0, 1, 2, 3, 4)); // Adiciona o número de questões, só colocar até 19 q vão as 20
    }
        Random random = new Random();
        while (numerosSorteados.size() < 5) {
        int limite = naoUsada.get(random.nextInt(naoUsada.size()));
        numerosSorteados.add(limite);
        usadas[limite] = true;
        naoUsada.remove(Integer.valueOf(limite));
    }
        
    return numerosSorteados; // armazena a informação no array
    }
        return null;
    }
    
   
    public void regisResultado() { // n confia em nada aqui
    int resul = exame.getAcertos();
    int maxQuestoes = prova.getRespostaSelecionada().length;

    for (int m = 0; m < maxQuestoes; m++) {
        ArrayList<String> correta = prova.getRespostas();
        String resposCidadao = prova.getRespostaSelecionada()[m];

        if (correta.equals(resposCidadao)) {
            resul++;
        }
    }

    double porcentagemAcertos = (double) resul / maxQuestoes * 100; // Aqui ta certo
    JOptionPane.showMessageDialog(null, "Sua porcentagem de acertos foi: "+porcentagemAcertos+"%");

    if (porcentagemAcertos > 60) {
        exame.setTeorico(true);
    } else {
        exame.setTeorico(false);
    }
}

    // metodos especiais
    
    public String[][] getQuestoes() {
        return questoes;
    }

    public void setQuestoes(String[][] questoes) {
        this.questoes = questoes;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String[] getRespostas() {
        return respostas;
    }

    public void setRespostas(String[] respostas) {
        this.respostas = respostas;
    }

    public boolean[] getUsadas() {
        return usadas;
    }

    public void setUsadas(boolean[] usadas) {
        this.usadas = usadas;
    }

    
}
