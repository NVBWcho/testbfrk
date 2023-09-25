package com.ltp.gradesubmission.achive;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ScoreValidator implements ConstraintValidator<ValidScore, String> {
    List<String> validScore=Arrays.asList("A","B","C","D","E","F");

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(validScore.contains(s)){
            return true;
        }
        return false;
    }
}
