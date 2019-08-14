package Tridimensional;

import javax.swing.JOptionPane;

public class Cubo extends Tridimensional {
    
    float lado;
    
    public Cubo(){
        this.lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado do Cubo: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.areaDaBase = (6*(lado*lado));
    }

    @Override
    public void calcularVolume() {

        this.volume = lado*lado*lado;
    }
      
}
