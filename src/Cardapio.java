import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Prato> cardapio = new ArrayList<>();

    public Cardapio() {
    }

    public Cardapio(List<Prato> cardapio) {
        this.cardapio = cardapio;
    }

    public List<Prato> getCardapio() {
        return cardapio;
    }

    public void adicionarPrato(Prato novoPrato) {
        cardapio.add(novoPrato);
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Quantidade de pratos: ");
        retorno.append("\nPratos: ");
        retorno.append("\n " + cardapio);

        return retorno.toString();
    }
}

