
package misrc;


public class Main7 {


    public static void main(String[] args) {
        String letra = "";
        String letras = ("");
        int cont = 0;
        
        while (letra != "stop") {
            System.out.println("Introduce un valor");
            letra = Entrada.readStr();
            if (letra == "stop") {
                System.out.println("Finalizando el proceso");
            } else {
                int lon = letras.length();
                for (int i=0; i < lon; i++) {
                    System.out.println("El array: " + letras[i]);
                }
            }
        }
    }  
}
