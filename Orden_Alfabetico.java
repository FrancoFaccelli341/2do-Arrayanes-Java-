import java.util.Arrays;
import java.util.Scanner;

public class Orden_Alfabetico {



 
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int cant;
        char[] letras = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        System.out.print("Ingresa la cantidad de palabras que vas a ingresar en numeros: ");
        cant = lector.nextInt();

        String[] palabras = new String[cant];



        for (int i = 0; i<palabras.length;i++){
            System.out.print("Ingresa la palabra nro" + (i+1) + ": ");
            palabras[i] = lector.next();
        }


        char espacio;
        int[] algo = new int[cant];
         

        for (int i = 0; i < cant; i++){
            espacio = palabras[i].charAt(0);
            for (int z = 0; z < letras.length; z++){
                if(espacio == letras[z]){
                    algo[i] = i;
                }
            }
        }

        
        Arrays.sort(algo);

        String[] orden_final = new String[cant];
        for (int i = 0; i < cant; i++){
            for (int z = 0; z < letras.length; z++){
                if (algo[i] == letras[z]){
                    orden_final[i] = palabras[i];
                }
            }
        }


        for (int i = 0; i < cant; i++){
            System.out.println(orden_final[i]);
        }









        lector.close();
    }
}
