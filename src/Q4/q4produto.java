package Q4;
public class q4produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;
    private double margemLucro;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoCusto() {
        return this.precoCusto;
    }
    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
        calcularMargemLucro();
    }

    public double getPrecoVenda() {
        return this.precoVenda;
    }
    public void setPrecoVenda(double precoVenda) {
        if (precoVenda >= this.precoCusto) {
            this.precoVenda = precoVenda;
            calcularMargemLucro();
        } else {
            System.out.println("ALERTA: O preço de venda não pode ser inferior ao preço de custo.");
        }
    }

    // deixei a classe privada porque a margem de lucro é definida pelos valores internos da classe
    private void setMargemLucro(double margemLucro) {
        this.margemLucro = margemLucro;
    }
    public void calcularMargemLucro() {
        setMargemLucro(this.precoVenda - this.precoCusto);
    }
    public double getMargemLucro() {
        return this.margemLucro;
    }
    public double getMargemLucroPorcentagem() {
        if (this.precoCusto > 0) {
            this.calcularMargemLucro();
            return (this.margemLucro / this.precoCusto) * 100.0;
        }
        return 0.0;
    }
}
