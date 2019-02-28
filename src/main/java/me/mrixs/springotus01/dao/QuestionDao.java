package me.mrixs.springotus01.dao;

import me.mrixs.springotus01.domain.Question;

import java.util.List;

public interface QuestionDao {

    List<Question> getQuestions();
}
