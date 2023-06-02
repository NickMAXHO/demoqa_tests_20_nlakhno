import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите int 1");
        int num1 = sc.nextInt();

        System.out.println("Введите int 2");
        int num2 = sc.nextInt();

        System.out.println("Введите для разнообразия double");
        double double1 = sc.nextDouble();



        System.out.println("Сложение int: " + intSum(num1, num2));
        System.out.println("Вычитание int: " + intSubstract(num1, num2));
        System.out.println("Умножение int: " + intMultiply(num1, num2));
        System.out.println("Деление int: " + intDivision(num1, num2));
        System.out.println("Остаток от деления: " + intDivisionRevision(num1, num2));
        System.out.println("Int может и выйти за пределы, как вам такое: " + intMultiply(15000000, 15000000));


        System.out.println("Сложение int1 и double: " + doublePlusInt(num1, double1));
        System.out.println("Вычитание int1 из double: " + intDoubleSubstraction(num1, double1));
        System.out.println("И для разнообразия проведём сравнение: " + compare(num1, num2));

        System.out.println("Тернарный оператор не хотите ли?" +
                "Если тернарный, то введите 1, если отказываетесь то 2");

        int choiceValue1 = sc.nextInt();


        System.out.println("Ну что ж, сами просили: " + choiceTernaryMethod(choiceValue1));

        System.out.println("А может switchcase??" +
                "Если да, то введите 1, если отказываетесь то 2");
        int choiceValue2 = sc.nextInt();
        sc.close();


        System.out.println("Результат налицо, у вас: " + switchCase(choiceValue2));

    }

    public static int intSum(int num1, int num2){
        return num1 + num2;
    }

    public static int intSubstract(int num1, int num2){
        return num1 - num2;
    }

    public static int intMultiply(int num1, int num2){
        return num1 * num2;
    }

    public static int intDivision(int num1, int num2){
        return num1 / num2;
    }

    public static int intDivisionRevision(int num1, int num2){
        return num1 % num2;
    }

    public static double doublePlusInt(int num1, double double1){
        return double1 + num1;
    }

    public static double intDoubleSubstraction(int num1, double double1){
        return double1 - num1;
    }

    public static String compare(int num1, int num2){
        if (num1 > num2){
            return ("А " + num1 + " больше, чем " + num2);
        } else {
            return ("А " + num1 + " меньше, чем " + num2);
        }
    }

    public static String choiceTernaryMethod(int choiceValue1){
        return choiceValue1 == 1 ? "Вот вам и тернарный оператор!" : "Вы ход";
    }


    public static String switchCase(int choiceValue2){
        String result = null;

        switch (choiceValue2) {
            case 1:
                result =  "Да, тут используется switch case";

            case 2:
                result = "Нет, выходим отсюда";

            break;
            default:
                result = "Выходим отсюда";
        }
        return result;
    }
}
