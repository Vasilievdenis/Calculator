public class Operations {

    public static String multiplication(String number1, int count) {
        return number1.repeat(count); // умножение
    }

    public static String division(String number1, int counte) {
        return number1.substring(0, number1.length() / counte); //деление
    }

    public static String getOperator(String number2) throws Exception {
        StringBuilder operation = new StringBuilder();
        for (int i = 0; i < number2.length(); i++) {
            char sim = number2.charAt(i);
            if (sim == '+' || sim == '-' || sim == '*' || sim == '/') {
                operation.append(sim);
                return operation.toString();
            }
        }
        throw new Exception("Вы ввели не допустимый знак операции");
    }

    public static String summa(String number1, String number2) {
        return number1 + number2;
    }

    public static String difference(String number1, String number2) {
        return number1.replaceAll(number2, ""); //вычитание
    }
}
