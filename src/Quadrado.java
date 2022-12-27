public class Quadrado extends Bidimensional implements Forma{
    private double lado;

    public Quadrado(String nome, double base){
        super(nome);
        this.lado = base;
    }

    public double obterArea() {
        return lado * lado;
    }


}
