package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
    public int input() {
        try (
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))
        ) {
            String str = bufferedReader.readLine();
            bufferedReader.close();
            return Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}