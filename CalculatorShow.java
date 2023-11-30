import java.util.Scanner;

public class CalculatorShow {
    private Scanner scanner;

    public CalculatorShow(){
        scanner=new Scanner(System.in);
    }
    public String enterOperation(){
        System.out.println("Введите операцию(+,-,*,/): ");
        return scanner.nextLine();
    }
    public int enterOperand(){
        System.out.println("Введите число: ");
        return Integer.parseInt(scanner.nextLine());

    }
    public void showResult(double result){
        System.out.println("Результат: ");
        System.out.printf("%.3f", result);
    }
}
