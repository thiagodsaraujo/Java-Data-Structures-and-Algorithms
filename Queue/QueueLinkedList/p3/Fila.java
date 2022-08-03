package Queue.QueueLinkedList.p3;

import java.util.Arrays;

public class Fila {

    private Object[] filaNormal;
    private Object[] filaPrioritaria;

    private int inseridosPrioritario = 0;
    private int inseridosNormal = 0;
    private int inseridos = 0;

    private boolean prioritario;

    public Fila(int tamanho){
        super();
        this.filaPrioritaria = new Object[tamanho];
        this.filaNormal = new Object[tamanho];
    }

    public void enqueue(Object novoElemento, boolean prioritario){

        if (prioritario == true){
            if (inseridosPrioritario == filaPrioritaria.length){
                int inseridos2 = inseridosPrioritario * 2;

                Object[] novaFila = new Object[inseridos2];

                for (int i = 0; i < filaPrioritaria.length; i++) {
                    novaFila[i] = filaPrioritaria[i];
                }
                filaPrioritaria = novaFila;
            }

            filaPrioritaria[inseridosPrioritario] = novoElemento;
            inseridosPrioritario++;
            inseridos++;
        } else {
            if (inseridosNormal == filaNormal.length){
                int inseridos2 = inseridosNormal * 2;
                Object[] novaFila = new Object[inseridos2];

                for (int i = 0; i < filaNormal.length; i++) {
                    novaFila[i] = filaNormal[i];
                }

                filaNormal = novaFila;
            }
            filaNormal[inseridosNormal] = novoElemento;
            inseridosNormal++;
            inseridos++;
        }
    }

    public Object dequeue(){
        if (inseridos == 0 || inseridos == 1){
            Object obj = filaPrioritaria[0];

            Object[] novaFila = new Object[inseridosPrioritario - 1];

            for (int i = 0; i < filaPrioritaria.length; i++) {
                novaFila[i - 1] = filaPrioritaria[i];
            }
            filaPrioritaria = novaFila;
            inseridosPrioritario--;
            inseridos++;
            return obj;
        } else {
            Object obj = filaNormal[0];
            Object[] novaFila = new Object[inseridosNormal - 1];

            for (int i = 0; i < filaNormal.length; i++) {
                novaFila[i - 1] = filaNormal[i];
            }
            filaNormal = novaFila;
            inseridosNormal--;
            inseridos = 0;
            return obj;
        }
    }

    @Override
    public String toString() {
        return "Fila{" +
                "filaNormal=" + Arrays.toString(filaNormal) +
                ", filaPrioritaria=" + Arrays.toString(filaPrioritaria) +
                ", inseridosPrioritario=" + inseridosPrioritario +
                ", inseridosNormal=" + inseridosNormal +
                ", inseridos=" + inseridos +
                ", prioritario=" + prioritario +
                ", tamanhoFilaNormal=" + filaNormal +
                ", tamanhoFilaPrioritaria=" + filaPrioritaria +
                '}';
    }
}
