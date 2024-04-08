public class Animal {

    private String nome;
    private String cor;
    private String ambiente;

    public Animal(String nome, String cor, String ambiente) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
    }
}
