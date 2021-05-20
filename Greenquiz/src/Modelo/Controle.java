package Modelo;

//Classe controle responsavel pela organização correta das perguntas, alternativas e respostas.
public class Controle extends absPropriedades
{
    Perguntas[] ordemJogo = new Perguntas[10]; 
    
    public Controle(Perguntas[] array)
    {
        this.ordemJogo = array;
    }

    Controle()
    {
        this.executar();
    }
     
    private void executar()
    {
        Perguntas per1 = new Perguntas(pergunta1,alternativa1,resposta1);
        Perguntas per2 = new Perguntas(pergunta2,alternativa2,resposta2);
        Perguntas per3 = new Perguntas(pergunta3,alternativa3,resposta3);
        Perguntas per4 = new Perguntas(pergunta4,alternativa4,resposta4);
        Perguntas per5 = new Perguntas(pergunta5,alternativa5,resposta5);
        Perguntas per6 = new Perguntas(pergunta6,alternativa6,resposta6);
        Perguntas per7 = new Perguntas(pergunta7,alternativa7,resposta7);
        Perguntas per8 = new Perguntas(pergunta8,alternativa8,resposta8);
        Perguntas per9 = new Perguntas(pergunta9,alternativa9,resposta9);
        Perguntas per10 = new Perguntas(pergunta10,alternativa10,resposta10);
        Perguntas[] enviar ={per1, per2, per3, per4, per5, per6, per7, per8, per9, per10};
        Perguntas perg = new Perguntas(enviar);
        this.ordemJogo = perg.ordPerguntas;
    }
}
