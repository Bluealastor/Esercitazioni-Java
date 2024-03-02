package EserciziCodeGrind;

import java.beans.DefaultPersistenceDelegate;
import java.util.ArrayList;

public class Esercizi {

    //https://codegrind.it/esercizi/java

    public static void main(String[] args){

        System.out.println("ESERCIZI OPERATORE TERNARIO JAVA");
//        OPERATORE TERNARIO
//    ESERCIZIO1
//   SCRIVI UN PROGRAMMA CHE VERIFICA SE UN NUMERO è PARI O DISPARI UTILIZZANDO L'OPERATORE TERNARIO.

        int numero = 8;
        String verificaNumero = numero % 2 == 0 ? "il numro è pari" : "il numero è dispari";
        System.out.println(verificaNumero);

        System.out.println("----------------------------------");
//        Esercizio2
//        Scrivi un programma che calcola il valore assoluto di un numero utilizzando l'operatore ternario

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Esercizio 2  Svolto su OPERATORE TERNARIO");
        int numero2 = -5;

        String valoreAssoluto = numero2 >= 0 ? "il valore assoluto del numero è: " + numero2 : "il valore assoluto di un numero negativo è: " + -numero2 ;
        System.out.println(valoreAssoluto);
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Risposta Esercizio 2 su OPERATORE TERNARIO");
        int numero3= -5;
        int valoreAssoluto3 = (numero3 >= 0) ? numero3 : -numero3;
        System.out.println("Il valore assoluto del numero è: " + valoreAssoluto3);

        System.out.println("||||||||||||||||||||||||||||||||||||||||");

        System.out.println("----------------------------------");
//        Esercizio3
//       Scrivi un programma Java che determina il valore massimo tra due numeri utilizzando l'operatore ternario.

        int a = 32;
        int b = 5;
        String numeroMaggiore = a>b ? "il massimo è: " + a : "il massimo è: " +  b;
        System.out.println(numeroMaggiore);

        System.out.println("----------------------------------");
        System.out.println();
        System.out.println("ESERCIZI ARRAYLIST JAVA");
//        EserciziCodeGrind.Esercizi Arraylist Java

//        Esercizio 1
//        Aggiungere elementi a un ArrayList di interi o Stringhe e stamparli

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ciao");
        arrayList.add("Mondo");
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println(arrayList);
        for(String nu : arrayList){
            System.out.print(nu + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");
//        Esercizio 2
//        Aggiungere elementi a un ArrayList di interi o Stringhe e stamparli

        arrayList.remove("Ciao");
        for(String nu : arrayList){
            System.out.print(nu + " ");
        }
        System.out.println();
        System.out.println("----------------------------------");


//        Esercizio 3
//        Verificare se un ArrayList di caratteri contiene un elemento specifico:

        ArrayList<Character> arrayCaratteri = new ArrayList<>();
        arrayCaratteri.add('a');
        arrayCaratteri.add('b');
        arrayCaratteri.add('c');


        boolean f = arrayCaratteri.contains('f');
        boolean t = arrayCaratteri.contains('b');
        System.out.println(t);
        System.out.println(f);


        System.out.println("----------------------------------");

//        Esercizio 4
//        Copiare gli elementi di un ArrayList in un nuovo ArrayList:

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("ESERCIZIO 4 SVOLTO ");
        ArrayList<Integer> arrayInteri = new ArrayList<>();
        ArrayList<Integer> arrayInteriCopia = new ArrayList<>();
        arrayInteri.add(1);
        arrayInteri.add(2);
        arrayInteri.add(3);

        for(int n : arrayInteri){
            arrayInteriCopia.add(n);
        }
        System.out.println();
        System.out.println("Array originale " + arrayInteri);
        System.out.println("Array copia " + arrayInteriCopia);
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println();
        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Risposta Esercizio 4 su Arraylist Java di codegrind");
        ArrayList<Integer> numeri1 = new ArrayList<>();
        numeri1.add(1);
        numeri1.add(2);
        numeri1.add(3);

        ArrayList<Integer> numeri2 = new ArrayList<>(numeri1);

        System.out.println("Numeri1: " + numeri1);
        System.out.println("Numeri2: " + numeri2);

        System.out.println("||||||||||||||||||||||||||||||||||||||||");
        System.out.println();

        System.out.println("----------------------------------");

//        Esercizio 5
//        Trovare la posizione di un elemento in un ArrayList di stringhe:

        ArrayList<String> arrayStringheIndex = new ArrayList<>();
        arrayStringheIndex.add("ciao");
        arrayStringheIndex.add("mondo");
        arrayStringheIndex.add("Hello");
        int findIndexArray = arrayStringheIndex.indexOf("hello");
        int findIndexArray2 = arrayStringheIndex.indexOf("Hello");
        System.out.println("N restituito per elemento non Trovato è = " +findIndexArray);
        System.out.println("N per Elemento trovato nella posizione = " + findIndexArray2);

        System.out.println("----------------------------------");

//        Esercizio 6
//        Calcolare la somma degli elementi in un ArrayList di numeri float:

        ArrayList<Integer> arrayInteri2 = new ArrayList<>();
        arrayInteri2.add(1);
        arrayInteri2.add(2);
        arrayInteri2.add(3);
        arrayInteri2.add(4);

        int somma = 0;
        for(int i : arrayInteri2){
            somma += i;
        }

        System.out.println(somma);







    }

}
