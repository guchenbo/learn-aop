package cre.learn.aop.spring1_x;

import cre.learn.aop.UserService;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * spring 1.x 的示例，这里演示spring 1.x的aop配置方式
 *
 * @Author guchenbo
 * @Date 2019/8/16.
 */
public class App {

    public static void main(String[] args) {
        // spring 1.x 只有BeanFactory
        String path = "application.xml";
        ClassPathResource resource = new ClassPathResource(path);
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        UserService userService = (UserService) xmlBeanFactory.getBean("userService");
        userService.user();

        UserService userService2 = (UserService) xmlBeanFactory.getBean("userServiceProxy");
        userService2.user();
    }
}
