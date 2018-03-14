package strategy_pattern;

/**
 * @author xueqin
 * @Description: Modified By:
 * Created by xueqin on 18/3/14.
 */
public class IsAllLowerCase implements ValidationStrategy{


    @Override
    public boolean execute(String s) {
        return s.matches("[a-z]+");
    }
}
