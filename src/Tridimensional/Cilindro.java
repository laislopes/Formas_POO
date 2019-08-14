package Tridimensional;

import javax.swing.JOptionPane;

public class Cilindro extends Tridimensional {
    
    float raio;
    float altura;
    
    public Cilindro(){
        this.raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o raio do Cilindro: "));
        this.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do Cilindro: "));
    }
    
    @Override
    public void calcularArea() {
        
        this.areaDaBase = ((raio*raio)*((float)Math.PI));
    }

    @Override
    public void calcularVolume() {

        this.volume = areaDaBase*altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
