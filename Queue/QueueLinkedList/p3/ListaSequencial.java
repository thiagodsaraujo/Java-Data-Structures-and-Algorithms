package Queue.QueueLinkedList.p3;

import java.util.Arrays;

public class ListaSequencial {

    private Object[] arrayInterno;
    private static final int TAMANHO_INICIAL = 10;

    private int inseridos;
    private int paresPrimeiro;
    private  int imparesDepois = 1;

    public ListaSequencial(){
        this.arrayInterno = new Object[TAMANHO_INICIAL];
        // Adicionei o loop para preencher a lista
        for (int i = 0; i < arrayInterno.length; i++) {
            arrayInterno[i] = Integer.MIN_VALUE;
        }
    }

    public void add(Object elemento) throws ValorInvalidoException{
        if (elemento == null){
            throw new ValorInvalidoException("Valor invalido");
        }

        aumentarArray();

        if (paresPrimeiro <= arrayInterno.length){
            arrayInterno[paresPrimeiro] = elemento;
//            inseridos++;
            inseridos = inseridos + 2;
            paresPrimeiro = paresPrimeiro + 2;
        } else {
            arrayInterno[imparesDepois] = elemento;
//            inseridos++;
            inseridos = inseridos + 2;
            imparesDepois = imparesDepois + 2;
        }

    }

    public void aumentarArray(){
        if (inseridos == arrayInterno.length){

            int newSize = (int) (inseridos * 1.7);

            Object[] novoArray = new Object[newSize];

            for (int i = 0; i < arrayInterno.length; i++) {
                novoArray[i] = arrayInterno[i];
            }
            arrayInterno = novoArray;
        }
    }

    public Object get(int index) throws PosicaoInvalidaException, ValorInvalidoException{
        if (index < 0 || index > paresPrimeiro){
            throw new ValorInvalidoException("Valor invalido!");
        } else if (index >= inseridos){
            throw new PosicaoInvalidaException("Posicao Invalida");
        } else {
            return arrayInterno[index];
        }
    }

    public int size(){
        return inseridos;
    }

    public boolean isNull(){
        return inseridos == 0;
    }

    public void clear(){
        inseridos = 0;
        arrayInterno = new Object[TAMANHO_INICIAL];
    }

    @Override
    public String toString() {
        return "ListaSequencial{" +
                "arrayInterno=" + Arrays.toString(arrayInterno) +
                ", inseridos=" + inseridos +
                ", paresPrimeiro=" + paresPrimeiro +
                ", imparesDepois=" + imparesDepois +
                '}';
    }
}
