package com.demoqa.userinterfaces.alertsFrameWindows;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAlertsFrameWindows {


    public static final Target ALERTS_FRAME_WINDOWS = Target.the( "Boton alerts, frame y widnows del home page")
            .located(By.xpath("(//*[name()='svg'][@stroke='currentColor'])[3]"));

    /*public static final Target ALERTS_FRAME_WINDOWS_2 = Target.the( "Boton alerts, frame y widnows de la sección alerts,frame y windows")
            .located(By.xpath("(//div[contains(text(),'Alerts, Frame & Windows')])[2]"));*/
}
