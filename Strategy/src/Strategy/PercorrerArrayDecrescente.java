package Strategy;

import java.util.ArrayList;

public class PercorrerArrayDecrescente implements PercorrerArray {
    @Override
    public void percorrerArray(ArrayList arrayList) {
        for(int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println("[" + i + "]" + arrayList.get(i));
        }
    }
}
