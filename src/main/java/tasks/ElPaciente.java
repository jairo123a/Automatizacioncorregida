package tasks;

import model.HospitalData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.ElementosWebPaciente;

import java.util.List;

public class ElPaciente implements Task {
    List<HospitalData> datos;

    private ElPaciente(List data){

        datos=data;

    }

    public static ElPaciente seRegistra(List<HospitalData> data) {


        return new ElPaciente(data);

    }


    @Override
    public <T extends Actor> void performAs(T actor) {

               actor.attemptsTo(
               Click.on(ElementosWebPaciente.agregarpaciente),
               Enter.theValue(datos.get(0).getNombre()).into(ElementosWebPaciente.namepaciente),
               Enter.theValue(datos.get(0).getApellido()).into(ElementosWebPaciente.lastnampaciente),
               Enter.theValue(datos.get(0).getTelefono()).into(ElementosWebPaciente.telefonopaciente),
               Click.on(ElementosWebPaciente.tipoidentipaciente),
               SelectFromOptions.byVisibleText(datos.get(0).getDocumento()).from(ElementosWebPaciente.tipoidentipaciente),
               Enter.theValue(datos.get(0).getCedula()).into(ElementosWebPaciente.numerodpcumentopaciente),
               Click.on(ElementosWebPaciente.botonguardar)

               );
    }
}

