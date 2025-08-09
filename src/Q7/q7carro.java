package Q7;
public class q7carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public q7carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0.0;
    }
    
    public void acelerar(double valor) {
        double novaVelocidade = this.velocidadeAtual + valor;
        if (novaVelocidade > 180.0) {
            this.velocidadeAtual = 180.0;
            System.out.println("Velocidade máxima de 180 km/h atingida.");
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }
    
    public void frear(double valor) {
        double novaVelocidade = this.velocidadeAtual - valor;
        if (novaVelocidade < 0) {
            this.velocidadeAtual = 0.0;
        } else {
            this.velocidadeAtual = novaVelocidade;
        }
    }
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }
}