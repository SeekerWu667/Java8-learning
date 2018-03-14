package strategy_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class StrategyLambdaTest {
    public static void main(String[] args) {
        Validator numberValidator = new Validator((String s)->s.matches("[a-z]+"));
        boolean b1 = numberValidator.validator("aaaaa");
        Validator lowerCaseValidator = new Validator((String s)->s.matches("\\d+"));
        boolean b2 = lowerCaseValidator.validator("bbb");
        System.out.println(b1+" and "+b2);
    }
}
