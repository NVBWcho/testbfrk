package com.ltp.gradesubmission.service;

import com.ltp.gradesubmission.achive.CustomConstants;
import com.ltp.gradesubmission.achive.Grade;
import com.ltp.gradesubmission.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeService {
    @Autowired
    GradeRepository repository;


    public List<Grade> getGrades(){
        return repository.getGrades();
    }

    public List<String> getSubjects(){
        return repository.getSubjects();
    }

    public void addGrade(Grade grade){
        repository.addGrade(grade);
    }

    public void updateGrade(int index,Grade grade){
        repository.updateGrade(index,grade);

    }

    public Grade getGrade(int index){
        return repository.getGrade(index);
    }

    public int getGradeIndex(String ID){

        for(int i=0;i< repository.getGrades().size();i++) {

            if (repository.getGrade(i).getId().equals(ID)) {
                return i;
            }


        }
        return CustomConstants.NOT_FOUND;


    }

    public Grade getGradeById(String id) {
        int index = getGradeIndex(id);
        return index == CustomConstants.NOT_FOUND ? new Grade() : getGrade(index);
    }

    public void submitGrade(Grade grade) {
        int index = getGradeIndex(grade.getId());
        if (index == CustomConstants.NOT_FOUND) {
            addGrade(grade);
        } else {
            updateGrade(index,grade);
        }
    }

}
