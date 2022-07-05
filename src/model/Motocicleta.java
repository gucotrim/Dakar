package model;

public class Motocicleta extends Veiculo{
    public Motocicleta(Double velocidade, Double aceleracao, Double anguldoDeGiro, String placa) {
        super(velocidade, aceleracao, anguldoDeGiro, placa, 300D, 2);
    }
}
