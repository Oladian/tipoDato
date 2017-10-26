public class CastingExplicito {
    public static void main(String[] args){
        //casting explicitos
        int x = 6;
        double y = 2.9;
        //x *= y * y;
        //x = x * (int) (y * y);  //(x *= y * y)     
        x = x * (int) y *  (int) y;  //(x *= y * y)     
       // x = 6 * 2.0 * 2.0 ;

        System.out.println("Resultado esperado es  24: " + x);

        float z = 2.4f; x = 6;
        //z /= x; 
        x = x /  (int) z ;
        
        System.out.println("Resultado esperado es 3 : " + x);

        y = 2.9; z = 2.4f;
        z = z -  (float) y ;
        System.out.println("Resultado esperado es -0.5: " + z);


    }
}
