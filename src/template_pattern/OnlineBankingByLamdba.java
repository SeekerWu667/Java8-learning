package template_pattern;

import java.util.function.Consumer;

/**
 * 通过lambda来实现模板模式，既通过lamdba表达式或者方法引用来传递不同的实现，而不是继承原有的父类
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class OnlineBankingByLamdba {
    public void processCustomer(long id, Consumer<Customer> makeCustomerHappy) {
        Customer c = new Customer();
        c.setId(id);
        c.setName("TOM");
        makeCustomerHappy.accept(c);
    }
}
