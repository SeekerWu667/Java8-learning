package strategy_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class Validator {
    private final ValidationStrategy strategy;

    public Validator(ValidationStrategy validationStrategy) {
        this.strategy=validationStrategy;
    }

    public boolean validator(String s) {
        return strategy.execute(s);

    }
}
