package template_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 * 模板方法：如果你需要采用某个算法的框架，同时又希望有一定的灵活度，能对它的某些部分进行改进
 * 那么采用模板方法涉及模式是比较通用的方案。模板方法模式在你“希望使用这个算法，但是需要对其中的某些行为进行
 * 改进，才能达到你希望的效果”
 */
public class TemplatePatternTest {
    public static void main(String[] args) {
        new OnlineBankingByLamdba().processCustomer(133L,(Customer c)-> System.out.println("hello "+c.getName()));
    }
}
