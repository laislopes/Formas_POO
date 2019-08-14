package Bidimensional;

import javax.swing.JOptionPane;


public class TrianguloEquilatero extends Bidimensional {
    
    float lado;
    float altura;
    
    public TrianguloEquilatero(){
        this.lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado do Triângulo: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Triângulo: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.area =  ((lado*altura))/2;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro = 3*lado;
    }

}
