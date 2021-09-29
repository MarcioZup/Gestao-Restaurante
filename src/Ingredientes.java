public class Ingredientes {

    private String ingrediente;

    public Ingredientes(String nomeDoIngrediente) {
        this.ingrediente = ingrediente;
    }

    public String getNomeDoIngrediente() {
        return ingrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Ingrediente: " + ingrediente);
        return retorno.toString();
    }
}
