package greenquiz;

//Importes de eventos necessarios para trabalhar com a ação dos botoes.
import java.awt.event.*;
import java.awt.*;
import java.beans.PropertyChangeListener;
import javax.swing.*;

public class Quiz implements ActionListener
{
    //Array de strings com as perguntas do quiz.
    String[] perguntas = 
    {
      "O que é reciclagem?",
      "O que é coleta seletiva?",
      "Sobre as latas de coleta seletiva de lixo, quantas são as cores existentes?",
      "De acordo com a coleta seletiva, a lata de lixo da cor verde se destina ao descarte de:",
      "Qual a forma de descarte com menor impacto ao meio ambiente?",
      "A coleta seletiva faz parte do processo de reciclagem. Qual o tipo de reutilização pode se dar aos resíduos orgânicos?",
      "Qual o tempo estimado na decomposição do plástico:",
      "Os 8 R's da consciência ambiental são",
      "Onde deve ser feito o descarte de pilhas e baterias?",
      "Qual o material abaixo demora mais de mil anos para se decompor?"
    };
    
    //Array de strings com todas alternativas de cada pergunta.
    String[][] alternativas =
    {
        {"Processo de tratamento de esgoto", "Nome dado para todo o processo do lixo após seu descarte", "Transformação de materiais usados em novos produtos para consumo", "Nenhuma das alternativas acima"},
        {"Envio de todo o lixo produzido para cooperativas ou entrega para catadores de rua", "Separação e recolhimento dos resíduos para o reaproveitamento por meio de reciclagem", "Processo de envio de lixo para aterros e lixões", "Coleta de lixo"},
        {"5", "4", "6", "10"},
        {"Vidro", "Resíduos orgânicos", "Papel/Papelão", "Plástico"},
        {"Lixão", "Aterro controlado", "Incineração", "Aterro sanitário"},
        {"Compostagem", "Aproveitamento de sementes", "Replantar alimentos que contenham raízes", "Todas as respostas estão corretas"},
        {"Mais de 20 anos", "Mais de 200 anos", "Mais de 400 anos", "De 6 meses a 1 ano"},
        {"Repensar, recusar, reduzir, reparar, reutilizar, reciclar, responsabilizar-se e reformar", "Repensar, recusar, reduzir, reparar, reutilizar, reciclar, responsabilizar-se e repassar", "Repensar, recusar, reduzir, reparar, reutilizar, reciclar, restabelecer-se e repassar", "Repensar, repetir, reduzir, reparar, reutilizar, reciclar, responsabilizar-se e repassar"},
        {"Rio", "Lixo comum", "Revendedores e fabricantes", "Enterrar"},
        {"Latas de alumínio", "Isopor", "Fraldas descartável comum", "Vidro"}
    };
    
    //Array char com todas respostas.
    char[] respostas =
    {
        'C',
        'B',
        'D',
        'A',
        'D',
        'D',
        'C',
        'B',
        'C',
        'D'
    };
    
    //Variaveis.
    char palpite;
    char resposta;
    int indice;
    int respostasCertas = 0;
    int totalPerguntas = perguntas.length;
    int resultado;
    int tempo = 10;
    
    //Formulario Jframe.
    JFrame frame = new JFrame();
    JTextField txf = new JTextField();
    JTextArea txa = new JTextArea();
    JButton btnA = new JButton();
    JButton btnB = new JButton();
    JButton btnC = new JButton();
    JButton btnD = new JButton();
    JLabel lblRespostaA = new JLabel();
    JLabel lblRespostaB = new JLabel();
    JLabel lblRespostaC = new JLabel();
    JLabel lblRespostaD = new JLabel();
    JLabel lblTempo = new JLabel();
    JLabel lblTempoRestante = new JLabel();
    JTextField txfNumeroCerto = new JTextField();
    JTextField txfPorcentagem = new JTextField();
    
