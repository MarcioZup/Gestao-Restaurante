public class Ingredientes {

    private String ingredientes;

    public Ingredientes() {
    }

    public Ingredientes(String nomeDoIngrediente) {
        this.ingredientes = nomeDoIngrediente;
    }

    public String getNomeDoIngrediente() {
        return ingredientes;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.ingredientes = nomeDoIngrediente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Ingrediente: " + ingredientes);
        return retorno.toString();
    }
}
