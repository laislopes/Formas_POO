package Bidimensional;

import javax.swing.JOptionPane;


public class Quadrado extends Bidimensional {
    
    float lado;
    
    public Quadrado(){
        this.lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado do Quadrado: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.area = lado*lado;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro =  4*lado;
    }

}
