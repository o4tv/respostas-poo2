package Q1;

public class Q1retangulo {
    double largura;
    double altura;
    String cor;

    public Q1retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
        this.cor = "branco";
    }
    public Q1retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
        this.cor = "branco";
    }

    public double getArea() {
        return this.largura * this.altura;
    }
    public double getPerimetro() {
        return 2 * (this.largura + this.altura);
    }

    public double getLargura() {
        return this.largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}