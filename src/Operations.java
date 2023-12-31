public class Operations {

    public static String multiplication(String number1, int count) {
        return number1.repeat(count); // умножение
    }

    public static String division(String number1, int counte) {
        return number1.substring(0, number1.length() / counte); //деление
    }

    public static String getOperator(String number2) throws Exception {
        for (int i = 0; i < number2.length(); i++) {
            char simbol = number2.charAt(i);
            if (simbol == '+' || simbol == '-' || simbol == '*' || simbol == '/') {
                return "" + simbol;
            }
        }
        throw new Exception("Вы ввели не допустимый знак операции");
    }

    public static String summa(String number1, String number2) {
        return number1 + number2; // сложение
    }

    public static String difference(String number1, String number2) {
        return number1.replaceAll(number2, ""); //вычитание
    }
}