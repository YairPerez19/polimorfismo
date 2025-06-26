public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Polimorfismo dinamico - sobre-escritura de metodos
    @Override
    public double getArea() {
        double a = this.base * this.altura / 2;
        super.setArea(a);
        return a;
    }
    @Override
    public double getPerimetro(){
        double p = 3 * this.base;
        // Si desde la clase hija necesitas usar en metodo de la clase padre debes usar super. y el nobre del metodo
        //super.setPerimetro(p);
        return p;
    }

    // Polimorfismo dinamico sobre-escritura
    // Sobreescribimos el metodo toString() de la clase FiguraGeometrica
    @Override
    public String toString() {
        return super.toString() + "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
    

    
}