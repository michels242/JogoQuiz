package Modelo;

public class Perguntas extends absPropriedades
{
    String pergunta;
    String[] alternativa = new String[4];
    char resp;
    Perguntas[] ordPerguntas = new Perguntas[10];
  
    public Perguntas(String pergunta, String[] alternativa, char resposta)
    {
        this.pergunta = pergunta;
        this.alternativa = alternativa;
        this.resp = resposta;
    }

    public Perguntas(Perguntas[] array)
    {
        this.executar(array);
    }
    
    private void executar(Perguntas[] array)
    {
        this.ordPerguntas = array;
        Randomizar random = new Randomizar(this.ordPerguntas);
        this.ordPerguntas = (Perguntas[]) random.arrayRandom;
        Controle controle = new Controle(this.ordPerguntas);
    } 
}
