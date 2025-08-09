package Q5;
public class q5circulo {
    private final double PI = 3.14; // constante de pi
    private double raio;

    public q5circulo(double raio) {
        this.raio = raio;
    }

    public void aumentarRaio(double percentual) {
        if (percentual > 0) {
            this.raio *= (1 + percentual / 100.0);
        }
    }

    public double getArea() {
        return PI * this.raio * this.raio;
    }
    public double getCircunferencia() {
        return 2 * PI * this.raio;
    }

    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
}