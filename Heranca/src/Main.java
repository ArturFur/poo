public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Leão", "Amarelo", "Savana");


        System.out.println("Dados do animal:");
        animal.dados();
        System.out.println();


        Peixe peixe = new Peixe("Tubarão", "Cinza", "Oceano", "Cartilaginoso");


        System.out.println("Dados do peixe:");
        peixe.dadosPeixe();
        System.out.println();


        Mamifero mamifero = new Mamifero("Gato", "Preto", "Casa", "Ração");


        System.out.println("Dados do mamífero:");
        mamifero.dadosMamifero();
    }
}