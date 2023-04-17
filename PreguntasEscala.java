package Preguntas;

import java.util.Scanner;

public class PreguntasEscala implements IPreguntas {
    private Scanner input = new Scanner(System.in);

    @Override
    public void hacerPregunta(int i) {
        System.out.println("¿Cómo de mucho te gusta la pizza? (1 = no me gusta, 5 = me encanta)");
        int respuesta = input.nextInt();

        while (respuesta < 1 || respuesta > 5) {
            System.out.println("Respuesta inválida. Por favor, introduce un número del 1 al 5:");
            respuesta = input.nextInt();
        }

        // Aquí podríamos almacenar la respuesta en algún lugar
    }
}