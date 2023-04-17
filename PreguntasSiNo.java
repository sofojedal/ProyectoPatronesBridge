package Preguntas;

import java.util.Scanner;

public class PreguntasSiNo implements IPreguntas {
	int contador[];  
    private Scanner input = new Scanner(System.in);

    @Override
    public void hacerPregunta(int i) {
        System.out.println("¿Has estado alguna vez en Nueva York? (Si o No)");
        String respuesta = input.nextLine();

        while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {
            System.out.println("Respuesta inválida. Por favor, responde con Si o No:");
            respuesta = input.nextLine();
        }
        
        for (int j = 0; j < 5; j++) {
        	
        }
        // Aquí podríamos almacenar la respuesta en algún lugar
    }
}
