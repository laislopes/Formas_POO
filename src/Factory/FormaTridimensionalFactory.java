package Factory;

import Tridimensional.Cilindro;
import Tridimensional.Cubo;
import Tridimensional.Esfera;
import Tridimensional.Tridimensional;

public class FormaTridimensionalFactory{

    public static Tridimensional getFormaTridimensional( String tipoFormaTridimensional ){

            switch(tipoFormaTridimensional){

            case "1":        return new Cubo();
            case "2":         return new Cilindro();
            case "3":       return new Esfera();
            default:                return null;

            }
        }

}