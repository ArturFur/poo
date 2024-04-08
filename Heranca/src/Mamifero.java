public class Mamifero extends Animal {

    private String alimento;


    public Mamifero(String nome, String cor, String ambiente, String alimento) {
        super(nome, cor, ambiente);
        this.alimento = alimento;
    }


    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }


    public void dadosMamifero() {
        super.dados();
        System.out.println("Alimento: " + alimento);
    }
}
