package pl.lafk;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Tomasz @LAFK_pl Borek
 */
class UI {
    private final PrintStream out;
    private final Scanner scanner;

    UI(PrintStream out, Scanner scanner) {
        this.out = out;
        this.scanner = scanner;
    }

    void print(String s) {
        out.println(s);
    }

    void print(int i) {
        out.println(i);
    }

    int askFor(String s) {
        print(s);
        return scanner.nextInt();
    }

    void print(Object o) {
        print(o.toString());
    }
}
