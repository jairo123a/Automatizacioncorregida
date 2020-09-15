package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ElementosWebDoctor {


    public static final net.serenitybdd.screenplay.targets.Target agregar_doctor= Target.the("Click agregar doctor").located(By.xpath("//a[contains(text(),'Agregar Doctor')]"));
    public static final net.serenitybdd.screenplay.targets.Target name= Target.the("Nombre").located(By.id("name"));
    public static final net.serenitybdd.screenplay.targets.Target lastname= Target.the("Apellido").located(By.id("last_name"));
    public static final net.serenitybdd.screenplay.targets.Target telefono= Target.the("telefono").located(By.id("telephone"));
    public static final net.serenitybdd.screenplay.targets.Target tipoidenti= Target.the("celula").located(By.id("identification_type"));
    public static final net.serenitybdd.screenplay.targets.Target numerodpcumento= Target.the("numero").located(By.id("identification"));
    public static final net.serenitybdd.screenplay.targets.Target botonguardar= Target.the("boton").located(By.xpath("//a[@class='btn btn-primary pull-right']"));
    public static final net.serenitybdd.screenplay.targets.Target verificacioncreardoctor= Target.the("verificacion").located(By.xpath("//p[contains(text(),'Datos guardados correctamente.')]"));

}
