public class Circulo extends Bidimensional implements Forma{
    private double raio;

    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }

    public double obterArea() {
        return 3.14*raio*raio;
    }

}
