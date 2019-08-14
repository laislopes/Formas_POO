package Bidimensional;


public abstract class Bidimensional implements Comparable<Bidimensional>{
    
    protected float area;
    protected float perimetro;
    
    public float getArea(){
        return area;
    };
    
    public float getPerimetro(){
        return perimetro;
    };
    
    public abstract void calcularArea();
    public abstract void calcularPerimetro(); 
 
}
