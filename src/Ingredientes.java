public class Ingredientes {

    private String ingredientes;

    public Ingredientes() {
    }

    public Ingredientes(String nomeDoIngrediente) {
        this.ingredientes = ingredientes;
    }

    public String getNomeDoIngrediente() {
        return ingredientes;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Ingrediente: " + ingredientes);
        return retorno.toString();
    }
}
