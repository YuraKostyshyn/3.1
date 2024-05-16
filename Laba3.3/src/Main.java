//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int start=1;//перший поверх
        int n=11;//поверх що увели ми
        if (n>0 & n<=12){ //чи існує введений поверх

            if(n==start){
                System.out.println("Ви зараз знаходитесь на даному поверсі");
            }
            //Вгору
            if(n>start) {
                if (n == 2) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 3) {
                    System.out.println("Ви піднялись на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви піднялись на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви піднялись на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви піднялись на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви піднялись на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви піднялись на 8 поверх");
                } else if (n == 9) {
                    System.out.println("Ви піднялись на 9 поверх");
                    }else if (n == 10) {
                        System.out.println("Ви піднялись на 10 поверх");
                    } else if (n == 11) {
                        System.out.println("Ви піднялись на 11 поверх");
                    } else if (n == 12) {
                        System.out.println("Ви піднялись на 12 поверх");
                }
            }
            //спуск уже вниз
            if(n<start) {
                if (n == 1) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 2) {
                    System.out.println("Ви спустились на 1 поверх");
                } else if (n == 3) {
                    System.out.println("Ви спустились на 3 поверх");
                } else if (n == 4) {
                    System.out.println("Ви спустились на 4 поверх");
                } else if (n == 5) {
                    System.out.println("Ви спустились на 5 поверх");
                } else if (n == 6) {
                    System.out.println("Ви спустились на 6 поверх");
                } else if (n == 7) {
                    System.out.println("Ви спустились на 7 поверх");
                } else if (n == 8) {
                    System.out.println("Ви спустились на 8 поверх");
                }else if (n == 10) {
                    System.out.println("Ви піднялись на 9 поверх");
                } else if (n == 11) {
                    System.out.println("Ви піднялись на 10 поверх");
                } else if (n == 12) {
                    System.out.println("Ви піднялись на 11 поверх");
                }
            }
        }
        else{
            System.out.println("Ви ввели неіснуючий поверх");
        }
    }
}