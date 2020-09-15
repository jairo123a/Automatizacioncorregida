package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebDoctor;
import userinterface.ElementosWebPaciente;
import util.Tiempos;

public class PreguntaPaciente implements Question<Boolean> {

    String pregunta;
    Tiempos tiempos;
    public PreguntaPaciente(String pregunta){
        this.pregunta=pregunta;

    }

    public static PreguntaPaciente seRegistro(String pregunta){

        return new PreguntaPaciente(pregunta);

    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String respuesta;
        Boolean resultado;
        respuesta = Text.of(ElementosWebPaciente.verificacioncrearpaciente).viewedBy(actor).asString();

        if (pregunta.equals(respuesta)) {

            resultado = true;

        } else {

            resultado = false;

        }
        tiempos.espera();
        return resultado;
    }
}
