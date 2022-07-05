package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Corrida {
    private Double distanciaEmKm;
    private Double premioEmDolares;
    private String nome;
    private Integer numVeiculosPermitidos;
    private List<Veiculo> listaDeVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public Corrida(Double distanciaEmKm, Double premioEmDolares, String nome, Integer numVeiculosPermitidos) {
        this.distanciaEmKm = distanciaEmKm;
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.numVeiculosPermitidos = numVeiculosPermitidos;
        this.listaDeVeiculos = new ArrayList<>();
        this.socorristaCarro = new SocorristaCarro();
        this.socorristaMoto = new SocorristaMoto();
    }

    private void addVeiculo(Veiculo veiculo) {
        if(this.listaDeVeiculos.size() < this.numVeiculosPermitidos) {
            this.listaDeVeiculos.add(veiculo);
            System.out.println("Veículo adicionado com sucesso!");
        } else {
            System.out.println("Erro ao adicionar veículo, esta corrida está com a lista de veículos completa!");
        }
    }

    public void addCarro(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        this.addVeiculo(new Carro(velocidade, aceleracao, anguloGiro, placa));
    }
    public void addMoto(Double velocidade, Double aceleracao, Double anguloGiro, String placa) {
        this.addVeiculo(new Motocicleta(velocidade, aceleracao, anguloGiro, placa));
    }

    public Optional<Veiculo> getVeiculo(Veiculo veiculo) {
        for(Veiculo v : this.listaDeVeiculos) {
            if (v.equals(veiculo)) {
                return Optional.of(v);
            }
        }
        System.out.println("Veículo não encontrado.");
        return Optional.empty();
    }

    public Optional<Veiculo> getVeiculo(String placa) {
        for(Veiculo v : this.listaDeVeiculos) {
            if (v.getPlaca().equals(placa)) {
                return Optional.of(v);
            }
        }
        System.out.println("Veículo não encontrado.");
        return Optional.empty();
    }

    public void deleteVeiculo(Veiculo v) {
        Optional<Veiculo> veiculo = this.getVeiculo(v);
        if(veiculo.isPresent()) {
            this.listaDeVeiculos.remove(veiculo);
            System.out.println("Veículo eliminado com sucesso!");
        } else {
            System.out.println("Erro ao eliminar veículo.");
        }
    }

    public void deleteVeiculoComPlaca(String placa) {
        Optional<Veiculo> veiculo = this.getVeiculo(placa);
        if(veiculo.isPresent()) {
            this.listaDeVeiculos.remove(veiculo);
            System.out.println("Veículo eliminado com sucesso!");
        } else {
            System.out.println("Erro ao eliminar veículo.");
        }
    }

    private Double calcularResultadoDoVeiculo(Veiculo v) {
        return v.getVelocidade() * 0.5 * v.getAceleracao() / (v.getAnguldoDeGiro() * (v.getPeso() - v.getRodas() * 100));
    }

    public Veiculo vencedorDaCorrida() {
        Veiculo vencedor = null;
        double resultadoVencedor = 0;
        for(Veiculo v : this.listaDeVeiculos) {
            if(calcularResultadoDoVeiculo(v) > resultadoVencedor) {
                resultadoVencedor = calcularResultadoDoVeiculo(v);
                vencedor = v;
            }
        }

        return vencedor;
    }

    public void socorrerCarro(String placa) {
        this.socorristaCarro.socorro(placa);
    }

    public void socorrerMoto(String placa) {
        this.socorristaMoto.socorro(placa);
    }

    public Double getDistanciaEmKm() {
        return distanciaEmKm;
    }

    public Double getPremioEmDolares() {
        return premioEmDolares;
    }

    public String getNome() {
        return nome;
    }


    public Integer getNumVeiculosPermitidos() {
        return numVeiculosPermitidos;
    }


    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    @Override
    public String toString() {
        return "Corrida{" +
                "distanciaEmKm=" + distanciaEmKm +
                ", premioEmDolares=" + premioEmDolares +
                ", nome='" + nome + '\'' +
                ", numVeiculosPermitidos=" + numVeiculosPermitidos +
                ", listaDeVeiculos=" + listaDeVeiculos +
                '}';
    }
}
