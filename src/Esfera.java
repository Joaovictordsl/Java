import java.lang.Math;

public class Esfera extends Tridimensional implements Forma{
    private double raio;

    public Esfera(String nome, double raio){
        super(nome);
        this.raio = raio;

    }


    public double obterArea(){
        return 4*Math.PI*Math.pow(raio,2);
    }

    public double obterVolume(){
        return 4f/3f*Math.PI*Math.pow(raio,3);
    }
}
