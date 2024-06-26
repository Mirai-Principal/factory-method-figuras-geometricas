

public class RunFactoryCuadrilateros extends Factory{

    public RunFactoryCuadrilateros() {
        System.out.println("Creando Cuadrilateros");
    }

    @Override
    public Figura crearFigura(String tipo){
        switch (tipo) {
            case "Rectangulo":
                return new Rectangulo();
            case "Cuadrado":
                return new Cuadrado();
            case "Rombo": 
                return new Rombo();
            default:
                throw new IllegalArgumentException("Cuadrilatero desconocido");
        }
    }
}
