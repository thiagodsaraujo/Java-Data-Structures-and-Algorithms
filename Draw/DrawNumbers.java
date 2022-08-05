package Draw;

import java.util.*;

import static java.util.Collections.shuffle;

public class DrawNumbers {

    public static void main(String[] args) {


//        int[] resultado = new Random().ints(20,1,50).toArray();
//        System.out.println("Valores: " + Arrays.toString(resultado));
//        System.out.println(resultado.length);

        DrawNumbers obj = new DrawNumbers();

        List banco1 = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            banco1.add(i);
        }
        List banco2 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            banco2.add(10 + i);
        }
        List banco3 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            banco3.add(100 + i);
        }
        List banco4 = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            banco4.add(1000 + i);
        }
        Random rand = new Random();

        List prova1 = obj.pegarQuestoesPorBanco(banco1,4);
        List prova2 = obj.pegarQuestoesPorBanco(banco2,4);
        List prova3= obj.pegarQuestoesPorBanco(banco3,4);
        List prova4 = obj.pegarQuestoesPorBanco(banco4,4);

        Collections.sort(prova1);
        Collections.sort(prova2);
        Collections.sort(prova3);
        Collections.sort(prova4);

        System.out.println("Banco de questoes do Tipo 1 : " + banco1);
        System.out.println("Banco de questoes do Tipo 2 : " + banco2);
        System.out.println("Banco de questoes do Tipo 3 : " + banco3);
        System.out.println("Banco de questoes do Tipo 4 : " + banco4);
        System.out.print("\n");
//        System.out.println("Questoes do Tipo 1 sorteadas: " + prova1);
//        System.out.println("Questoes do Tipo 2 sorteadas: " + prova2);
//        System.out.println("Questoes do Tipo 3 sorteadas: " + prova3);
//        System.out.println("Questoes do Tipo 4 sorteadas: " + prova4);
//        System.out.println("\n");
        List provaFinal = sortearProva(banco1,banco2,banco3,banco4,9);
        Collections.sort(provaFinal);
        System.out.println("Prova Final: " + provaFinal);
        System.out.println("Quantidade de Questoes: " + provaFinal.size());

        List listalista = sortearProva2(banco1,banco2,banco3,banco4,5);
        System.out.println(listalista);
        System.out.println(listalista.size());

//
//        int questoesPorBanco = 4;
//
//        System.out.println(obj.sortearProva(banco1,banco2,banco3,banco4, questoesPorBanco));

//        System.out.println("Banco de Questoes do Tipo 1: " + banco1);
//        System.out.println("Banco de Questoes do Tipo 2: " + banco2);
//        System.out.println("Banco de Questoes do Tipo 3: " + banco3);
//        System.out.println("Banco de Questoes do Tipo 4: " + banco4);
//
//
//        int numero;
//        int[] prova2 = new int[20];
//        Random r = new Random();
//
//        for (int i = 0; i < prova2.length; i++) {
//            int it = 0;
//            numero = r.nextInt(50) + 1;
//            for (int j = 0; j < prova2.length; j++) {
//                if (numero == prova2[j] && j != i) {
//                    numero = r.nextInt(50) + 1;
//                } else {
//                    prova2[i] = numero;
//                }
//            }
//        }
//
//        for (int i = 0; i < prova2.length; i++) {
//            System.out.print(prova2[i] + " ");
//        }
//
//        System.out.println("\n~~~~~~~~~~~~~~~~~~");
//        prova = obj.sorteioQuestoes(20);
//        System.out.println(prova);
//

    }

    private static List sortearProva(List banco1, List banco2, List banco3, List banco4, int questoesPorBanco) {
        List provaFinal = new LinkedList();

        List questoes1 = pegarQuestoesPorBanco(banco1, questoesPorBanco);
        List questoes2 = pegarQuestoesPorBanco(banco2, questoesPorBanco);
        List questoes3 = pegarQuestoesPorBanco(banco3, questoesPorBanco);
        List questoes4 = pegarQuestoesPorBanco(banco4, questoesPorBanco);

        int tamanhoProva = questoesPorBanco * 4;
        try {
            for (int i = 0; i < tamanhoProva; i++) {
                provaFinal.add(questoes1.get(i));
                provaFinal.add(questoes2.get(i));
                provaFinal.add(questoes3.get(i));
                provaFinal.add(questoes4.get(i));
            }
        }catch (IndexOutOfBoundsException e) {
        }
        return provaFinal;
    }


    private static List sortearProva2(List banco1, List banco2, List banco3, List banco4, int questoesPorBanco) {
        List provaFinal = new LinkedList();

        List questoes1 = pegarQuestoesPorBanco(banco1, questoesPorBanco);
        List questoes2 = pegarQuestoesPorBanco(banco2, questoesPorBanco);
        List questoes3 = pegarQuestoesPorBanco(banco3, questoesPorBanco);
        List questoes4 = pegarQuestoesPorBanco(banco4, questoesPorBanco);

        try {
                provaFinal.add(questoes1);
                provaFinal.add(questoes2);
                provaFinal.add(questoes3);
                provaFinal.add(questoes4);

        }catch (IndexOutOfBoundsException e) {
        }
        return provaFinal;
    }



    private static List<Integer> pegarQuestoesPorBanco(List banco1, int questoesPorBanco) {
        int cont = 0;
        List tempList = new LinkedList();
        while (cont != questoesPorBanco) {
            Random random = new Random();
            int indexSorteado = (int) banco1.get(random.nextInt(0, banco1.size()));
            if (!tempList.contains(indexSorteado)) {
                tempList.add(indexSorteado);
                cont++;
            }
        }
        return tempList;
    }


            private List<Integer> sorteioQuestoes ( int qntQuestoes){
                List<Integer> list = new ArrayList<>();
                int cont = 0;
                int it = 0;
                while (!(qntQuestoes == cont)) {
                    Random random = new Random();
                    int numeroSorteado = random.nextInt(1, 51);
                    if (!list.contains(numeroSorteado)) {
                        list.add(numeroSorteado);
                        cont++;
                    }
                    it++;
                }
                System.out.println("Quantidade de tentativas: " + it);
                return list;
            }
        }
