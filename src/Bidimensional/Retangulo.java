package Bidimensional;

import javax.swing.JOptionPane;


public class Retangulo extends Bidimensional {
    
    float altura;
    float largura;
    
    public Retangulo(){
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Retângulo: "));
        this.largura = Float.parseFloat(JOptionPane.showInputDialog("Digite a largura do Retângulo: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.area = altura*largura;
    }

    @Override
    public void calcularPerimetro() {
        this.perimetro =  ((2*altura) + (2*largura));
    }
    
}
