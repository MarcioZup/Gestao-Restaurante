import java.util.ArrayList;
import java.util.List;

public class Prato {

    private String nomeDoPrato;
    private double precoDoPrato;
    private List<String> ingrediente = new ArrayList<String>();

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

    public List<String> getIngredientes() {
        return ingrediente;
    }

    public void adicionaIngredientes(String novoIngrediente){
        ingrediente.add(novoIngrediente);
    }




    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Prato: " + nomeDoPrato);
        retorno.append("\nPreço do Prato: R$ " + precoDoPrato);
        retorno.append("\nIngredientes: " + getIngredientes());
        return retorno.toString();
    }
}
