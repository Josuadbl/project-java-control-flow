import java.util.Scanner;


public class WeatherAdvisorDesafio {
     public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa el número inicial: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingresa el número final: ");
        int fin = scanner.nextInt();

        
        for (int i = inicio; i <= fin; i++) {
            String resultado = "";

            
            if (i % 3 == 0) {
                resultado += "Fizz";
            }
            if (i % 5 == 0) {
                resultado += "Buzz";
            }
            if (i % 7 == 0) {
                resultado += "Boom";
            }

            
            if (resultado.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(resultado);
            }
        }

        scanner.close();
    }
}
