package com.ltp.gradesubmission.achive;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GradeValidator implements ConstraintValidator<ValidGrade, Grade> {

    @Override
    public boolean isValid(Grade grade, ConstraintValidatorContext constraintValidatorContext) {
        if(!grade.getName().equals(grade.getSubject())){
            return true;
        }
        return false;
    }
}
