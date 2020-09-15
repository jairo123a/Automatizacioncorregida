package tasks;


import model.HospitalData;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosWebDoctor;


import java.util.List;

public class ElDoctor implements Task {


    List<HospitalData> datos;
    private ElDoctor(List data){

        datos=data;


    }

    public static ElDoctor seRegistra(List<HospitalData> data) {


      return new ElDoctor(data);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
                Click.on(ElementosWebDoctor.agregar_doctor),
                Enter.theValue(datos.get(0).getNombre()).into(ElementosWebDoctor.name),
                Enter.theValue(datos.get(0).getApellido()).into(ElementosWebDoctor.lastname),
                Enter.theValue(datos.get(0).getTelefono()).into(ElementosWebDoctor.telefono),
                Click.on(ElementosWebDoctor.tipoidenti),
                SelectFromOptions.byVisibleText(datos.get(0).getDocumento()).from(ElementosWebDoctor.tipoidenti),
                Enter.theValue(datos.get(0).getCedula()).into(ElementosWebDoctor.numerodpcumento),
                Click.on(ElementosWebDoctor.botonguardar)
);

    }

}
