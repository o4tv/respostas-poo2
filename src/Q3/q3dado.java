package Q3;
import java.util.Random;

public class q3dado {
    private final int quantidadeFaces = 6;
    private int valorFace;

    public q3dado() {
        this.valorFace = 1;
    }

    public void rolar() {
        Random random = new Random();
        // 1 + porque ele gera o numero aleatorio começando do 0
        this.valorFace = 1 + random.nextInt(this.quantidadeFaces);
    }

    public int getQuantidadeFaces() {
        return this.quantidadeFaces;
    }

    public int getValorFace() {
        return this.valorFace;
    }
    public void setValorFace(int valorFace) {
        if (valorFace >= 1 && valorFace <= this.quantidadeFaces) {
            this.valorFace = valorFace;
        } else {
            System.out.println("Face inválida. Escolha um número inteiro de 1 à 6.");
        }
    }
}
