package org.com.projectOne;

import java.util.Scanner;

public class QuizService {
    Questions questions[] = new Questions[5];

    public QuizService() {

        questions[0] = new Questions(1,"Size of int","2","8","4","6","4");
        questions[1] = new Questions(2,"Size of double","2","8","4","6","8");
        questions[2] = new Questions(3,"Size of char","2","8","4","6","2");
        questions[3] = new Questions(4,"Size of long","2","8","4","6","8");
        questions[4] = new Questions(5,"Size of boolean","2","8","4","1","1");


    }

    public  void playQuiz(){

        for(Questions q : questions){

            System.out.println(q.getTitle());

            Scanner scanner = new Scanner(System.in);

            boolean answer = Boolean.parseBoolean(q.getAnswer(scanner.nextLine()));

            if(answer)
                System.out.println("Your answer is correct");
            else System.out.println("Your'e wrong");
        }
    }
}
