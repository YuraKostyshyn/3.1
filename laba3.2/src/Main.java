//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 2:");
            int n = 531;
            if (n>99 & n<=999) {
            int number1 = n / 100;
            int number2 = (n % 100) / 10;
            int number3 = n % 10;

            if (number1 >= number2 & number1 >= number3) {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + number1);
            } else if (number2 >= number1 & number2 >= number3) {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + number2);
            } else {
                System.out.println("Найбільша цифра числа" + n + " дорівнює:" + number3);
            }
            }else{
            System.out.println("Введене вами число: "+n+" не є тризначним");
        }
      }
}