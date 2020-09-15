package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebPaciente {

    public static final net.serenitybdd.screenplay.targets.Target agregarpaciente= Target.the("boton").located(By.xpath("//a[contains(text(),'Agregar Paciente')]"));
    public static final net.serenitybdd.screenplay.targets.Target namepaciente= Target.the("Nombre").located(By.xpath("//input[@placeholder='Ingrese el nombre']"));
    public static final net.serenitybdd.screenplay.targets.Target lastnampaciente= Target.the("Apellido").located(By.xpath("//input[@placeholder='Ingrese los apellidos']"));
    public static final net.serenitybdd.screenplay.targets.Target telefonopaciente= Target.the("telefono").located(By.xpath("//input[@placeholder='Ingrese el teléfono']"));
    public static final net.serenitybdd.screenplay.targets.Target tipoidentipaciente= Target.the("celula").located(By.xpath("//select[@name='identification_type']"));
    public static final net.serenitybdd.screenplay.targets.Target numerodpcumentopaciente= Target.the("numero").located(By.xpath("//input[@placeholder='Ingrese el documento de identidad']"));
    public static final net.serenitybdd.screenplay.targets.Target botonguardar= Target.the("boton").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final net.serenitybdd.screenplay.targets.Target verificacioncrearpaciente= Target.the("verificacion").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));


}
