import com.fasterxml.jackson.annotation.JsonProperty;

public class Resposta {

    @JsonProperty("name")
    private String nome;

    @JsonProperty("age")
    private int idade;

    @JsonProperty("count")
    private int contagem;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
}