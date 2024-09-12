import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstBeanCat = (Cat) applicationContext.getBean("Cat");
        Cat secondBeanCat = (Cat) applicationContext.getBean("Cat");

        System.out.println(firstBean.getMessage());
        System.out.println(secondBean.getMessage());
        System.out.println(firstBeanCat.getName());
        System.out.println(secondBeanCat.getName());
        System.out.println(firstBean.equals(secondBean));
        System.out.println(firstBeanCat.equals(secondBeanCat));
    }
}

