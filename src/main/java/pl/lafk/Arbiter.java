package pl.lafk;

/**
 * Lower? Higher? How do those numbers compare? Answers those questions allowing to properly hint.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class Arbiter {
    private final int userAnswer;
    private final int randomizedNumber;

    Arbiter(int userAnswer, int randomizedNumber) {
        this.userAnswer = userAnswer;
        this.randomizedNumber = randomizedNumber;
    }

    int compareNumbers() {
        return Integer.compare(userAnswer, randomizedNumber);
    }
}
