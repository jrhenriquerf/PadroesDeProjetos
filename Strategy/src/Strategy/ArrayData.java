package Strategy;

import java.util.ArrayList;

public class ArrayData {
    ArrayList arrayData;
    private PercorrerArray estrategiaDeBusca;

    public ArrayData(ArrayList dados, EstrategiaDeBusca estrategia) {
        arrayData = dados;
        switch (estrategia) {
            case CRESCENTE:
                estrategiaDeBusca = new PercorrerArrayCrescente();
                break;
            case DECRESCENTE:
                estrategiaDeBusca = new PercorrerArrayDecrescente();
                break;
            default:
                throw new RuntimeException("Estratégia não encontrada :/");
        }

    }

    public void percorrerArray() {
        estrategiaDeBusca.percorrerArray(arrayData);
    }
}
