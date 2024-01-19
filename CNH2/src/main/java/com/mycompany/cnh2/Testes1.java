
package com.mycompany.cnh2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Testes1 {

    private static String[][] perguntasERespostas = {
            {"Qual é a cor do semáforo que indica 'pare'?", "Vermelho", "Amarelo", "Verde", "Azul", "A"},
            {"Qual a velocidade máxima permitida em vias urbanas?", "30 km/h", "60 km/h", "80 km/h", "100 km/h", "C"},
            {"O que significa a placa de trânsito com a letra 'R' em fundo azul?", "Regulamentação", "Advertência", "Indicação", "Parada obrigatória", "A"},
            {"O que indica a sinalização horizontal em forma de faixas transversais na pista?", "Área de pedestres", "Linha de divisa de fluxos opostos", "Faixa de pedestres", "Área de carga e descarga", "B"},
            {"Qual é a idade mínima para obter a Carteira Nacional de Habilitação (CNH) na categoria B?", "18 anos", "20 anos", "21 anos", "25 anos", "A"},
            {"Qual a documentação obrigatória para conduzir um veículo automotor?", "CNH e documento do veículo", "Passaporte e documento do veículo", "RG e documento do veículo", "Título de eleitor e documento do veículo", "A"},
            {"Em uma rotatória, qual o veículo tem a preferência de passagem?", "O veículo maior", "O veículo mais rápido", "O veículo que já estiver dentro da rotatória", "O veículo menor", "C"},
            {"O que significa a placa de trânsito com a letra 'E' em fundo amarelo?", "Estacionamento", "Escola", "Edificação", "Entrega", "B"},
            {"Qual é a penalidade para quem é flagrado dirigindo sob efeito de álcool?", "Multa e suspensão da CNH", "Apreensão do veículo e prisão", "Aumento do valor do IPVA", "Advertência por escrito", "A"},
            {"Qual a distância mínima que o condutor deve guardar ao ultrapassar uma bicicleta?", "1 metro", "1,5 metros", "2 metros", "2,5 metros", "B"}
            ,{" A utilização das vias por pessoas, veículos e animais é para fins de:", " Circulação, parada e estacionamento", " Circulação e estacionamento", " Circulação, parada, estacionamento e operação de carga ou descarga ", " Circulação, parada e operação de carga ou descarga ", "C"},
            {" As praias abertas à circulação pública e as vias internas pertencentes aos condomínios constituídos por unidades autônomas são, para efeito do Código de Trânsito Brasileiro, consideradas:", " Áreas autônomas", " Vias terrestres", " Vias privativas", " Áreas restritas", "B"},
            {" A fiscalização da gestão de trânsito poderá ser realizada com a utilização de aparelhos que, quanto ao modo de operação, podem ser classificados em:", " Automático e não automático", " Radar e medidor ótico", " Fixo, estátil, móvel e portátil ", " Eletrônico e audiovisual", "C"},
            {" A idade mínima para conduzir um veículo automotor com capacidade acima de 20 passageiros é:", "21 anos", "20 anos", "18 anos", "19 anos", "A"},
            {" Para habilitar-se na categoria D, o condutor deverá possuir no mínimo:", "1 ano na categoria B, ou 2 anos na categoria C", "2 anos na categoria B, ou 1 ano na categoria C ", " Somente 1 ano na categoria C ", " Somente 1 ano na categoria B", "B"},
            {" Marca, modelo, ano de cor, número do chassi, são:", " Características legais e essenciais do veículo ", " Acessórios do veículo ", " Características legais e essenciais do veículo", " Elementos utilizados, somente, para controle das montadoras de veículos", "A"}

    };

    private static List<JFrame> janelasPerguntas = new ArrayList<>();
    private static int pontuacao = 0;
    private static int totalPerguntas = 5;

    public static void main(String[] args) {
        embaralharPerguntas();
        exibirPergunta(0);
    }

    private static void embaralharPerguntas() {
        Random random = new Random();

        for (int i = perguntasERespostas.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            String[] temp = perguntasERespostas[index];
            perguntasERespostas[index] = perguntasERespostas[i];
            perguntasERespostas[i] = temp;
        }

        perguntasERespostas = Arrays.copyOfRange(perguntasERespostas, 0, 5);
    }

    private static void exibirPergunta(int index) {
        JFrame janela = new JFrame("Pergunta " + (index + 1));
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        JPanel perguntaPanel = new JPanel();
        JLabel perguntaLabel = new JLabel("<html>" + perguntasERespostas[index][0] + "</html>");
        perguntaLabel.setPreferredSize(new Dimension(400, 80));
        perguntaPanel.add(perguntaLabel);
       

        panel.add(perguntaPanel, BorderLayout.NORTH);

        JPanel opcoesPanel = new JPanel();
        opcoesPanel.setLayout(new BoxLayout(opcoesPanel, BoxLayout.Y_AXIS));
        JRadioButton opcaoA = new JRadioButton("A. " + perguntasERespostas[index][1]);
        JRadioButton opcaoB = new JRadioButton("B. " + perguntasERespostas[index][2]);
        JRadioButton opcaoC = new JRadioButton("C. " + perguntasERespostas[index][3]);
        JRadioButton opcaoD = new JRadioButton("D. " + perguntasERespostas[index][4]);

        ButtonGroup group = new ButtonGroup();
        group.add(opcaoA);
        group.add(opcaoB);
        group.add(opcaoC);
        group.add(opcaoD);

        opcoesPanel.add(opcaoA);
        opcoesPanel.add(opcaoB);
        opcoesPanel.add(opcaoC);
        opcoesPanel.add(opcaoD);

        panel.add(opcoesPanel, BorderLayout.CENTER);

        JButton submeterButton = new JButton("Submeter");
        submeterButton.setBackground(Color.RED);
        submeterButton.setForeground(Color.WHITE);
        submeterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String respostaCorreta = perguntasERespostas[index][5];
                String respostaSelecionada = null;

                if (opcaoA.isSelected()) {
                    respostaSelecionada = "A";
                } else if (opcaoB.isSelected()) {
                    respostaSelecionada = "B";
                } else if (opcaoC.isSelected()) {
                    respostaSelecionada = "C";
                } else if (opcaoD.isSelected()) {
                    respostaSelecionada = "D";
                }

                if (respostaSelecionada != null && respostaSelecionada.equals(respostaCorreta)) {
                    pontuacao++;
                }

                janela.dispose();

                if (index == totalPerguntas - 1) {
                    exibirResultado();
                } else {
                    exibirPergunta(index + 1);
                }
            }
        });

        JPanel submeterPanel = new JPanel();
        submeterPanel.add(submeterButton);

        panel.add(submeterPanel, BorderLayout.SOUTH);

        janela.getContentPane().add(panel);
        janela.setVisible(true);

        janelasPerguntas.add(janela);
    }

    private static void exibirResultado() {
        for (JFrame janela : janelasPerguntas) {
            janela.dispose();
        }

        double porcentagemAcerto = (double) pontuacao / totalPerguntas * 100;

        String resultado;
        if (pontuacao >= 3) {
            resultado = "APROVADO";
        } else {
            resultado = "REPROVADO";
        }

        if (pontuacao >= 3) {
            JOptionPane.showMessageDialog(null, "Sua pontuação: " + pontuacao + "/" + totalPerguntas +
                    " (" + porcentagemAcerto + "% de acerto)" + "\n" + resultado);
            new Aprovado().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Sua pontuação: " + pontuacao + "/" + totalPerguntas +
                    " (" + porcentagemAcerto + "% de acerto)" + "\n" + resultado);
           
            new Reprovacao2().setVisible(true);
        }

        pontuacao = 0;
        
        
    }

    public static int getPontuacao() {
        return pontuacao;
    }

    public static void setPontuacao(int pontuacao) {
        Testes1.pontuacao = pontuacao;
    }
    
    
}