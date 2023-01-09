package com.demoqa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarTablasWeb implements Question <String> {

    public ValidarTablasWeb(Target target) {
        this.target = target;
    }

    private Target target;


    @Override
    public String answeredBy(Actor actor) {
        return Text.of(target).viewedBy(actor).asString();
    }

    public static ValidarTablasWeb getTex(Target target) {
        return new ValidarTablasWeb(target);
    }
}