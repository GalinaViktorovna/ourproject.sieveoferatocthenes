package com.project.sieve;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class UsersAnswer {
    public static void answer(PrimeNumbers sieve, AnswerEnum answerEnum) throws WrongNameFileException, IOException {
        switch (answerEnum) {
            case YES:
                String filesName = FileEditor.setNameForTextFile(ConsoleReader.readString());
                File file = FileEditor.createFile(filesName);
                FileEditor.writeTextFile(file, sieve.getOutputPrimeNumbers());
                ArrayList<String> textFromFile = FileEditor.readFile(file);
                textFromFile.stream().forEach(String -> System.out.println());
                ConsoleUtil.bye();
                break;
            case NO:
                sieve.outputPrimeNumbers();
                ConsoleUtil.bye();
                break;
            case EXIT:
                ConsoleUtil.bye();
                System.exit(1);
        }
    }
}
