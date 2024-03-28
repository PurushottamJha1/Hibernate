package HibernateCrudOperations.Crud;
import  HibernateCrudOperations.Crud.Entity.InformationTechnologyDepartment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App
{
    public static void main( String[] args )
    {

        System.out.println( "CRUD Application on Information Technology Department" );
        InformationTechnologyDepartment student1 = new InformationTechnologyDepartment();
        student1.setStudent_Name("Purushottam Jha");
       student1.setStudent_Email("Purushottam@gmail.com");
        InformationTechnologyDepartment student2 = new InformationTechnologyDepartment();
        student2.setStudent_Name("Raj Kumar");
        student2.setStudent_Email("Raj@gmail.com");
        System.out.println("Creating the sessions\n");
        SessionFactory sessionFactory = Utility.getSessionFactory();
        System.out.println("\nSuccessfully created sessions\n");
         Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(student1);
        session.persist(student2);

        session.getTransaction().commit();

        System.out.println("The commited data of IT department ");
        session.createQuery("from InformationTechnologyDepartment", InformationTechnologyDepartment.class).list().forEach(System.out::println);
        session.close();

        System.out.println("\nStarting Second session  ");
        Session session2 = sessionFactory.openSession();
        session2.beginTransaction();


        //read
        InformationTechnologyDepartment studentDetails = session2.get(InformationTechnologyDepartment.class, 1L);
    

        //update
        studentDetails.setStudent_Email("PurushottamJha@gmail.com");
        session2.merge(studentDetails);
 
        System.out.println("\nUpdated Emai-id");
        session2.createQuery("from InformationTechnologyDepartment", InformationTechnologyDepartment.class).list().forEach(System.out::println);

        //delete
        InformationTechnologyDepartment emp = session2.get(InformationTechnologyDepartment.class,2L);
        System.out.println("\nThe students to be deleted are:" + emp.getStudent_Name());
        session2.remove(emp);


        session2.getTransaction().commit();
        System.out.println("");

        session2.createQuery("from InformationTechnologyDepartment", InformationTechnologyDepartment.class).list().forEach(System.out::println);

        session2.close();

    }
}