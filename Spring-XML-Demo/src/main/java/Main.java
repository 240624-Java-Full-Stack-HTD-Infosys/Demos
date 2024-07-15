import com.revature.ApplicationContextManager;
import com.revature.models.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("Beans.xml");
        //this line was moved into the application context manager class
        ApplicationContext ac = ApplicationContextManager.getApplicationContext();




        HelloWorld obj = (HelloWorld) ac.getBean("helloWorld");
        System.out.println(obj.getMessage());

//
//        Animal animal1 = (Animal) ac.getBean("animal1");
//        System.out.println(animal1);
//
//        Animal animal2 = (Animal) ac.getBean("animal2");
//        System.out.println(animal2);
//
//        Owner owner = (Owner) ac.getBean("owner");
//        System.out.println(owner);
//
//        Owner owner2 = (Owner) ac.getBean("owner2");
//        System.out.println(owner2);
//
//        List<String> animalTypes = (ArrayList) ac.getBean("animals");
//        System.out.println(animalTypes);
    }
}
