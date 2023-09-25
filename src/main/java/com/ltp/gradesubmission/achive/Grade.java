package com.ltp.gradesubmission.achive;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.util.Date;
import java.util.UUID;

@ValidGrade(message = "Invalid Data")
public class Grade {
    @NotBlank(message = "Name cannot be blank")
    private String name;
    @NotBlank(message = "Subject cannot be blank")
    private String subject;

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    @NotBlank(message = "Score cannot be blank")
    @ValidScore(message = "Invalid Grade. Please enter a valid grade")
    private String score;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @PastOrPresent
    private Date examDate;

    private String id;



    public Grade() {
        this.id=UUID.randomUUID().toString();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
