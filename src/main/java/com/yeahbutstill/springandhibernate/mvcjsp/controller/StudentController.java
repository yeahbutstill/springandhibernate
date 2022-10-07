package com.yeahbutstill.springandhibernate.mvcjsp.controller;

import com.yeahbutstill.springandhibernate.mvcjsp.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel) {

        // create student object to the model
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);

        return "student-form";

    }

    @RequestMapping("processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log the input data
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        System.out.println("theStudent country: " + theStudent.getCountry());
        System.out.println("theStudent favoriteLanguage " + theStudent.getFavoriteLanguage());
        System.out.println("--------------------------------------------------------------------------");

        return "student-confirmation";
    }

}
