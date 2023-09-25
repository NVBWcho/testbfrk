package com.ltp.gradesubmission.repository;

import com.ltp.gradesubmission.achive.CustomConstants;
import com.ltp.gradesubmission.achive.Grade;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class GradeRepository {
    private List<Grade> studentGrades=new ArrayList<>();

    List<String> subjects= Arrays.asList("Potoins","Math","Quidditch");

    public List<Grade> getGrades(){
        return studentGrades;
    }

    public List<String> getSubjects(){
        return subjects;
    }

    public void addGrade(Grade grade){
        studentGrades.add(grade);
    }

    public void updateGrade(int index,Grade grade){
        studentGrades.set(index,grade);

    }

    public Grade getGrade(int index){
        return studentGrades.get(index);
    }

    public int getGradeIndex(String ID){

        for(int i=0;i< studentGrades.size();i++) {

            if (studentGrades.get(i).getId().equals(ID)) {
                return i;
            }


        }
        return CustomConstants.NOT_FOUND;


    }







}
