

public class RunFactoryTriangulos extends Factory{

    public RunFactoryTriangulos() {
        System.out.println("Creando Triangulos");
    }


    @Override
    public Figura crearFigura(String tipo){
        switch (tipo) {
            case "Equilatero":
                return new Equilatero();
            case "Isosceles":
                return new Isosceles();
            case "TRectangulo":
                return new TRectangulo();
            case "Escaleno":
                return new Escaleno();
        
            default:
                throw new IllegalArgumentException("Triangulo desconocido");
        }
    }
}
