package Tridimensional;

import javax.swing.JOptionPane;

public class Esfera extends Tridimensional {
    
    float raio;
    
    public Esfera(){
       this.raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio da Esfera: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.areaDaBase = ((4*raio*raio)*((float)Math.PI));
    }

    @Override
    public void calcularVolume() {
        this.volume = ((4/3)*((raio*raio*raio)*((float)Math.PI)));
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    
  
}
