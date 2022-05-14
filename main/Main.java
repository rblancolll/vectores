
package main;


public class Main {

    
    public static void main(String[] args) {
        int[] enteros = new int[100]; //{100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90};
        int tamañoVector = enteros.length - 100;
        //System.out.println(tamañoVector);
        int resultado = enteros[1]+enteros[10];
    
        
        for(int i=0; i<enteros.length; i++){
            System.out.println("Numero " + enteros[i] );
        }
    }
    
}
