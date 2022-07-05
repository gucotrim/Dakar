package model;

public class SocorristaMoto implements Socorrista{
    @Override
    public void socorro(String placa) {
        System.out.println("Socorro moto, placa: " + placa);
    }
}
