package Preguntas;

public class ContadorPromedio implements IContadorRespuestas {
    private int sum = 0;
    private int count = 0;

    @Override
    public void contarRespuesta(int respuesta) {
        sum += respuesta;
        count++;
    }

    @Override
    public void mostrarResultados() {
        double promedio = (double) sum / count;
        System.out.println("Promedio de respuestas: " + promedio);
    }
}
