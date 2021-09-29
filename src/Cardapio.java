import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Prato> cardapio = new ArrayList<>();

    public Cardapio(List<Prato> cardapio) {
        this.cardapio = cardapio;
    }

    public List<Prato> getCardapio() {
        return cardapio;
    }

    public void adicionarPrato(Prato novoPrato) {
        cardapio.add(novoPrato);
    }
}

