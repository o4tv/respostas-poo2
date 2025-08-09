package Q2;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class q2ContaBancaria {
    private double saldo;
    private Date dataAbertura;

    public q2ContaBancaria() {
        this.saldo = 0.0;
        this.dataAbertura = new Date();
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente. Saldo atual:" + this.saldo);
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
    public String getSaldoFormatado() {
        // = new locale() ficou obsoleto
        Locale brasil = Locale.of("pt", "BR");
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(brasil);
        return formatoMoeda.format(this.saldo);
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Date getDataAbertura() {
        return this.dataAbertura;
    }
}