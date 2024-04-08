public class Peixe extends Animal {

    private String caracteristica;


    public Peixe(String nome, String cor, String ambiente, String caracteristica) {
        super(nome, cor, ambiente);
        this.caracteristica = caracteristica;
    }


    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }


    public void dadosPeixe() {
        super.dados();
        System.out.println("Característica: " + caracteristica);
    }
}
