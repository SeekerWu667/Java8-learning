package strategy_pattern;

/**
 * 策略模式代表了一类算法的通用解决方案，你可以在运行时选择使用哪种方案
 * 策略模式包含三部分内容：
 * 一个代表某个算法的接口
 * 一个或多个该接口的具体实现，它们代表了算法的多种实现
 * 一个或多个使用策略对象的客户
 * 具体架构如图strategy_pattern.png
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
