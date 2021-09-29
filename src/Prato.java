import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nomeDoPrato;
    private double precoDoPrato;
    private List<Ingredientes> ingredientes = new ArrayList<>();


    public Prato(String nomeDoPrato, double precoDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.precoDoPrato = precoDoPrato;

    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public double getPrecoDoPrato() {
        return precoDoPrato;
    }

    public void setPrecoDoPrato(double precoDoPrato) {
        this.precoDoPrato = precoDoPrato;
    }

    public List<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void adicionaIngredientes(Ingredientes novoIngrediente){
        ingredientes.add(novoIngrediente);

    }




    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Prato: " + nomeDoPrato);
        retorno.append("\nPreço do Prato: R$ " + precoDoPrato);
        retorno.append("\nIngredientes: " + ingredientes);
        return retorno.toString();
    }
}
