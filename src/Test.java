import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("spring-config.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Student student = (Student)factory.getBean("studentbean");
        Employee employee = (Employee)factory.getBean("employeebean");
        Question question = (Question)factory.getBean("questionbean");
        student.displayInfo();
        employee.show();
        question.displayInfo();
    }
}
