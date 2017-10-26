public class Casting {

    public static void main ( String[] args ){

        int x = 5, y = 2;
        System.out.println( "Valor de la división: " + x / y );
        double division = x / y;
        System.out.println( "Valor de la división: " + division );

        double mitad = x / 2;
        System.out.println( "Valor mitad: " + mitad );

        double middle = x / 2.0;
        System.out.println( "Valor mitad: " + middle );

        int a = 5, b = 2;
        double div = 1.0 * a / b ;
        System.out.println( "Valor de la división: " + div );

    }
}
