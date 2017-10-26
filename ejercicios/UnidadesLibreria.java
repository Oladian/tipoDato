public class UnidadesLibreria {
   

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

