package strategy_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Validator numericValidator = new Validator(new IsNumber());
        boolean b1 = numericValidator.validator("aaa");
        Validator lowerCaseValidator = new Validator(new IsAllLowerCase());
        boolean b2 = lowerCaseValidator.validator("bbb");
        System.out.println(b1+" and "+b2);
    }
}
