
package main;


public class Main {

    
    public static void main(String[] args) {
        int [] numeros = new int[15];
        int suma=0;
        for (int i = 0; i < numeros.length; i++) {
           int aleat = (int)(Math.random()* 15+1);
           System.out.println("num "+aleat);
           numeros[i] = aleat;
        }  
      for (int i = 0; i < numeros.length; i++) {
          suma+=numeros[i];
          
      }
            double promedio = suma/numeros.length;
            System.out.println("suma : " + suma);
            System.out.println("promedio : " + promedio);

        }
    }
    

