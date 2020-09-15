package tasks;


import model.HospitalDataCIta;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.ElementosWebCita;


import java.util.List;

public class LaCita implements Task  {
    List<HospitalDataCIta> datos;

    private LaCita(List data){

        datos=data;

    }

    public static LaCita seAgenda(List<HospitalDataCIta> data) {


        return new LaCita(data);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(ElementosWebCita.agregarcita),
                Enter.theValue(datos.get(0).fechacita).into(ElementosWebCita.fecha),
                Enter.theValue(datos.get(0).documentopaciente).into(ElementosWebCita.idpaciente),
                Enter.theValue(datos.get(0).documentodoctor).into(ElementosWebCita.iddoctot),
                Enter.theValue(datos.get(0).observacion).into(ElementosWebCita.comentario),
                Click.on(ElementosWebCita.guardar)

        );
    }

}
