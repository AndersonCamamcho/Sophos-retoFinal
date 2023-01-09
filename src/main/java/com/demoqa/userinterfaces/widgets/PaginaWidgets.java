package com.demoqa.userinterfaces.widgets;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaWidgets {

    public static final Target BOTON_WIDGETS = Target.the( "Subseccion de elementos")
            .located(By.xpath("//div[normalize-space()='Widgets']"));

}
