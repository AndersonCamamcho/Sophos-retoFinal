package com.demoqa.userinterfaces.tablasWeb;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarDatosTablasWeb {


    public static final Target BOTON_TABLASWEB = Target.the( "Sub seccion de preingreso de datos")
            .located(By.xpath("//span[contains(text(),'Tables')]"));
    public static final Target ELIMINAR_3= Target.the( "Eliminar registro")
            .located(By.xpath("//*[@id='delete-record-3']"));
    public static final Target ELIMINAR_2= Target.the( "Eliminar registro")
            .located(By.xpath("//*[@id='delete-record-2']"));
    public static final Target ELIMINAR_1= Target.the( "Eliminar registro")
            .located(By.xpath("//*[@id='delete-record-1']"));
    public static final Target BOTON_REGISTER_FORM = Target.the( "Nos abre la ventana para ingresar los datos")
            .located(By.xpath("//*[@id='addNewRecordButton']"));

    public static final Target FIRST_NAME = Target.the( "Campo para ingresar nombre")
            .located(By.xpath("//*[@id='firstName']"));
    public static final Target LAST_NAME= Target.the( "Campo para ingresar apellido")
            .located(By.xpath("//*[@id='lastName']"));
    public static final Target EMAIL= Target.the( "Campo para ingresar correo electronico")
            .located(By.xpath("//*[@id='userEmail']"));
    public static final Target AGE= Target.the( "Campo para ingresar edad")
            .located(By.xpath("//*[@id='age']"));
    public static final Target SALARY= Target.the( "Campo para ingresar salario")
            .located(By.xpath("//*[@id='salary']"));
    public static final Target DEPARTMENT= Target.the( "Campo para ingresar departamento")
            .located(By.xpath("//*[@id='department']"));

    public static final Target SUBMIT= Target.the( "Campo para ingresar departamento")
            .located(By.xpath("//button[@id='submit']"));

    public static final Target QUESTION_TABLAS_WEB= Target.the( "Question")
            .located(By.xpath("//div[contains(text(),'Automatizacion')]"));



}
