package com.kids.api.quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    QuizDao qDao;

    @Override
    public List<Quiz> quizList() {
        return qDao.getQuizList();
    }

    @Override
    public Quiz reference(int quizNo) {
        return qDao.selectQuiz(quizNo);
    }

    @Override
    public int create(Quiz quiz) {
        return qDao.createQuiz(quiz);
    }

    @Override
    public int update(Quiz quiz) {
        return qDao.updateQuiz(quiz);
    }

    @Override
    public int delete(int quizNo) {
        return qDao.deleteQuiz(quizNo);
    }

}
