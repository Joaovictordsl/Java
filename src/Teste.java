public class Teste {

    public static void main(String[] args) {

        CaixaDeBrinquedo c = new CaixaDeBrinquedo();
        Quadrado q = new Quadrado("Quadrado", 5.0);
        c.adcFigura(q);

        Triangulo t = new Triangulo("Triangulo", 5.0, 3.0);
        c.adcFigura(t);

        Circulo circulo = new Circulo("Circulo", 5.0);
        c.adcFigura(circulo);

        Tetraedro tetraedro = new Tetraedro("Tetraedro", 5.0);
        c.adcFigura(tetraedro);

        Cubo cubo = new Cubo("Cubo", 5.0);
        c.adcFigura(cubo);

        Esfera esfera = new Esfera("Esfera", 6.0);
        c.adcFigura(esfera);

        c.mostrarFigura();


    }

}
