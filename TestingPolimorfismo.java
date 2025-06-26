public class TestingPolimorfismo {

    public static void main(String[] args) {
        FiguraGeometrica unaFigura = new FiguraGeometrica("Hexagono");
        unaFigura.setArea(48.5);
        unaFigura.setPerimetro(32.9);
        System.out.println("Datos de unaFigura" + unaFigura.toString());
        System.out.println();

        // Ejemplo de uso de sobrecarga:
        // como programadores decidimos en tiempo de edicion cuàl contructor usar
        FiguraGeometrica otraFigura = new FiguraGeometrica("Pentagono", 25.12);
        // Ejemplo de uso de sobre-escritura:
        // Almomento de correr, Java decide cual metodo toString() usar
        System.out.println("Datos de otraFigura: " + otraFigura.toString());
        System.out.println();

        Triangulo triangulo1 = new Triangulo("Triangulo", 10.2, 15.8);
        System.out.println("Datos de triangulo 1: " + triangulo1.toString());
        System.out.println();
        System.out.println("Area de triangulo 1: " + triangulo1.getArea());
        double perimetro = triangulo1.getPerimetro();
        System.out.println("Perimetro del Triangulo: " + perimetro);
        // si desde fuera de la clase hija necesitas usar un metodo de la clase padre, solo debes escrribir el objeto de la clase hija
        // y el nombre del metodo. por que un objeto de la clase hija es un objeto de la clase padre
        triangulo1.setPerimetro(perimetro);
        System.out.println("Datos de triangulo 1: " + triangulo1.toString());

        PrismaTriangular prismaTriangular = new PrismaTriangular("Prisma Triangular", triangulo1.getBase(), 20.5);
        System.out.println("Base de Prisma Triangular: " + prismaTriangular.getBase());
        System.out.println("Volumen de Prisma Triangular: " + prismaTriangular.getPrismaAltura());
        double volumen = prismaTriangular.getVolumen();
        System.out.println("Volumen del Prisma Triangular: " + volumen);
        System.out.println("Datos de Prisma Triangular: " + prismaTriangular.toString());
        System.out.println();

    }
    
}
