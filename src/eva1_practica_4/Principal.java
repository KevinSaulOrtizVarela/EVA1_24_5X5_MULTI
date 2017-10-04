package eva1_practica_4;
/**
 *
 * @author Kevin
 */
public class Principal {
    public static void main(String[] args) {
      double Arre1[][] = new double [5][5];
      double Arre2[][] = new double [5][5];
      double Arre3[][] = new double [5][5];
      /*SE LLENAN LOS DOS ARREGLOS CON NUMEROS ALEATORIOS 
      Y LA MULTIPLICACION DE AMBOS SE GUARDA EN EL ARREGLO 3*/
        for (int i = 0; i < Arre1.length; i++) {
            for (int j = 0; j < Arre1.length; j++) {
                Arre1[i][j] = (double) (Math.random() * (10)+1);
                Arre2[i][j] = (double) (Math.random() * (10)+1);
                Arre3[i][j]= Arre1[i][j]*Arre2[i][j];
            }
        }
        //IMPRIMIR EL PRIMER ARREGLO
        System.out.println("Arreglo 1");
        for (int i = 0; i <Arre1.length; i++) {
            for (int j = 0; j < Arre1.length; j++) {
                System.out.print("[" + Arre1[i][j] +"] ");
            }
            System.out.println("");
            
        }
       //IMPRIMIR EL SEGUNDO ARREGLO
        System.out.println("Arreglo 2");
        for (int i = 0; i <Arre2.length; i++) {
            for (int j = 0; j < Arre2.length; j++) {
                System.out.print("[" + Arre2[i][j] +"] ");
            }
            System.out.println("");
            
        }
           //IMPRIMIR EL TERCER ARREGLO
        System.out.println("Arreglo 3");
        for (int i = 0; i <Arre3.length; i++) {
            for (int j = 0; j < Arre3.length; j++) {
                System.out.print("[" + Arre3[i][j] +"] ");
            }
            System.out.println("");
            
        }
        
    }
}
