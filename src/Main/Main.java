//GUSTAVO MARTINS PACHECO HT3000231
//LAÍS JAQUELINE DA SILVA LOPES HT3000168

package Main;

import Bidimensional.Bidimensional;
import Factory.FormaBidimensionalFactory;
import Factory.FormaTridimensionalFactory;
import Tridimensional.Tridimensional;
import javax.swing.JOptionPane;

public class Main{

    public static void main(String[]args){
       
    String opcaoTipoDeForma = JOptionPane.showInputDialog("Bem-vindo ao Construtor de Formas!"
                                          + "\n\nDigite uma opção para escolher o "
                                          + "tipo de forma que deseja criar: \n\n"
                                          + "1 - Bidimensional\n"
                                          + "2 - Tridimensional\n");
    
    
    System.out.println(opcaoTipoDeForma);
    
    if(opcaoTipoDeForma.equals("1")){
        
        String opcaoForma = JOptionPane.showInputDialog("Digite uma opção para escolher"
                                          + " a forma que deseja criar: \n\n"
                                          + "1 - Quadrado\n"
                                          + "2 - Círculo\n"
                                          + "3 - Retângulo\n"
                                          + "4 - Triângulo Equilátero\n");
        
        Bidimensional forma = FormaBidimensionalFactory.getFormaBidimensional(opcaoForma);
        
        forma.calcularArea();
        forma.calcularPerimetro();
        
        JOptionPane.showMessageDialog(null, "Área da forma: " + forma.getArea() 
                                          + "\nPerímetro da forma: " + forma.getPerimetro()
                                          + "\n");
        
        
          
    }
    
    if(opcaoTipoDeForma.equals("2")){
        
        String opcaoForma = JOptionPane.showInputDialog("Digite uma opção para escolher"
                                          + " a forma que deseja criar: \n\n"
                                          + "1 - Cubo\n"
                                          + "2 - Cilindro\n"
                                          + "3 - Esfera\n");
        
        Tridimensional forma = FormaTridimensionalFactory.getFormaTridimensional(opcaoForma);
        
        forma.calcularArea();
        forma.calcularVolume();
        
        JOptionPane.showMessageDialog(null, "Área da forma: " + forma.getArea() 
                                          + "\nVolume da forma: " + forma.getVolume()
                                          + "\n");
    }
    
    
    
    }
}