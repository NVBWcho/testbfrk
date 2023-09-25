package com.ltp.gradesubmission.achive;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GradeValidator.class)
public @interface ValidGrade {
    String message() default "Invalid Data";
    //boilerplate parameters.
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
