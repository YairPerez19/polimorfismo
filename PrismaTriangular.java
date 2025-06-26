public class PrismaTriangular extends Triangulo {
    private double base;
    private double PrismaAltura;
    private double volumen;

    public PrismaTriangular(String nombre, double base, double prismaAltura) {
        super(nombre, base, prismaAltura);
        this.PrismaAltura = prismaAltura;
    }
    
    public double getPrismaAltura() {
        return PrismaAltura;
    }

    public void setPrismaAltura(double prismaAltura) {
        PrismaAltura = prismaAltura;
    }

    public double getVolumen() {
        volumen = super.getBase() * PrismaAltura;
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }


    @Override
    public String toString() {
        return super.toString() +"PrismaTriangular [base=" + base + ", PrismaAltura=" + PrismaAltura + ", volumen=" + volumen + "]";
    }


    
    

}
