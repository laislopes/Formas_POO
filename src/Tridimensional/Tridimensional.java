package Tridimensional;


public abstract class Tridimensional {
    
    protected float areaDaBase;
    protected float volume;
    
    public float getArea(){
        return areaDaBase;
    };
    
    public float getVolume(){
        return volume;
    }; 
    
    public abstract void calcularArea();
    public abstract void calcularVolume(); 
}
