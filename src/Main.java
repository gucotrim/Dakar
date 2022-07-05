import model.Corrida;
import model.Motocicleta;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(100D, 10000D, "DevRace", 4);

        System.out.println("Adicionando veículos");
        corrida.addCarro(240D, 10D, 90D, "C1");
        corrida.addCarro(220D, 7D, 95D, "C2");
        corrida.addMoto(250D, 5D, 50D, "M1");
        corrida.addMoto(210D, 15D, 60D, "M2");
        corrida.addMoto(200D, 12D, 65D, "M3");
        System.out.println();

        System.out.println("Lista de veículos");
        corrida.getListaDeVeiculos().forEach(System.out::println);
        System.out.println();

        System.out.println("Socorrendo veículos");
        corrida.socorrerCarro("C2");
        corrida.socorrerMoto("M1");
        System.out.println();

        System.out.println("Deletando veículos");
        corrida.deleteVeiculo(new Motocicleta(200D, 12D, 65D, "M3"));
        corrida.deleteVeiculoComPlaca("C2");
        System.out.println();

        System.out.println("Vencedor da corrida");
        System.out.println(corrida.vencedorDaCorrida());
    }
}
