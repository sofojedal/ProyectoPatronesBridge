package Preguntas;

public class Encuesta {
    private IPreguntas preguntas;
    private IContadorRespuestas contador;

    public Encuesta(IPreguntas preguntas, IContadorRespuestas contador) {
        this.preguntas = preguntas;
        this.contador = contador;
    }

    public void hacerEncuesta() {
        for (int i = 1; i <= 5; i++) {
            preguntas.hacerPregunta(i);
            int respuesta = obtenerRespuesta("");
            contador.contarRespuesta(respuesta);
        }

        contador.mostrarResultados();
    }

    private int obtenerRespuesta(String respuesta) {
        // Este método podría ser diferente dependiendo de la implementación de Preguntas
    	if (respuesta.endsWith("A")) {
    		//Esto es para una respuesta de Si o No
			
    		
		}
        return 0;
    }
    
}