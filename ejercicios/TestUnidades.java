public class TestUnidades {

    public static void main (String[] args){
    
        UnidadesLibreria.cambiarLibrasAKilogramos(23.3);
        UnidadesLibreria.cambiarLibrasAKilogramos(223.3);
        UnidadesLibreria.cambiarPiesAMetros(100);
        //caminata de la semana
        double lunes = UnidadesLibreria.cambiarMillasAMetros(10);
        double martes = UnidadesLibreria.cambiarMillasAMetros(8.3);
        double miercoles = UnidadesLibreria.cambiarMillasAMetros(5.3);
        double jueves = UnidadesLibreria.cambiarMillasAMetros(13);
        double viernes = UnidadesLibreria.cambiarMillasAMetros(3);
        double kilometros = (lunes + martes + miercoles + jueves + viernes) / 1_000;
        System.out.println ("Kilómetros recorridos en la semana: " + kilometros);
        //calculo de la superficie de una finca
        double largo = 555.2;
        double ancho = 125;
        double superficieMetrosCuadrado = 
           UnidadesLibreria. cambiarYardasAMetros(largo) *
           UnidadesLibreria.cambiarYardasAMetros(ancho);
        System.out.println("La superficie de la finca es " + superficieMetrosCuadrado+ " m\u00B2");
    }

}
