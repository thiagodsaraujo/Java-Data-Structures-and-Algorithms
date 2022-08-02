package Queue.QueueLinkedList.p3;

public class FilaSequencial {

    private static final int TAMANHO_INICIAL = 10;
    private Object[] arrayInterno;

    private int inseridos;
    private int aumentou;

    public FilaSequencial(){
        this.arrayInterno = new Object[TAMANHO_INICIAL];
    }

    public void enQueue(Object elemento) throws ValorInvalidoException{
        if (elemento == null){
            throw new ValorInvalidoException("Valor invalido! Tente Novamente");
        }
        aumentarArray();

        arrayInterno[inseridos] = elemento;
        inseridos++;
    }

    private void aumentarArray(){
        if (inseridos == arrayInterno.length && aumentou == 0){
            int newSize = (int) (inseridos * 1.8);
            Object[] novoArray = new Object[newSize];

            for (int i = 0; i < arrayInterno.length; i++) {
                novoArray[i] = arrayInterno[i];
            }
        } else {
            int newSize = (int) (inseridos * 2);

            Object[] novoArray = new Object[newSize];

            for (int i = 0; i < arrayInterno.length; i++) {
                novoArray[i] = arrayInterno[i];
            }
            arrayInterno = novoArray;
            aumentou++;
        }
    }

    public Object deQueue(){

        Object objRemovido = arrayInterno[0];

        if (inseridos > 0){
            for (int i = 0; i < inseridos; i++) {
                arrayInterno[i] = arrayInterno[i + 1];
            }
            inseridos--;
        }
        return objRemovido;
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

}
