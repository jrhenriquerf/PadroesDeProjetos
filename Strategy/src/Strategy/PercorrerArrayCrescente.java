package Strategy;

import java.util.ArrayList;

public class PercorrerArrayCrescente implements PercorrerArray {
    @Override
    public void percorrerArray(ArrayList arrayList) {
        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println("[" + i + "]" + arrayList.get(i));
        }
    }
}
