package com.yeahbutstill.alloffshitfuckingdemo.hibernets;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Course;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Instructor;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetCoursesLater {

    public static void main(String[] args) {

        // create the session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        // create the session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // get the transaction from db
            Integer theId = 1;
            Instructor tempInstructor = session.get(Instructor.class, theId);

            System.out.println("yeahbutstill: Instructor: " + tempInstructor);

            // commit transaction
            session.getTransaction().commit();

            // close the session
            session.close();
            System.out.println("\nyeahbutstill: The session is now closed!\n");

            //
            // THIS HAPPENS SOMEWHERE ELSE / LATER IN THE PROGRAM
            // YOU NEED TO GET A NEW SESSION
            //
            System.out.println("\n\nyeahbutstill: Opening a New Session \n");
            session = factory.getCurrentSession();
            session.beginTransaction();

            // get courses for a given instructor
            Query<Course> query = session.createQuery("select c from Course c "
                            + "where c.instructor.id=:theInstructorId",
                    Course.class);
            query.setParameter("theInstructorId", theId);
            List<Course> tempCourses = query.getResultList();
            System.out.println("tempCourses: " + tempCourses);

            // now assign to instructor object in memory
            tempInstructor.setCourses(tempCourses);
            System.out.println("yeahbutstill: Courses: " + tempInstructor.getCourses());

            session.getTransaction().commit();
            System.out.println("yeahbutstill: Done");

        } finally {

            // add clean up code
            session.close();
            factory.close();

        }

    }

}
