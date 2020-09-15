package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebCita {

    public static final net.serenitybdd.screenplay.targets.Target agregarcita= Target.the("boton").located(By.xpath("//a[contains(text(),'Agendar Cita')]"));
    public static final net.serenitybdd.screenplay.targets.Target fecha= Target.the("paciente").located(By.id("datepicker"));
    public static final net.serenitybdd.screenplay.targets.Target idpaciente= Target.the("paciente").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del paciente']"));
    public static final net.serenitybdd.screenplay.targets.Target iddoctot= Target.the("doctor").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad del doctor']"));
    public static final net.serenitybdd.screenplay.targets.Target comentario= Target.the("comentario").located(By.xpath("//*[@id=\'page-wrapper\']/div/div[3]/div/div[4]/textarea"));
    public static final net.serenitybdd.screenplay.targets.Target guardar= Target.the("guardar").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final net.serenitybdd.screenplay.targets.Target verificarcita= Target.the("guardar").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));


}