    //timer da contagem regressiva.
    Timer timer = new Timer(2000, new ActionListener()
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
   
    //Metodos:
    //Construtor para o formulario.
    public Quiz()
    {
        //configuraçoes corpo form.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650,650);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(null);
        frame.setResizable(false);
        
        //configuração txf
        txf.setBounds(0,0,650,50);
        txf.setBackground(new Color(25,25,25));
        txf.setForeground(new Color(25,255,0));
        txf.setFont(new Font("Ink Free",Font.BOLD,30));
        txf.setBorder(BorderFactory.createBevelBorder(1));
        txf.setHorizontalAlignment(JTextField.CENTER);
        txf.setEditable(false);
        
        //configuraçao txa
        txa.setBounds(0,50,650,50);
        txa.setLineWrap(true);
        txa.setWrapStyleWord(true);
        txa.setBackground(new Color(25,25,25));
        txa.setForeground(new Color(25,255,0));
        txa.setFont(new Font("MV Boli",Font.BOLD,15));
        txa.setBorder(BorderFactory.createBevelBorder(1));
        txa.setEditable(false);
        
        //configuração botoes.
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
        
        //configuraçoes lbls de respostas.
        lblRespostaA.setBounds(125,100,500,100);
        lblRespostaA.setBackground(new Color(50,50,50));
        lblRespostaA.setForeground(new Color(25,255,0));
        lblRespostaA.setFont(new Font("MV Boli",Font.PLAIN,12));
        
        lblRespostaB.setBounds(125,200,500,100);
        lblRespostaB.setBackground(new Color(50,50,50));
        lblRespostaB.setForeground(new Color(25,255,0));
        lblRespostaB.setFont(new Font("MV Boli",Font.PLAIN,12));
        
        lblRespostaC.setBounds(125,300,500,100);
        lblRespostaC.setBackground(new Color(50,50,50));
        lblRespostaC.setForeground(new Color(25,255,0));
        lblRespostaC.setFont(new Font("MV Boli",Font.PLAIN,12));
        
        lblRespostaD.setBounds(125,400,500,100);
        lblRespostaD.setBackground(new Color(50,50,50));
        lblRespostaD.setForeground(new Color(25,255,0));
        lblRespostaD.setFont(new Font("MV Boli",Font.PLAIN,12));
        
        //configuraçoes timer no form.
        lblTempoRestante.setBounds(535,510,100,100);
        lblTempoRestante.setBackground(new Color(25,25,25));
        lblTempoRestante.setForeground(new Color(255,0,0));
        lblTempoRestante.setFont(new Font("Ink Free",Font.BOLD,60));
        lblTempoRestante.setBorder(BorderFactory.createBevelBorder(1));
        lblTempoRestante.setOpaque(true);
        lblTempoRestante.setHorizontalAlignment(JTextField.CENTER);
        lblTempoRestante.setText(String.valueOf(tempo));
        
        lblTempo.setBounds(535,475,100,25);
        lblTempo.setBackground(new Color(50,50,50));
        lblTempo.setForeground(new Color(255,0,0));
        lblTempo.setFont(new Font("MV Boli",Font.PLAIN,15));
        lblTempo.setHorizontalAlignment(JTextField.CENTER);
        lblTempo.setText("Cronômetro:");
        
        //configuraçoes perguntas certas.
        txfNumeroCerto.setBounds(225,225,200,100);
        txfNumeroCerto.setBackground(new Color(25,25,25));
        txfNumeroCerto.setForeground(new Color(25,255,0));
        txfNumeroCerto.setFont(new Font("Ink Free",Font.BOLD,50));
        txfNumeroCerto.setBorder(BorderFactory.createBevelBorder(1));
        txfNumeroCerto.setHorizontalAlignment(JTextField.CENTER);
        txfNumeroCerto.setEditable(false);
        
        //configuraçoes porcentagem acertada.
        txfPorcentagem.setBounds(225,325,200,100);
        txfPorcentagem.setBackground(new Color(25,25,25));
        txfPorcentagem.setForeground(new Color(25,255,0));
        txfPorcentagem.setFont(new Font("Inke Free",Font.BOLD,50));
        txfPorcentagem.setBorder(BorderFactory.createBevelBorder(1));
        txfPorcentagem.setHorizontalAlignment(JTextField.CENTER);
        txfPorcentagem.setEditable(false);
        
        //adds e funçoes.
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
        frame.add(txa);
        frame.add(txf);
        frame.setVisible(true);
        
        proximaPergunta();
    }
    
    //Metodo para as proximas perguntas.
    public void proximaPergunta()
    {
        if(indice >= totalPerguntas)
        {
            resultado();
        }
        else
        {
            txf.setText("Pergunta" + (indice+1));
            txa.setText(perguntas[indice]);
            lblRespostaA.setText(alternativas[indice][0]);
            lblRespostaB.setText(alternativas[indice][1]);
            lblRespostaC.setText(alternativas[indice][2]);
            lblRespostaD.setText(alternativas[indice][3]);
            timer.start();
        }
    }

    //Metodo para o click do botao, escolher alternativa.
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
        mostrarResposta();
    }
    
    //Metodo para exibir as respostas.
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
        
        Timer pause = new Timer(2000, new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                lblRespostaA.setForeground(new Color(25,255,0));
                lblRespostaB.setForeground(new Color(25,255,0));
                lblRespostaC.setForeground(new Color(25,255,0));
                lblRespostaD.setForeground(new Color(25,255,0));
                
                resposta = ' ';
                tempo = 10;
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
    
    //Metodo dos resultados. mostra a porcentagem e o numero de acertos.
    public void resultado()
    {
        btnA.setEnabled(false);
        btnB.setEnabled(false);
        btnC.setEnabled(false);
        btnD.setEnabled(false);
        
        resultado = (int)((respostasCertas/(double)totalPerguntas)*100);
        
        txf.setText("Resultados:");
        txa.setText("");
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
