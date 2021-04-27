

public class Participation {

    private Calculation calculate = new Calculation();
    private static int countTasks = 1;
    private static int countRightAnswer;
    private double duration;
    private static double averageDuration;



    public Participation(){

        setDuration(calculate.taskAndTime());
        averageDuration = duration+averageDuration;
        calculate.calc();

    }

    public String toString() {
        return "Calculation " + countTasks + ":\n  " +
                calculate.getFirstNumb()+ " " + calculate.getOperator() + " " + calculate.getSecondNumb() + " = " + calculate.getResult() + "\n  " +
                "Correct: "+ wrightAnswer() + "\n  " +
                "Time needed " + String.format("%.2f", duration) + " sec\n" +
                average() +
                congrats();
    }

    public boolean wrightAnswer(){
        boolean correct;
        Double result = calculate.getResult();
        Double answer = calculate.getAnswer();
        if (result.compareTo(answer) == 0) {
            correct = true;
            countRightAnswer++;
        }else {
            correct = false;
        }
        countTasks++;
        return correct;
    }

    public String average(){
        String averageTime = "\n" + "Average time needed: " +  averageFormater(averageDuration) + " sec\n";

        if (countTasks == 6){
            return averageTime;
        }
        return "";
    }


    public double averageFormater(double average){
        average = calculate.roundDouble(averageDuration/(countTasks-1));
        return average;
    }

    public String congrats(){
        String congratulation = "Congratulation - you answered all questions correctly!";
        if (countRightAnswer == 4) {
            return congratulation;
        }
        return "";
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    
}
