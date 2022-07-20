package BigONotation;

import java.util.*;

public class RuntimeComplexities {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(100);

        // calling max() method.
        int max = Collections.max(lista);
        System.out.println("Valores da lista: " + lista);
        System.out.println("Maior valor da lista: " + max);


        // Finding Maximum Elemento of Java Arraylist

        int maior = lista.get(0);
        for (int i = 0; i < lista.size(); i++) {
            if (maior < lista.get(i)){
                maior = lista.get(i);
            }
        }
        System.out.println("Maior numero da lista é " + maior);
    }

        }

