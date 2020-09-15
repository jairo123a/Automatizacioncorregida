package Prueba.definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.HospitalData;
import model.HospitalDataCIta;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaCita;
import questions.PreguntaDoctor;
import questions.PreguntaPaciente;
import tasks.Abrir;
import tasks.ElDoctor;
import tasks.ElPaciente;
import tasks.LaCita;

import java.util.List;

public class Definition {


     @Before
     public  void serStage(){
         OnStage.setTheStage(new OnlineCast());

     }



    @Given("^Ingresar a la Página del Sistema de Administración de Hospitales$")
    public void ingresarALaPáginaDelSistemaDeAdministraciónDeHospitales() {
          OnStage.theActorCalled("jairo").wasAbleTo(Abrir.laPagina());
    }




    @When("^Ingrese al menú AGREGAR DOCTOR y crear un nuevo registro\\.$")
    public void ingreseAlMenúAGREGARDOCTORYCrearUnNuevoRegistro(List<HospitalData> data) {

        OnStage.theActorInTheSpotlight().attemptsTo(ElDoctor.seRegistra(data));
    }

    @Then("^Verificar el mensaje de ingreso exitoso del registro para doctor \"([^\"]*)\"$")
    public void verificarElMensajeDeIngresoExitosoDelRegistroParaDoctor(String arg1) {
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaDoctor.seRegistro(arg1)));
    }


    @When("^Ingrese al menú AGREGAR Un paciente y crear un nuevo registro\\.$")
    public void ingreseAlMenúAGREGARUnPacienteYCrearUnNuevoRegistro(List<HospitalData> arg1) {

        OnStage.theActorInTheSpotlight().attemptsTo(ElPaciente.seRegistra(arg1));

     }

    @Then("^Verificar el mensaje de ingreso exitoso para paciente  del registro \"([^\"]*)\"$")
    public void verificarElMensajeDeIngresoExitosoParaPacienteDelRegistro(String arg1) {

         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaPaciente.seRegistro(arg1)));

    }
    @When("^Ingrese al menú agendar cita y agregarla\\.$")
    public void ingreseAlMenúAgendarCitaYAgregarla(List<HospitalDataCIta>  arg1) {
         OnStage.theActorInTheSpotlight().attemptsTo(LaCita.seAgenda(arg1));
    }

    @Then("^Verificar el mensaje de ingreso exitoso para agendar cita \"([^\"]*)\"$")
    public void verificarElMensajeDeIngresoExitosoParaAgendarCita(String arg1) {
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaCita.seAgendo(arg1)));
    }

}
