import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final static Scanner input = new Scanner(System.in);
    private static int length;
    private static int[] arrayInput;
    private static final ArrayList<Integer> arrayAnswer = new ArrayList<>();

    public static void main(String[] args) {
        invokeTaskResult();
    }

    public static void invokeTaskResult(){
        try {
            inputArray();
            invokeArrayAnswer();
            if (arrayAnswer.size() == 0)
                print(ErrorCases.CASE_SECOND.getAnswer());
            else
                outputArray();
        }
        catch (Exception e){
            print(ErrorCases.CASE_FIRST.getAnswer());
        }

    }


    public static void invokeArrayAnswer(){
        for (int i = 0; i < length; i++){
            if (arrayInput[i] % 3 == 0){
                arrayAnswer.add(arrayInput[i]);
            }
        }
    }

   public static void outputArray(){
        print("Итоговый массив чисел кратных 3 : ");
       for(Integer v : arrayAnswer) {
           System.out.print(v + " ");
       }
   }

    public static void inputArray(){
         print("Введите размер массива: ");
         length = input.nextInt();
         arrayInput = new int[length];
         print("Введите элементы массива");
         for (int i = 0; i < length; i++){
             arrayInput[i] = input.nextInt();
         }
    }

    public static void print(String s){
         System.out.println(s);
    }


    enum ErrorCases{
        CASE_FIRST("Некорректный ввод!"),CASE_SECOND("Нет чисел кратных 3!");
        private final String errorCase;
        ErrorCases(String errorCase) {
            this.errorCase = errorCase;
        }
        public String getAnswer(){return errorCase;}
    }
}
