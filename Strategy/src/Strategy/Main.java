package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);

        ArrayData arrayDataCrescente = new ArrayData(arrayList, EstrategiaDeBusca.CRESCENTE);
        ArrayData arrayDataDecrescente = new ArrayData(arrayList, EstrategiaDeBusca.DECRESCENTE);

        System.out.println("Crescente");
        arrayDataCrescente.percorrerArray();
        System.out.println("Decrescente");
        arrayDataDecrescente.percorrerArray();
    }
}
