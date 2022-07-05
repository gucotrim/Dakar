package model;

public class SocorristaCarro implements Socorrista{
    @Override
    public void socorro(String placa) {
        System.out.println("Socorro carro, placa: " + placa);
    }
}
