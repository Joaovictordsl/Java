public class Triangulo extends Bidimensional implements Forma{
    private double base;
    private double altura;

    public Triangulo(String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }


    public double obterArea() {
        return base*altura/2;


    }

}
