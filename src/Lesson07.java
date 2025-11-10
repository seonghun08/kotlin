import org.jetbrains.annotations.NotNull;
import sample.JavaFilePrinter;

import java.io.IOException;

public class Lesson07 {

    public static void main(
            String[] args
    ) throws IOException {
        JavaFilePrinter printer = new JavaFilePrinter();
        printer.readFile();
    }

    public int parseIntOrThrow(
            @NotNull String str
    ) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                    String.format("주어진 %s(은)는 숫자가 아닙니다.", str));
        }
    }

    public Integer parseIntOrNull(
            @NotNull String str
    ) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
