package Modelo;

//Classe responsavel pelo sistema de randomizar as perguntas do jogo.
public class Randomizar extends absPropriedades
{
    Perguntas[] arrayRandom = new Perguntas[10]; 

    public Randomizar(Perguntas[] array)
    {
        randomizar(array);
        this.arrayRandom = array;
    }
    private void randomizar(Perguntas[] array)
    {
        int numElementos = array.length;
        for(int i = 0; i < numElementos; i++)
        {
            int s = i + (int)(Math.random() * (numElementos - i));
            
            Perguntas temp = array[s];
            array[s] = array[i];
            array[i] = temp;
        }
    }
}
