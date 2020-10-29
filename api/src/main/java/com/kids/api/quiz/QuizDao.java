package com.kids.api.quiz;

import java.util.List;

public interface QuizDao {
    List<Quiz> getQuizList();

    Quiz selectQuiz(int quizNo);

    int createQuiz(Quiz quiz);

    int updateQuiz(Quiz quiz);

    int deleteQuiz(int quizNo);

    TodayQuiz getTodayQuiz();

    int createTodayQuiz(TodayQuiz newQuiz);
}
