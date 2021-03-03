package pl.lafk;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Range for the randomized number, both ends are inclusive.
 * It doesn't matter even if the range is given badly: 5,3 becomes 3,5.
 *
 * @author Tomasz @LAFK_pl Borek
 */
class Range {
    private final int floor;
    private final int ceiling;

    Range(int floor, int ceiling) {
        this.floor = Math.min(floor, ceiling);
        this.ceiling = Math.max(floor, ceiling);
    }

    @Override
    public String toString() {
        return String.format("<%d, %d>", floor, ceiling);
    }

    public int newRandomNumber() {
        return ThreadLocalRandom.current().nextInt(floor, ceiling+1);
    }
}
