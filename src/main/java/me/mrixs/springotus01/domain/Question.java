package me.mrixs.springotus01.domain;

import com.opencsv.bean.CsvBindByName;

public class Question {

    @CsvBindByName(column = "question")
    private String question;

    @CsvBindByName(column = "answer")
    private String answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
