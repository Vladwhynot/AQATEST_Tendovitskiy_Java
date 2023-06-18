import java.util.Scanner;

public class Main {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        try {
          invokeTaskResult();
        }
        catch (Exception e){
            print(Answer.CASE_FOURTH.getAnswer());
        }
    }

    public static void invokeTaskResult(){
        print("Введите число : ");
        int num =  input.nextInt();
        print(checkNumber(num));
    }

    public static void print(String s){
        System.out.println(s);
    }


    public static String checkNumber( int number){
       if (number > 7)
           return Answer.CASE_FIRST.getAnswer();
       else if(number < 7)
           return Answer.CASE_SECOND.getAnswer();
       else
           return Answer.CASE_THIRD.getAnswer();
    }
}


enum Answer{
    CASE_FIRST("Привет"),CASE_SECOND("Значение меньше 7"),CASE_THIRD("Значение равно 7"),CASE_FOURTH("Не верный формат введенных данных");
    private final String answer;
    Answer(String answer) {
        this.answer = answer;
    }
    public String getAnswer(){return answer;}
}