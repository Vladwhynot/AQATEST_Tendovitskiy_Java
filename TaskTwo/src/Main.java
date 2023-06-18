import java.util.Scanner;

public class Main {

    final static Scanner input = new Scanner(System.in);
    final static String nameConst = "вячеслав";

    public static void main(String[] args) {
         invokeTaskResult();
    }


    public static void invokeTaskResult(){
        print("Введите имя : ");
        String inputName = input.nextLine();
        print(checkInputName(inputName));
    }

    public static String checkInputName(String inputName){
        if (nameConst.equals(inputName.toLowerCase()))
            return Answer.CASE_FIRST.getAnswer();
        else if (inputName.isEmpty())
            return Answer.CASE_THIRD.getAnswer();
        else
            return Answer.CASE_SECOND.getAnswer();
    }

    public static void print(String s){System.out.println(s);}


    enum Answer{
        CASE_FIRST("Привет, Вячеслав"),CASE_SECOND("Нет такого имени"),CASE_THIRD("Пустая строка, повторите попытку");
        private final String answer;
        Answer(String answer) {
            this.answer = answer;
        }
        public String getAnswer(){return answer;}
    }

}