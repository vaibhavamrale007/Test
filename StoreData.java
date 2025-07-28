import java.lang.module.Configuration;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StoreData {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = new Configuration().configure("hibernate.cfg.xml")
                .buildSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Employee e1 = new Employee();
            e1.setName("Sonoo");

            Regular_Employee e2 = new Regular_Employee();
            e2.setName("Vivek Kumar");
            e2.setSalary(50000);
            e2.setBonus(5);

            Contract_Employee e3 = new Contract_Employee();
            e3.setName("Arjun Kumar");
            e3.setPay_per_hour(1000);
            e3.setContract_duration("15 hours");

            session.persist(e1);
            session.persist(e2);
            session.persist(e3);

            transaction.commit();
            System.out.println("Success");

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
