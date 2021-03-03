package pl.lafk;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Tomasz @LAFK_pl Borek
 */
class ResultFactory {
    public static Result createResultBasedOn(int fromArbiter) {
        Map<Integer, Result> answers = new HashMap<>();
        answers.put(0, new GoodResult());
        answers.put(-1, new TooLowResult());
        answers.put(1, new TooHighResult());
        return answers.get(fromArbiter);
    }
}
