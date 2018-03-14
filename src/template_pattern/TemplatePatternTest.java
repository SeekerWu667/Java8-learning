package template_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class TemplatePatternTest {
    public static void main(String[] args) {
        new OnlineBankingByLamdba().processCustomer(133L,(Customer c)-> System.out.println("hello "+c.getName()));
    }
}
