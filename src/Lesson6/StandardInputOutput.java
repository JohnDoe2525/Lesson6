package Lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StandardInputOutput {

    public static void main(String[] args) {
        try {
            BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("何かの文字を入力してください =>");

            String str = key.readLine();

            System.out.println("入力された文字列は「" + str + "」です。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
