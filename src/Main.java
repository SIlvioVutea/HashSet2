import java.util.Arrays;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
//        Scrivere una funzione che restituisca un HashSet riempito
//        Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//        Verificare che l' elemento sia parte del Set e stampare il risultato
        Fruit f1 = new Fruit("Banana");
        Fruit f2 = new Fruit("Peach");
        Fruit f3 = new Fruit("Apple");
        Fruit[] fruitsToBuy = {f1, f2, f3};

        Fruit f4 = new Fruit("Watermelon");
        System.out.println(f1.getName());/*questa è una prova poichè non so per quale motivo ma
         gli ogetti istanziati qunado li mando in stampa danno null sul mio intellij*/


        System.out.println("have we bought " + f4.getName() + "? " + getFruitSet(fruitsToBuy).contains(f4));


    }

    public static HashSet<Fruit> getFruitSet(Fruit[] fruits) {
        HashSet<Fruit> boughtFruits = new HashSet<Fruit>(Arrays.asList(fruits));
        return boughtFruits;
    }
}