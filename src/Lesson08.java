import sample.JavaPerson;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Lesson08 {

    public static void main(String[] args) {
        JavaPerson person = new JavaPerson("hun", -1);
    }

    public void repeat(String s, int n, boolean useNewLine) {
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out))) {
            for (int i = 0; i < n; i++) {
                bw.write(s);
                if (useNewLine) {
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void repeat(String s, int n) {
        repeat(s, n, true);
    }

    public void repeat(String s) {
        repeat(s, 3, true);
    }

    public void printAll(String... strings) {
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out))) {
            for (String s : strings) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
