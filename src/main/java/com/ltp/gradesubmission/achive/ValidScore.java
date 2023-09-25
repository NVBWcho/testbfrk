package com.ltp.gradesubmission.achive;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ScoreValidator.class)

public @interface ValidScore {

    String message() default "The score is not valid";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}