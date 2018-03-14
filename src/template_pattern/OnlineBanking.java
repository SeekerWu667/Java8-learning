package template_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
abstract class OnlineBanking {


    /**
     * 搭建了在线银行算法的框架：通过客户id获取客户信息，然后提供服务使得客户满意
     * @param id 客户id
     */
    public void processCustomer(long id) {
        //通过id获取用户信息
        Customer c = new Customer();
        c.setId(id);
        makeCustomerHappy(c);
    }

    /**
     * 具体的使不同客户满意的不同方案，不同的支行可以通过继承OnlineBanking类，对该
     * 方法提供差异化实现
     * @param customer 要使其开心的客户
     */
    abstract void makeCustomerHappy(Customer customer);
}
