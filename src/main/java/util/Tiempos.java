package util;

import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.components.FileToUpload;

public class Tiempos extends PageObject {


    public void espera(){

        waitFor(3).second();
    }

}
