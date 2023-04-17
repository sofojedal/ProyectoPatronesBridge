package Preguntas;

public class Main {
    public static void main(String[] args) {
        IPreguntas preguntasEscala = new PreguntasEscala();
        IPreguntas preguntasSiNo = new PreguntasSiNo();
        IContadorRespuestas contadorSimple = new ContadorSimple();
        IContadorRespuestas contadorPromedio = new ContadorPromedio();

        Encuesta encuestaEscalaSimple = new Encuesta(preguntasEscala, contadorSimple);
        Encuesta encuestaEscalaPromedio = new Encuesta(preguntasEscala, contadorPromedio);
        Encuesta encuestaSiNoSimple = new Encuesta(preguntasSiNo, contadorSimple);
        Encuesta encuestaSiNoPromedio = new Encuesta(preguntasSiNo, contadorPromedio);

        encuestaEscalaSimple.hacerEncuesta();
        encuestaEscalaPromedio.hacerEncuesta();
        encuestaSiNoSimple.hacerEncuesta();
        encuestaSiNoPromedio.hacerEncuesta();
    }
}
