package CalcularArea;

public class Cuadrilatero {
    private float lado1;
    private float lado2;

    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    public Cuadrilatero(float lado1) {
        this.lado1 = lado1;
        this.lado2 = lado1;
    }

    public void getArea(){
        float area = (lado1 * lado2);
        System.out.println("El área es: " + area);
    }
    public void getPerimetro(){
        float perimetro = (lado1 + lado2) * 2;
        System.out.println("El perímetro es: " + perimetro);
    }

    public float getLado1() {
        return lado1;
    }
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }
    public float getLado2() {
        return lado2;
    }
    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}
