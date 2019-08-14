package Factory;

import Bidimensional.Bidimensional;
import Bidimensional.Circulo;
import Bidimensional.Quadrado;
import Bidimensional.Retangulo;
import Bidimensional.TrianguloEquilatero;

public class FormaBidimensionalFactory{
    
    public static Bidimensional getFormaBidimensional( String tipoFormaBidimensional ){

            switch(tipoFormaBidimensional){

            case "1":    return new Quadrado();
            case "2":     return new Circulo();
            case "3":   return new Retangulo();
            case "4":   return new TrianguloEquilatero();
            default:            return null;

            }
    }
    
}