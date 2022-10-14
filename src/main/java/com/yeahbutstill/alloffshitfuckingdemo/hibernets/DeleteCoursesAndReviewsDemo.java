package com.yeahbutstill.alloffshitfuckingdemo.hibernets;

import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Course;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Instructor;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.InstructorDetail;
import com.yeahbutstill.alloffshitfuckingdemo.mvc.entity.Review;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCoursesAndReviewsDemo {

    public static void main(String[] args) {

        // create session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(Review.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

        try {

            // start a transaction
            session.beginTransaction();

            // get the course
            Integer theId = 16;
            Course tempCourse = session.get(Course.class, theId);

            // print the course
            System.out.println("Delete the course ...");
            System.out.println(tempCourse);

            // print the course review
            System.out.println(tempCourse.getReviews());

            // delete the course
            session.delete(tempCourse);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Done!");
        } finally {

            // add clean up code
            session.close();

            factory.close();
        }
    }

}





