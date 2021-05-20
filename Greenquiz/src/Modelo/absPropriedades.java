package Modelo;

//Arrays e variaveis separadas para melhor organição do projeto.
public abstract class absPropriedades
{
    //Array de strings com as perguntas do quiz.
    protected String[] perguntas = 
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
    protected String[][] alternativas =
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
    protected char[] respostas =
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
    
    //Variaveis do jogo.
    protected char resposta;
    protected int indice;
    protected int respostasCertas = 0;
    protected int totalPerguntas = perguntas.length;
    protected int resultado;
    protected int tempo = 20;
    protected String pergunta1 = perguntas[0];
    protected String pergunta2 = perguntas[1];
    protected String pergunta3 = perguntas[2];
    protected String pergunta4 = perguntas[3];
    protected String pergunta5 = perguntas[4];
    protected String pergunta6 = perguntas[5];
    protected String pergunta7 = perguntas[6];
    protected String pergunta8 = perguntas[7];
    protected String pergunta9 = perguntas[8];
    protected String pergunta10 = perguntas[9];
    protected String[] alternativa1 = alternativas[0];
    protected String[] alternativa2 = alternativas[1];
    protected String[] alternativa3 = alternativas[2];
    protected String[] alternativa4 = alternativas[3];
    protected String[] alternativa5 = alternativas[4];
    protected String[] alternativa6 = alternativas[5];
    protected String[] alternativa7 = alternativas[6];
    protected String[] alternativa8 = alternativas[7];
    protected String[] alternativa9 = alternativas[8];
    protected String[] alternativa10 = alternativas[9];
    protected char resposta1 = respostas[0];
    protected char resposta2 = respostas[1];
    protected char resposta3 = respostas[2];
    protected char resposta4 = respostas[3];
    protected char resposta5 = respostas[4];
    protected char resposta6 = respostas[5];
    protected char resposta7 = respostas[6];
    protected char resposta8 = respostas[7];
    protected char resposta9 = respostas[8];
    protected char resposta10 = respostas[9];
    protected String[] pergRandomizada = {pergunta1, pergunta2, pergunta3, pergunta4, pergunta5, pergunta6, pergunta7, pergunta8, pergunta9, pergunta10};
    protected String[][] altRandomizada = {alternativa1, alternativa2, alternativa3, alternativa4, alternativa5, alternativa6, alternativa7, alternativa8, alternativa9, alternativa10};
    protected char[] respRandomizada = {resposta1, resposta2, resposta3, resposta4, resposta5, resposta6, resposta7, resposta8, resposta9, resposta10};
    protected Perguntas[] ordemFinal = new Perguntas[10];
}
