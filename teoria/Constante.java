public class Constante { 
    
    public static final int CONSTANTE1 = 8; //defino constante mediante final 

    public static void main ( String[] args ) {
        
        int variable  = 18;
        final int CONSTANTE2 = 18; //defino constante mediante final
    
        System.out.println( "variable  : " + variable );
        System.out.println( "constante : " + CONSTANTE1 );
        System.out.println( "constante : " + CONSTANTE2 );

        //modificamos valores:
        variable++;
        //CONSTANTE++; ¡ERROR! es un constante
   
        System.out.println( "variable  : " + variable );
        System.out.println( "constante : " + CONSTANTE1 );
        System.out.println( "constante : " + CONSTANTE2 );
        

    }
}

