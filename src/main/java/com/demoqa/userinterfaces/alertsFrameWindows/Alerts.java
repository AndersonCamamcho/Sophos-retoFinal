package com.demoqa.userinterfaces.alertsFrameWindows;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Alerts {

    public static final Target ALERTAS = Target.the( "Sub seccion de alerts, frame and windows")
            .located(By.xpath("//span[normalize-space()='Alerts']"));
    public static final Target ALERTA_1 = Target.the( "Alert sencillo")
            .located(By.id("alertButton"));
    public static final Target ALERTA_2 = Target.the( "Alert que tarda 5 segundos en aparecer")
            .located(By.id("timerAlertButton"));
    public static final Target ALERTA_3 = Target.the( "Alert de confirmacion")
            .located(By.id("confirmButton"));
    public static final Target ALERTA_4 = Target.the( "Alert promt que pide un nombre")
            .located(By.id("promtButton"));
}
