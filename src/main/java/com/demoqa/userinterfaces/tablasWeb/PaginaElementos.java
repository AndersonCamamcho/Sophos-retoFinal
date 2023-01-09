package com.demoqa.userinterfaces.tablasWeb;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaElementos {

    public static final Target BOTON_ELEMENTOS  = Target.the( "Boton para ingresar al registro de datos")
            .located(By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]"));


    //*[@id='app']/div/div/div[2]/div/div[1]

}
