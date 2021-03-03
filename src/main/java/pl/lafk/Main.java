package pl.lafk;

import java.util.Scanner;

/**
 * Starts the game
 *
 * @author Tomasz @LAFK_pl Borek
 */
class Main {
    //TODO: obsługa błędów w podawaniu inta - co jak podam e?
    // TODO: int - pozbądź się, zastąp własnym typem RangedNumber
    // TODO: co jak ktoś walnie negatyw w przedziale?
    public static void main(String[] args) {
        final Range range = new Range(1, 10);
        final UI ui = new UI(System.out, new Scanner(System.in));
        ui.print("Witaj w zgaduli, rozlosowuję Ci liczbę z przedziału " + range);
        var randomizedNumber = range.newRandomNumber();
        Result result = null;
        do {
            ui.print(randomizedNumber);
            final int userAnswer = ui.askFor("To wybieraj liczbę z przedziału " + range);
            result = ResultFactory.createResultBasedOn(new Arbiter(userAnswer, randomizedNumber).compareNumbers());
            ui.print(result);
        } while (!(result instanceof GoodResult));
    }
}
