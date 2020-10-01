import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Please enter a maximum number: ");

        var n = scanner.nextInt();
        System.out.printf("Calculating the prime numbers between 2 and %d\n", n);

        var sieve = new SieveOfEratosthenes(n);
        sieve.CalculatePrimeNumbers();
    }
}

public class SieveOfEratosthenes {

    private final List<Number> numbers;

    public SieveOfEratosthenes(int n) {
        if (n < 2) {
            throw new IllegalArgumentException("n cannot be lower than 2");
        }

        numbers = new ArrayList<>(n - 1);
        for (var i = 2; i <= n; i++)
            numbers.add(new Number(i));
    }

    public void CalculatePrimeNumbers() {
        for (var i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).isChecked())
                continue;

            var number = numbers.get(i).getNumber();

            for (var n : numbers) {
                if (n.getNumber() == number || n.isChecked())
                    continue;

                if (n.getNumber() % number == 0)
                    n.setChecked(true);
            }
        }

        for (var primeNumber : numbers) {
            if (!primeNumber.isChecked())
                System.out.println(primeNumber.getNumber());
        }
    }

    private class Number {
        private final int number;
        private boolean checked;

        public Number(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }
    }
}