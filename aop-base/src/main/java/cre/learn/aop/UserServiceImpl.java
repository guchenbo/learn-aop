package cre.learn.aop;

/**
 * @Author guchenbo
 * @Date 2019/8/16.
 */
public class UserServiceImpl implements UserService {

    @Override
    public void user() {
        System.out.println("in user");
    }
}
