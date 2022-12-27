import java.lang.Math;

public class Cubo extends Tridimensional implements Forma{
    private double aresta;

    public Cubo(String nome, double aresta){
        super(nome);
        this.aresta = aresta;

    }

    public double obterArea(){
        return 6*(Math.pow(aresta,2));
    }


    public double obterVolume(){
        return Math.pow(aresta,3);
    }
}
