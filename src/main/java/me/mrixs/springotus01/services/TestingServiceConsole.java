package me.mrixs.springotus01.services;

import me.mrixs.springotus01.dao.QuestionDao;
import me.mrixs.springotus01.domain.Question;

import java.util.Scanner;

public class TestingServiceConsole implements TestingService {

    private final QuestionDao questionDao;
    private long result = 0;

    public TestingServiceConsole(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    @Override
    public void start() {
        System.out.print("Username: ");
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();
        System.out.println("Now answer questions");
        for (Question question : questionDao.getQuestions()) {
            System.out.print(question.getQuestion() + " ");
            String answer = input.nextLine();
            if (answer.equals(question.getAnswer())) {
                result++;
            }
        }
        System.out.println(username
                + " gets "
                + getResult()
                + " correct answers for "
                + questionDao.getQuestions().size()
                + " questions.");
    }

    @Override
    public long getResult() {
        return result;
    }
}
