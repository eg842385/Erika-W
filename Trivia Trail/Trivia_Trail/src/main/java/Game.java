package Trivia_Trail.src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static final String MAIN_MENU_OPTION_ADD_QUESTION = "Add a Question";
    private static final String MAIN_MENU_OPTION_PLAY_GAME = "Select Trivia Category";
    private static final String MAIN_MENU_OPTION_EXIT = "Exit";
    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_ADD_QUESTION, MAIN_MENU_OPTION_PLAY_GAME, MAIN_MENU_OPTION_EXIT};
    private Scanner scan = new Scanner(System.in);

    public void welcomeMessage(){
        System.out.println("********************************");
        System.out.println("********************************");
        System.out.println("*** Welcome to Trivia Quest! ***");
        System.out.println("********************************");
        System.out.println("********************************");
    }

    public void printMainMenu(){

        for(int i = 0; i < MAIN_MENU_OPTIONS.length; i++){

            System.out.println((i+1) + ") " + MAIN_MENU_OPTIONS[i]);
        }
        System.out.print("\nPlease choose an option >>> ");
    }

    public void run() {

        boolean isRunning = true;
        System.out.println();
        welcomeMessage();
        System.out.println();

        while (isRunning) {

            printMainMenu();

            System.out.println();

            String userInput = scan.nextLine();

            if (userInput.equals("1")) {

//            add question method

            } else if (userInput.equals("2")) {

//            show submenu to choose which category
                displayQuestions();

            } else if (userInput.equals("3")) {

                isRunning = false;

            }
        }
    }

    public void displayQuestions(){

        int numberCorrect = 0;

        List<Genetics> triviaQuestions = Genetics.questionSet();

//        show questions from questionSet
        for (int question = 0; question < triviaQuestions.size(); question++){

            System.out.println();
            System.out.println(triviaQuestions.get(question).getQuestion());
            int numChoices = triviaQuestions.get(question).getChoices().size();

//            show choices from questions in questionSet
            for(int choice = 0; choice < numChoices; choice++){
                System.out.println((choice +  1) + ") " + triviaQuestions.get(question).getChoices().get(choice));
            }

            System.out.print("\nYour Answer: ");

            int userAnswer = scan.nextInt();
            ArrayList<String> choiceSet = triviaQuestions.get(question).getChoices();
            String correctAnswer = triviaQuestions.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);

            if(userAnswer == (correctAnswerIndex + 1)) {
                numberCorrect++;
            }
        }

        System.out.println("You got %" + (numberCorrect/triviaQuestions.size())*100 + " correct!");
        System.out.println("Thanks for playing!");

    }

}
