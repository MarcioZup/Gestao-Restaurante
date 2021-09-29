public class Ingrediente {

    private String ingrediente;

    public Ingrediente() {
    }

    public Ingrediente(String nomeDoIngrediente) {
        this.ingrediente = nomeDoIngrediente;
    }

    public String getNomeDoIngrediente() {
        return ingrediente;
    }

    public void setNomeDoIngrediente(String nomeDoIngrediente) {
        this.ingrediente = nomeDoIngrediente;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome do Ingrediente: " + ingrediente);
        return retorno.toString();
    }
}
