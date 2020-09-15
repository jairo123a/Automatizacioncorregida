package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.thucydides.core.pages.PageObject;
import userinterface.ElementosWebDoctor;
import util.Tiempos;

public class PreguntaDoctor implements Question<Boolean> {

    String pregunta;
    Tiempos tiempos;
   public PreguntaDoctor(String pregunta){
       this.pregunta=pregunta;

   }

   public static PreguntaDoctor seRegistro(String pregunta){

       return new PreguntaDoctor(pregunta);

   }

    @Override
    public Boolean answeredBy(Actor actor) {

        String respuesta;
        Boolean resultado;
        respuesta = Text.of(ElementosWebDoctor.verificacioncreardoctor).viewedBy(actor).asString();

        if (pregunta.equals(respuesta)) {

            resultado = true;

        } else {

            resultado = false;

        }
        tiempos.espera();
        return resultado;

    }
}
