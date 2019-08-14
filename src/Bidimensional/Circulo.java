package Bidimensional;

import javax.swing.JOptionPane;


public class Circulo extends Bidimensional {
    
    float raio;
    
    public Circulo(){
        this.raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do Círculo: "));
    }
    
    @Override
    public void calcularArea() {
       
        this.area = (((float)Math.PI)*(raio*raio));
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = (((float)Math.PI)*(2*raio));
    }
      
}
