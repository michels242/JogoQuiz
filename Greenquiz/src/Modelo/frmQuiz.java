package Modelo;

import Apresentacao.frmMenuPrincipal;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class frmQuiz extends absPropriedades implements ActionListener
{
    //Formulario Jframe e componentes.
    JFrame frame = new JFrame();
    JTextField txf = new JTextField();
    JTextArea txa = new JTextArea();
    JButton btnA = new JButton();
    JButton btnB = new JButton();
    JButton btnC = new JButton();
    JButton btnD = new JButton();
    JButton btnMenu = new JButton();
    JLabel lblRespostaA = new JLabel();
    JLabel lblRespostaB = new JLabel();
    JLabel lblRespostaC = new JLabel();
    JLabel lblRespostaD = new JLabel();
    JLabel lblTempo = new JLabel();
    JLabel lblTempoRestante = new JLabel();
    JTextField txfNumeroCerto = new JTextField();
    JTextField txfPorcentagem = new JTextField();
    
    //timer da contagem regressiva, ele tbm trata a pergunta como errada e pula para a proxima quando o tempo se esgota.
    Timer timer = new Timer(1000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tempo--;
                lblTempoRestante.setText(String.valueOf(tempo));
                if(tempo <= 0)
                {
                    mostrarResposta();
                }
            }
        });
    
    public frmQuiz()
    {
        //configuraçoes corpo do form.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);  
        frame.setLocationRelativeTo(null);
        frame.setTitle("Green Quiz");
        
        //configuração txf que contem o numero da pergunta que o jogador esta.
        txf.setBounds(0,0,800,50);
        txf.setBackground(new Color(25,25,25));
        txf.setForeground(new Color(25,255,0));
        txf.setFont(new Font("Ink Free",Font.BOLD,30));
        txf.setBorder(BorderFactory.createBevelBorder(1));
        txf.setHorizontalAlignment(JTextField.CENTER);
        txf.setEditable(false);
        
        //configuraçao txa que exibira a pergunta.
        txa.setBounds(0,50,800,50);
        txa.setLineWrap(true);
        txa.setWrapStyleWord(true);
        txa.setBackground(new Color(25,25,25));
        txa.setForeground(new Color(25,255,0));
        txa.setFont(new Font("Agency FB",Font.BOLD,21));
        txa.setBorder(BorderFactory.createBevelBorder(1));
        txa.setEditable(false);
        
        //configuração dos botoes das alternativas.
        btnA.setBounds(0,100,100,100);
        btnA.setFont(new Font("MV Boli",Font.BOLD,35));
        btnA.setFocusable(false);
        btnA.addActionListener(this);
        btnA.setText("A");
        
        btnB.setBounds(0,200,100,100);
        btnB.setFont(new Font("MV Boli",Font.BOLD,35));
        btnB.setFocusable(false);
        btnB.addActionListener(this);
        btnB.setText("B");
        
        btnC.setBounds(0,300,100,100);
        btnC.setFont(new Font("MV Boli",Font.BOLD,35));
        btnC.setFocusable(false);
        btnC.addActionListener(this);
        btnC.setText("C");
        
        btnD.setBounds(0,400,100,100);
        btnD.setFont(new Font("MV Boli",Font.BOLD,35));
        btnD.setFocusable(false);
        btnD.addActionListener(this);
        btnD.setText("D");
        
        btnMenu.setBounds(10,550,170,40);
        btnMenu.setFont(new Font("MV Boli",Font.BOLD,18));
        btnMenu.setFocusable(false);
        btnMenu.addActionListener(this);
        btnMenu.setText("Menu Principal");
        
        //configuração dos lbls (texto das alternativas).
        lblRespostaA.setBounds(125,100,650,100);
        lblRespostaA.setBackground(new Color(50,50,50));
        lblRespostaA.setForeground(new Color(25,255,0));
        lblRespostaA.setFont(new Font("Agency FB",Font.PLAIN,23));
        
        lblRespostaB.setBounds(125,200,650,100);
        lblRespostaB.setBackground(new Color(50,50,50));
        lblRespostaB.setForeground(new Color(25,255,0));
        lblRespostaB.setFont(new Font("Agency FB",Font.PLAIN,23));
        
        lblRespostaC.setBounds(125,300,650,100);
        lblRespostaC.setBackground(new Color(50,50,50));
        lblRespostaC.setForeground(new Color(25,255,0));
        lblRespostaC.setFont(new Font("Agency FB",Font.PLAIN,23));
        
        lblRespostaD.setBounds(125,400,650,100);
        lblRespostaD.setBackground(new Color(50,50,50));
        lblRespostaD.setForeground(new Color(25,255,0));
        lblRespostaD.setFont(new Font("Agency FB",Font.PLAIN,23));
        
        //configuração do cronômetro que aparece no form.
        lblTempoRestante.setBounds(670,510,100,100);
        lblTempoRestante.setBackground(new Color(25,25,25));
        lblTempoRestante.setForeground(new Color(255,0,0));
        lblTempoRestante.setFont(new Font("Ink Free",Font.BOLD,60));
        lblTempoRestante.setBorder(BorderFactory.createBevelBorder(1));
        lblTempoRestante.setOpaque(true);
        lblTempoRestante.setHorizontalAlignment(JTextField.CENTER);
        lblTempoRestante.setText(String.valueOf(tempo));
        
        lblTempo.setBounds(520,550,150,30);
        lblTempo.setBackground(new Color(50,50,50));
        lblTempo.setForeground(new Color(255,0,0));
        lblTempo.setFont(new Font("MV Boli",Font.PLAIN,18));
        lblTempo.setHorizontalAlignment(JTextField.CENTER);
        lblTempo.setText("Cronômetro:");
        
        //configuração do numero de perguntas acertadas.
        txfNumeroCerto.setBounds(300,225,200,100);
        txfNumeroCerto.setBackground(new Color(25,25,25));
        txfNumeroCerto.setForeground(new Color(25,255,0));
        txfNumeroCerto.setFont(new Font("Ink Free",Font.BOLD,50));
        txfNumeroCerto.setBorder(BorderFactory.createBevelBorder(1));
        txfNumeroCerto.setHorizontalAlignment(JTextField.CENTER);
        txfNumeroCerto.setEditable(false);
        
        //configuração da porcentagem total acertada.
        txfPorcentagem.setBounds(300,325,200,100);
        txfPorcentagem.setBackground(new Color(25,25,25));
        txfPorcentagem.setForeground(new Color(25,255,0));
        txfPorcentagem.setFont(new Font("Inke Free",Font.BOLD,50));
        txfPorcentagem.setBorder(BorderFactory.createBevelBorder(1));
        txfPorcentagem.setHorizontalAlignment(JTextField.CENTER);
        txfPorcentagem.setEditable(false);
        
        //adds para adicionar os componentes no form.
        //frame.add(btnMenu);
        frame.add(lblTempo);
        frame.add(lblTempoRestante);
        frame.add(lblRespostaA);
        frame.add(lblRespostaB);
        frame.add(lblRespostaC);
        frame.add(lblRespostaD);
        frame.add(btnA);
        frame.add(btnB);
        frame.add(btnC);
        frame.add(btnD);
        frame.add(btnMenu);
        frame.add(txa);
        frame.add(txf);
        frame.setVisible(true);
        
        proximaPergunta();
    }
    
    
    //Metodo para as perguntas.
    public void proximaPergunta()
    {
        if(indice >= totalPerguntas)
        {
            resultado();
        }
        else
        {
            txf.setText("Pergunta: " + (indice+1));
            txa.setText(perguntas[indice]);
            lblRespostaA.setText(alternativas[indice][0]);
            lblRespostaB.setText(alternativas[indice][1]);
            lblRespostaC.setText(alternativas[indice][2]);
            lblRespostaD.setText(alternativas[indice][3]);
            timer.start();
        }
    }
    
    //Tratamento dos botoes das alternativas e escolhas certas/erradas.
    @Override
    public void actionPerformed(ActionEvent e)
    {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        
        
        if(e.getSource() == btnA)
        {
            resposta = 'A';
            if(resposta == respostas[indice])
            {
                respostasCertas++;
            }
        }
        if(e.getSource() == btnB)
        {
            resposta = 'B';
            if(resposta == respostas[indice])
            {
                respostasCertas++;
            }
        }
        if(e.getSource() == btnC)
        {
            resposta = 'C';
            if(resposta == respostas[indice])
            {
                respostasCertas++;
            }
        } 
        if(e.getSource() == btnD)
        {
            resposta = 'D';
            if(resposta == respostas[indice])
            {
                respostasCertas++;
            }
        }
        if(e.getSource() == btnMenu)
        {
            frame.dispose();
            frmMenuPrincipal frmM = new frmMenuPrincipal(null, true);
            frmM.setVisible(true);
        }
        mostrarResposta();
    }
    //Metodo para mudar a cor das alternativas erradas para vermelho, sinalizando a correta que permaneçe verde.
    public void mostrarResposta()
    {
        timer.stop();
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        
        if(respostas[indice] != 'A')
            lblRespostaA.setForeground(new Color(255,0,0));
        if(respostas[indice] != 'B')
            lblRespostaB.setForeground(new Color(255,0,0));
        if(respostas[indice] != 'C')
            lblRespostaC.setForeground(new Color(255,0,0));
        if(respostas[indice] != 'D')
            lblRespostaD.setForeground(new Color(255,0,0));
        
        //timer utilizado aqui tbm para resetar o tempo assim que mudar de pergunta. 
        Timer pause = new Timer(1000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                lblRespostaA.setForeground(new Color(25,255,0));
                lblRespostaB.setForeground(new Color(25,255,0));
                lblRespostaC.setForeground(new Color(25,255,0));
                lblRespostaD.setForeground(new Color(25,255,0));
                
                resposta = ' ';
                tempo = 20;
                lblTempoRestante.setText(String.valueOf(tempo));
                btnA.setEnabled(true);
                btnB.setEnabled(true);
                btnC.setEnabled(true);
                btnD.setEnabled(true);
                indice++;
                proximaPergunta();
            }
        });
        
        pause.setRepeats(false);
        pause.start();
              
    }
    //Metodo dos resultados finais, mostra a porcentagem é o numero de acertos ao terminar de responder todas perguntas.
    public void resultado()
    {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        
        resultado = (int)((respostasCertas/(double)totalPerguntas)*100);
        
        txf.setText("Resultados:");
        txa.setText("Obrigado por jogar.");
        lblRespostaA.setText("");
        lblRespostaB.setText("");
        lblRespostaC.setText("");
        lblRespostaD.setText("");
        
        txfNumeroCerto.setText("(" + respostasCertas + "/" + totalPerguntas + ")");
        txfPorcentagem.setText(resultado + "%");
        
        frame.add(txfNumeroCerto);
        frame.add(txfPorcentagem);
    }    
}
