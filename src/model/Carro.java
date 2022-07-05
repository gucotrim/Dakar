package model;

public class Carro extends Veiculo{
    public Carro(Double velocidade, Double aceleracao, Double anguldoDeGiro, String placa) {
        super(velocidade, aceleracao, anguldoDeGiro, placa, 1000D, 4);
    }
}
