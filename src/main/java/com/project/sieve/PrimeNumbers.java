package com.project.sieve;

import java.util.Arrays;

class PrimeNumbers {

    private String[] outputPrimeNumbers;
    private StringBuilder primeNumbers = new StringBuilder("2");
    private int counterOfPrimeNumbers = 1;

    public String[] getOutputPrimeNumbers() {
        return outputPrimeNumbers;
    }

    @Override
    public String toString() {
        return "Please enter positive number that is greater the 1: ";
    }

    public void sieveOfEratosthenes(String line) throws NotPrimeNumbersException {

        int limit = prepareLimit(line);

        boolean[] sieve = new boolean[limit + 1];
        Arrays.fill(sieve, true);

        for (int i = 3; i <= limit; i += 2) {
            if (sieve[i]) {
                counterOfPrimeNumbers++;
                primeNumbers.append(" ").append(i);
                int step = i % 2 == 0 ? i : 2 * i;
                for (int k = i * i; k < limit + 1; k += step) {
                    sieve[k] = false;
                }
            }
        }
        outputPrimeNumbers = new String[]{"Your prime numbers: " + primeNumbers.toString(),
                "Quantity primes in your range = " + counterOfPrimeNumbers};
    }

    public void outputPrimeNumbers() {
        for (String line : outputPrimeNumbers) System.out.println(line);
    }

    private int prepareLimit(String s) throws NotPrimeNumbersException {
        int number = Integer.parseInt(s);
        if (number <= 1) {
            throw new NotPrimeNumbersException("You entered a negative number or zero, Try again!!!");
        }
        return number;
    }
}

