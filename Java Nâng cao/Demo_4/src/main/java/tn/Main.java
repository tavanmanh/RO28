package tn;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import tn.entity.Student;
import tn.entity.Subject;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Session session = null;
        try {
            session = buildSessionFactory().openSession();
            session.beginTransaction();
            Student student = new Student();
            student.setStudentName("Manh");
            session.save(student);

            Student student1 = new Student();
            student1.setStudentName("Chi");
            session.save(student1);

            List<Student> students = new ArrayList<>();
            students.add(student);
            students.add(student1);

            Subject subject= new Subject();
            subject.setSubjectName("Toan");
            subject.setStudents(students);
            session.save(subject);
            session.getTransaction().commit();


        } finally {
            if (session != null) {
                    session.close();
                }
            }
    }
    private static SessionFactory buildSessionFactory() {
        // load configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);
        configuration.addAnnotatedClass(Subject.class);


        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();

        return configuration.buildSessionFactory(serviceRegistry);
    }
}
