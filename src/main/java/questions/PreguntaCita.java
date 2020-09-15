package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebCita;
import userinterface.ElementosWebDoctor;
import util.Tiempos;

public class PreguntaCita implements Question<Boolean> {
    String pregunta;
    Tiempos tiempos;
    public PreguntaCita(String pregunta){

        this.pregunta=pregunta;

    }

    public static PreguntaCita seAgendo(String pregunta){

        return new PreguntaCita(pregunta);

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String respuesta;
        Boolean resultado;
        respuesta = Text.of(ElementosWebCita.verificarcita).viewedBy(actor).asString();

        if (pregunta.equals(respuesta)) {

            resultado = true;

        } else {

            resultado = false;

        }
        tiempos.espera();
        return resultado;

    }
}
