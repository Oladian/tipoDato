public class Moneda1 {
    public static void main(String[] arg) {
        
        final double EUROS_A_DOLARES = 1.18115;
        final double DOLARES_A_EUROS = 0.846632519;
        //para el valor 15
        double euros = 15;
        double dolares = 15;
        System.out.println( euros + " € son " + (euros * EUROS_A_DOLARES) +" $" );
        System.out.println( dolares + " $ son " + (dolares * DOLARES_A_EUROS) +" €" );
        //para el valor 25
        euros = 25;
        dolares = 25;
        System.out.println( euros + " € son " + (euros * EUROS_A_DOLARES) +" $" );
        System.out.println( dolares + " $ son " + (dolares * DOLARES_A_EUROS) +" €" );

        //para el valor 200
        euros = 200;
        dolares = 200;
        System.out.println( euros + " € son " + (euros * EUROS_A_DOLARES) +" $" );
        System.out.println( dolares + " $ son " + (dolares * DOLARES_A_EUROS) +" €" );


    }
}
