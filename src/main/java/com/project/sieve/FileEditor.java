package com.project.sieve;


import java.io.*;
import java.util.ArrayList;

public class FileEditor {
    public static String setNameForTextFile(String name) throws WrongNameFileException {
        System.out.println("Enter name(only letters) for your file where I record the result : ");
        for (char letter : name.toCharArray()) {
            if (!Character.isLetter(letter)) {
                throw new WrongNameFileException("You must enter only letters for name!Try again");
            }
        }
        return name + ".txt";
    }

    public static File createFile(String name) throws IOException {
        File file = new File(name);
        if (!file.createNewFile()) throw new IOException("File not created successfully!");

        return file;
    }

    public static File writeTextFile(File file, String[] text) throws IOException {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsoluteFile()));
            for (String s : text) {
                bufferedWriter.write(s + "\n");
            }
            bufferedWriter.close();
            System.out.println("\nYou file was written successful!\nPath for your file: " + file.getAbsolutePath());
        } catch (IOException e) {
            throw new IOException("I can not write the file!");
        }
        return file;
    }

    public static ArrayList<String> readFile(File file) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            ArrayList<String> text = new ArrayList<>();
            String textLine;
            while ((textLine = bufferedReader.readLine()) != null) {
                text.add(textLine);
            }
            return text;
        } catch (IOException e) {
            throw new IOException("I can not read the file!");
        }
    }
}



