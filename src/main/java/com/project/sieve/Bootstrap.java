package com.project.sieve;

public class Bootstrap {

    public static void main(String[] args) {
        boolean relay = true;
        while (relay) {
            ConsoleUtil.greetingUser();
            try {
                if (!ConsoleReader.readString().equalsIgnoreCase(AnswerEnum.EXIT.toString())) {
                    ConsoleUtil.bye();
                    System.exit(1);
                }
                PrimeNumbers sieve = new PrimeNumbers();
                System.out.println(sieve);
                sieve.sieveOfEratosthenes(ConsoleReader.readString());
                ConsoleUtil.readOrWrite();
                AnswerEnum answerEnum = AnswerEnum.valueOf(ConsoleReader.readString());
                UsersAnswer.answer(sieve,answerEnum);
                relay = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }


}

