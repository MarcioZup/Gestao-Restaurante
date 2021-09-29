import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Prato>cardapio = new ArrayList<>();

    public List<Prato> getPratos() {
        return cardapio;
    }

    public void adicionaPratos(Prato novoPrato){
        cardapio.add(novoPrato);
    }
}
