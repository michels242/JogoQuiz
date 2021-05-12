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
    
    //Variaveis.
    protected char palpite;
    protected char resposta;
    protected int indice;
    protected int respostasCertas = 0;
    protected int totalPerguntas = perguntas.length;
    protected int resultado;
    protected int tempo = 15;
}
