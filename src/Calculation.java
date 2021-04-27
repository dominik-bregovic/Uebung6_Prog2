import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Calculation {

    Scanner scanner = new Scanner(System.in);
    private Random randomNumb = new Random();
    private Integer secondNumb;
    private Integer firstNumb;
    private char operator;
    private Double answer;
    private Double result;



    public double taskAndTime(){

        double startTime = System.currentTimeMillis();
        printTask();
        double endTime = System.currentTimeMillis();
        double durationUnformated = (endTime - startTime)/1000;
        double durationFormated = roundDouble(durationUnformated);

        return durationFormated;
    }
    public void printTask() {
        this.firstNumb = random(101);
        this.secondNumb = random(101);
        this.operator = operator(4);
        System.out.print("Please enter the result of: " + firstNumb + " " + operator + " " + secondNumb + " = ");
        scanNumber();
    }
    public void scanNumber(){

        try {
            String input = scanner.nextLine();
            Double isDouble = Double.parseDouble(input);
            this.answer = isDouble;
        }catch(NumberFormatException e){
            System.out.print("Please enter a valid result!\n" +
                    "Reslut of: " + this.firstNumb + " " + operator + " " +  + this.secondNumb + " = ");
            scanNumber();
        }

    }

    public void calc(){

        if (operator == '/'){
            double division = (double)firstNumb / secondNumb;
            this.result = roundDouble(division);
        }else if (operator == '*'){
            this.result = (double)firstNumb * secondNumb;
        }else if (operator == '-'){
           this.result = (double)firstNumb - secondNumb;
        }else if (operator == '+'){
            this.result = (double)firstNumb + secondNumb;
        }else {
            System.out.println("Something went wrong");
        }

    }

    public Integer random(int bound){
        Integer r = randomNumb.nextInt(bound);
        return r;
    }

    public char operator(int randomOp){
        int r = randomNumb.nextInt(randomOp);
        List<Character> op = new ArrayList<>();
        op.add('/');
        op.add('*');
        op.add('-');
        op.add('+');
        return op.get(r);
    }

    public double roundDouble(double division){
        division = division*100;
        int cutNumb = (int)division;
        division = (double)cutNumb/100;

        return division;
    }


    public double getResult() {
        return result;
    }

    public Double getAnswer() {
        return answer;
    }

    public Integer getSecondNumb() {
        return secondNumb;
    }

    public Integer getFirstNumb() {
        return firstNumb;
    }

    public char getOperator() {
        return operator;
    }

}
