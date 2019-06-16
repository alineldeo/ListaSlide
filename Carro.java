
public class Carro {

    public String ModelCar;
    public int AnoCar;
    public double[] precoCar = new double[5];
    public Double maior;
    public Double menor;
    public double media;
    public double soma;

    public Carro() {
    }

    public Carro(String ModelCar, int AnoCar, int PrecoCar) {
    }

    public void setModelCar(String Modelo) {
        this.ModelCar = Modelo;
    }

    public String getModelCar() {
        return this.ModelCar;
    }

    public void setAnoCar(int AnoCar) {
        this.AnoCar = AnoCar;
    }

    public int getAnoCar() {
        return AnoCar;
    }

    public void setprecoCar(double[] preco) {
        this.precoCar = preco;
    }

    public double[] getprecoCar() {
        return precoCar;
    }

    public double MaiorPreco() {
        double maior = getprecoCar()[0];
        for (int i = 0; i < 5; i++) {
            if (maior > getprecoCar()[i]) {
                maior = getprecoCar()[i];
            }
        }
        return maior;
    }

    public double MenorPreco() {
        double menor = getprecoCar()[0];
        for (int i = 0; i < 5; i++) {
            if (menor < getprecoCar()[i]) {
                menor = getprecoCar()[i];
            }
        }
        return menor;
    }

    public double MediaPreco() {
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma = soma + getprecoCar()[i];
        }
        return soma / 5;

    }

}
    