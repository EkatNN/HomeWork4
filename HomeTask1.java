import java.util.Scanner;

    public class HomeTask1 {
        public void midNumber(double end, double begining) {
            Scanner in = new Scanner(System.in);

            int summ = 0;
            double result = 0;
            double diff = end - begining + 1;

            for (double counter = begining; counter <= end; counter++) {
                summ += counter;
                result = summ / diff;
            }
            System.out.println("Сумма всех значений = " + summ);
            System.out.println("Среднеарифметическое значение промежутка = " + result);

        }
    }
