public class Unidades {
    public static void main (String[] args){
        
        cambiarLibrasAKilogramos(23.3);
        cambiarLibrasAKilogramos(223.3);
        cambiarPiesAMetros(100);
        //caminata de la semana
        double lunes = cambiarMillasAMetros(10);
        double martes = cambiarMillasAMetros(8.3);
        double miercoles = cambiarMillasAMetros(5.3);
        double jueves = cambiarMillasAMetros(13);
        double viernes = cambiarMillasAMetros(3);
        double kilometros = (lunes + martes + miercoles + jueves + viernes) / 1_000;
        System.out.println ("Kilómetros recorridos en la semana: " + kilometros);
        //calculo de la superficie de una finca
        double largo = 555.2;
        double ancho = 125;
        double superficieMetrosCuadrado = 
            cambiarYardasAMetros(largo) * cambiarYardasAMetros(ancho);
        System.out.println("La superficie de la finca es " + superficieMetrosCuadrado+ " m\u00B2");
    }

    public static void cambiarLibrasAKilogramos (double libras){
        double kilogramos = libras * 0.453592;
        System.out.println(libras + " libras son " + kilogramos + " kg");
    }

    public static void cambiarPiesAMetros (double pies){
        double metros = pies * 0.3048;
        System.out.println(pies + " pies son " + metros + " m");
    }

    public static double cambiarMillasAMetros (double millas) {
        double metros = millas * 1609.34;
        return metros; 
    }

    public static double cambiarYardasAMetros (double yardas) {
        return yardas * 0.9144;
    }








}

