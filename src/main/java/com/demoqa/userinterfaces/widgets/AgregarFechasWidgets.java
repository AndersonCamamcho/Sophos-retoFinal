package com.demoqa.userinterfaces.widgets;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarFechasWidgets {

    public static final Target BOTON_DATAPICKER = Target.the( "Subseccion de widgets")
            .located(By.xpath("//span[contains(text(),'Date Picker')]"));

    public static final Target DATE = Target.the( "Campo para ingresar fechas")
            .located(By.xpath("//input[@id='datePickerMonthYearInput']"));

    public static final Target DATEANDTIME = Target.the( "Campo para ingresar fechas y horas")
            .located(By.xpath("//input[@id='dateAndTimePickerInput']"));

    public static final Target QUESTION_WIDGETS= Target.the( "Question")
            .located(By.xpath("//input[@id='dateAndTimePickerInput']"));


    //*[normalize-space()='December 24, 2020 01:50 PM']
    //*[contains(text(),'December 24, 2020 01:50 PM')]


}
