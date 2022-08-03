package Queue.QueueLinkedList.p3;

import java.util.Arrays;

public class Main {

    //https://pythontutor.com/render.html#code=public%20class%20Fila%20%7B%0A%20%20%20%20public%20static%20void%20main%28String%5B%5D%20args%29%20%7B%0A%20%20%20%20%20%20Fila%20fila%20%3D%20new%20Fila%285%29%3B%0A%20%20%20%20%20%20fila.enqueue%282,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%283,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%284,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%285,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%286,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%287,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2810,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2811,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2812,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2813,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2814,true%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%288,false%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%289,false%29%3B%0A%20%20%20%20%20%20%20%20fila.enqueue%2810,false%29%3B%0A%0A%20%20%20%20%7D%0A%20%20%20%20%0A%0A%20%20%20%20private%20Object%5B%5D%20filaNormal%3B%0A%20%20%20%20private%20Object%5B%5D%20filaPrioritaria%3B%0A%0A%20%20%20%20private%20int%20inseridosPrioritario%20%3D%200%3B%0A%20%20%20%20private%20int%20inseridosNormal%20%3D%200%3B%0A%20%20%20%20private%20int%20inseridos%20%3D%200%3B%0A%0A%20%20%20%20private%20boolean%20prioritario%3B%0A%0A%20%20%20%20public%20Fila%28int%20tamanho%29%7B%0A%20%20%20%20%20%20%20%20super%28%29%3B%0A%20%20%20%20%20%20%20%20this.filaPrioritaria%20%3D%20new%20Object%5Btamanho%5D%3B%0A%20%20%20%20%20%20%20%20this.filaNormal%20%3D%20new%20Object%5Btamanho%5D%3B%0A%20%20%20%20%7D%0A%0A%20%20%20%20public%20void%20enqueue%28Object%20novoElemento,%20boolean%20prioritario%29%7B%0A%0A%20%20%20%20%20%20%20%20if%20%28prioritario%20%3D%3D%20true%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28inseridosPrioritario%20%3D%3D%20filaPrioritaria.length%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20int%20inseridos2%20%3D%20inseridosPrioritario%20*%202%3B%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Object%5B%5D%20novaFila%20%3D%20new%20Object%5Binseridos2%5D%3B%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20filaPrioritaria.length%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20novaFila%5Bi%5D%20%3D%20filaPrioritaria%5Bi%5D%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20filaPrioritaria%20%3D%20novaFila%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20filaPrioritaria%5BinseridosPrioritario%5D%20%3D%20novoElemento%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20inseridosPrioritario%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20inseridos%2B%2B%3B%0A%20%20%20%20%20%20%20%20%7D%20else%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20if%20%28inseridosNormal%20%3D%3D%20filaNormal.length%29%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20int%20inseridos2%20%3D%20inseridosNormal%20*%202%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Object%5B%5D%20novaFila%20%3D%20new%20Object%5Binseridos2%5D%3B%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20for%20%28int%20i%20%3D%200%3B%20i%20%3C%20filaNormal.length%3B%20i%2B%2B%29%20%7B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20novaFila%5Bi%5D%20%3D%20filaNormal%5Bi%5D%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%0A%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20filaNormal%20%3D%20novaFila%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%20%20%20%20%20%20%20%20filaNormal%5BinseridosNormal%5D%20%3D%20novoElemento%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20inseridosNormal%2B%2B%3B%0A%20%20%20%20%20%20%20%20%20%20%20%20inseridos%2B%2B%3B%0A%20%20%20%20%20%20%20%20%7D%0A%20%20%20%20%7D%0A%0A%7D&cumulative=false&curInstr=86&heapPrimitives=nevernest&mode=display&origin=opt-frontend.js&py=java&rawInputLstJSON=%5B%5D&textReferences=false

    public static void main(String[] args) throws ValorInvalidoException {
        FilaSequencial filaSequencial = new FilaSequencial();
        ListaSequencial listaSequencial = new ListaSequencial();

//        listaSequencial.add(10);
//        listaSequencial.add(11);
//        listaSequencial.add(12);
//        listaSequencial.add(13);
//        listaSequencial.add(14);
//
//        System.out.println(listaSequencial.toString());
//        listaSequencial.add(15);
//        System.out.println(listaSequencial.toString());

//
//        filaSequencial.enQueue(10);
//        filaSequencial.enQueue(11);
//        filaSequencial.enQueue(11);
//        filaSequencial.enQueue(12);
//        filaSequencial.enQueue(13);
//        filaSequencial.enQueue(14);
//        filaSequencial.enQueue(15);
//        System.out.println(filaSequencial.toString());

        Fila fila = new Fila(5);
        System.out.println(fila.toString());
        fila.enqueue(2,true);
        fila.enqueue(3,true);
        fila.enqueue(4,true);
        fila.enqueue(5,true);
        fila.enqueue(6,true);
        fila.enqueue(7,true);
        fila.enqueue(10,true);
        fila.enqueue(11,true);
        fila.enqueue(12,true);
        fila.enqueue(13,true);
        fila.enqueue(14,true);
        fila.enqueue(8,false);
        fila.enqueue(9,false);
        fila.enqueue(10,false);
        System.out.println(fila.toString());

}
    }