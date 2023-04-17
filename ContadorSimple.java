package Preguntas;

public class ContadorSimple implements IContadorRespuestas {
    private int[] respuestas = new int[6];

    @Override
    public void contarRespuesta(int respuesta) {
        respuestas[respuesta]++;
    }

    @Override
    public void mostrarResultados() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Respuestas de " + i + ": " + respuestas[i]);
        }
    }
}
