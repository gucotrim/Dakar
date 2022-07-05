package model;

public abstract class Veiculo {
    private Double velocidade;
    private Double aceleracao;
    private Double anguldoDeGiro;
    private String placa;
    private Double peso;
    private Integer rodas;

    public Veiculo(Double velocidade, Double aceleracao, Double anguldoDeGiro, String placa, Double peso, Integer rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguldoDeGiro = anguldoDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(Double velocidade) {
        this.velocidade = velocidade;
    }

    public Double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(Double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public Double getAnguldoDeGiro() {
        return anguldoDeGiro;
    }

    public void setAnguldoDeGiro(Double anguldoDeGiro) {
        this.anguldoDeGiro = anguldoDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getRodas() {
        return rodas;
    }

    public void setRodas(Integer rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguldoDeGiro=" + anguldoDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
