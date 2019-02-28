package me.mrixs.springotus01.dao;


import com.opencsv.bean.CsvToBeanBuilder;
import me.mrixs.springotus01.domain.Question;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionDaoCsv implements QuestionDao {

    private List<Question> questions = new ArrayList<>();

    public QuestionDaoCsv(String questionsFilename) {
        ClassLoader classLoader = getClass().getClassLoader();
        File questionsFile = new File(classLoader.getResource(questionsFilename).getFile());
        try {
            questions = new CsvToBeanBuilder<Question>(new FileReader(questionsFile))
                    .withType(Question.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Question> getQuestions() {
        return questions;
    }
}
