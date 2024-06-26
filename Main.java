public class Main {
    public static void main(String[] args) {
        Factory factoryTriangulos = new RunFactoryTriangulos();
        Figura equilatero = factoryTriangulos.crearFigura("Equilatero");
        Figura escaleno = factoryTriangulos.crearFigura("Escaleno");
        Figura isosceles = factoryTriangulos.crearFigura("Isosceles");
        Figura tRectangulo = factoryTriangulos.crearFigura("TRectangulo");
        
        equilatero.crear();
        escaleno.crear();
        isosceles.crear();
        tRectangulo.crear();
        
        Factory factoryCuadrilateros = new RunFactoryCuadrilateros();
        Figura rectangulo = factoryCuadrilateros.crearFigura("Rectangulo");
        Figura cuadrado = factoryCuadrilateros.crearFigura("Cuadrado");
        Figura rombo = factoryCuadrilateros.crearFigura("Rombo");

        rectangulo.crear();
        cuadrado.crear();
        rombo.crear();

    }
}
