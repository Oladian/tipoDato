public class CastingImplicito {
    public static void main(String[] args){
        //casting implicitos
        int x = 6;
        double y = 23;
        
        y *= x * x; // y = 23 * ( 6 * 6 )

        System.out.println("Resultado esperado es 828 : " + y);

        float z = 24; //se lee como int (4 bytes) y se guarda float (4 bytes)
        z /= x; // z = z / ( x )
        
        System.out.println("Resultado esperado es 4 : " + z);

        y = 23; z = 24;
        y -= z;  // y = y - ( z )
        System.out.println("Resultado esperado es -1.0: " + y);


    }
}
