import java.security.SecureRandom;
import java.util.Scanner;

public class blanco_p1 {

    public static double question1(int type){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(10);
        int rand2 = rand.nextInt(10);
        double correct = 0;
        boolean type5 = true;
        while(type5) {
            switch (type) {
                case 1:
                    correct = rand1 + rand2;
                    System.out.println("What is " + rand1 + " + " + rand2 + "?");
                    type5 = false;
                    break;
                case 2:
                    correct = rand1 * rand2;
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    type5 = false;
                    break;
                case 3:
                    correct = rand1 - rand2;
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    type5 = false;
                    break;
                case 4:
                    correct = rand1 / (rand2 + 0.0);
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    type5 = false;
                    break;
                case 5:
                    type = rand.nextInt(4) + 1;
                    break;
            }
        }
        return correct;
    }
    public static double question2(int type){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(100);
        int rand2 = rand.nextInt(100);
        double correct = 0;
        boolean type5 = true;
        while(type5) {
            switch (type) {
                case 1:
                    correct = rand1 + rand2;
                    System.out.println("What is " + rand1 + " + " + rand2 + "?");
                    type5 = false;
                    break;
                case 2:
                    correct = rand1 * rand2;
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    type5 = false;
                    break;
                case 3:
                    correct = rand1 - rand2;
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    type5 = false;
                    break;
                case 4:
                    correct = rand1 / (rand2+0.0);
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    type5 = false;
                    break;
                case 5:
                    type = rand.nextInt(4) + 1;
                    break;
            }
        }
        return correct;
    }
    public static double question3(int type){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(1000);
        int rand2 = rand.nextInt(1000);
        double correct = 0;
        boolean type5 = true;
        while(type5) {
            switch (type) {
                case 1:
                    correct = rand1 + rand2;
                    System.out.println("What is " + rand1 + " + " + rand2 + "?");
                    type5 = false;
                    break;
                case 2:
                    correct = rand1 * rand2;
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    type5 = false;
                    break;
                case 3:
                    correct = rand1 - rand2;
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    type5 = false;
                    break;
                case 4:
                    correct = rand1 / (rand2+0.0); //to account for division by 0 error
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    type5 = false;
                    break;
                case 5:
                    type = rand.nextInt(4) + 1;
                    break;
            }
        }
        return correct;
    }
    public static double question4(int type){
        SecureRandom rand = new SecureRandom();
        int rand1 = rand.nextInt(10000);
        int rand2 = rand.nextInt(10000);
        double correct = 0;
        boolean type5 = true;
        while(type5) {
            switch (type) {
                case 1:
                    correct = rand1 + rand2;
                    System.out.println("What is " + rand1 + " + " + rand2 + "?");
                    type5 = false;
                    break;
                case 2:
                    correct = rand1 * rand2;
                    System.out.println("What is " + rand1 + " * " + rand2 + "?");
                    type5 = false;
                    break;
                case 3:
                    correct = rand1 - rand2;
                    System.out.println("What is " + rand1 + " - " + rand2 + "?");
                    type5 = false;
                    break;
                case 4:
                    correct = rand1 / (rand2+0.0); //to account for division by 0 error
                    System.out.println("What is " + rand1 + " / " + rand2 + "?");
                    type5 = false;
                    break;
                case 5:
                    type = rand.nextInt(4) + 1;
                    break;
            }
        }
        return correct;
    }

    public static void correctResponse(){
        SecureRandom rand = new SecureRandom();
        int num = rand.nextInt(4);
        switch (num){
            case 0:
                System.out.println("Very good!");
                break;
            case 1:
                System.out.println("Amazing!");
                break;
            case 2:
                System.out.println("Great job!");
                break;
            case 3:
                System.out.println("Keep it up!");
                break;
        }
    }
    public static void wrongResponse(){
        SecureRandom rand = new SecureRandom();
        int num = rand.nextInt(4);
        switch (num){
            case 0:
                System.out.println("Try again.");
                break;
            case 1:
                System.out.println("Wrong, try again.");
                break;
            case 2:
                System.out.println("Keep trying.");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
        }
    }

    public static int levelChoice(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter difficulty level(1 - 4): ");
        int level = scnr.nextInt();
        while(level <= 0 || level > 4) {
            System.out.println("Please enter 1, 2, 3, or 4: ");
            level = scnr.nextInt();
        }
        return level;
    }

    public static int problemType(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Arithmetic Type:\n1.Addition  2.Multiplication  3.Subtraction  4.Division  5.Random Mix");
        int type = scnr.nextInt();
        return type;
    }

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        char bye = 'y'; //used for exit
        do{
            int level = levelChoice();
            int type = problemType();

            double[] correct = new double[10];
            double[] answer = new double[10];
            int totalRight = 0;
            int i;

            switch(level){
                case 1:
                    i = 0;
                    while(i < 10){
                        System.out.print((i + 1) + ": ");
                        correct[i] = question1(type);
                        answer[i] = scnr.nextDouble();

                        if (answer[i] == correct[i]) {
                            correctResponse();
                            totalRight++;
                        }
                        else{
                            wrongResponse();
                        }
                        i++;
                    }
                    break;
                case 2:
                    i = 0;
                    while(i < 10){
                        System.out.print((i + 1) + ": ");
                        correct[i] = question2(type);
                        answer[i] = scnr.nextDouble();

                        if (answer[i] == correct[i]) {
                            correctResponse();
                            totalRight++;
                        }
                        else{
                            wrongResponse();
                        }
                        i++;
                    }
                    break;
                case 3:
                    i = 0;
                    while(i < 10){
                        System.out.print((i + 1) + ": ");
                        correct[i] = question3(type);
                        answer[i] = scnr.nextDouble();

                        if (answer[i] == correct[i]) {
                            correctResponse();
                            totalRight++;
                        }
                        else{
                            wrongResponse();
                        }
                        i++;
                    }
                    break;
                case 4:
                    i = 0;
                    while(i < 10){
                        System.out.print((i + 1) + ": ");
                        correct[i] = question4(type);
                        answer[i] = scnr.nextDouble();

                        if (answer[i] == correct[i]) {
                            correctResponse();
                            totalRight++;
                        }
                        else{
                            wrongResponse();
                        }
                        i++;
                    }
                    break;
            }//end switch

            int percentage = totalRight * 10;
            System.out.println("Correct:" + totalRight + "  Wrong:" + (10-totalRight));
            if(percentage < 75){
                System.out.println("Did not pass. Please ask your teacher for extra help.\n");
            }
            else{
                System.out.println("Congrats, you are ready to move to the next level!\n");
            }

            System.out.println("Start another session? [y/n]");
            bye = scnr.next().charAt(0);

        }while(bye != 'n');
        System.out.println("Goodbye!");

    }//end main
}
