package module3.task1.task3;

import java.util.Date;

public class Solution {

    public static void main(String[] args) {
        Course[] coursesTaken = new Course[2];

        Student Dima = new Student("Dmytro", "Lutsenko", 6);
        Student Vasia = new Student("Vasyl", coursesTaken);

        SpecialStudent Pet = new SpecialStudent( "Chernih", coursesTaken);
        SpecialStudent Andr = new SpecialStudent("Andrii", "Garmash", 1, "Garvard", 7, 12346938 );
        SpecialStudent Vit = new SpecialStudent("Vitalii", "Pupkin", 3, 89984367);

        CollegeStudent Djon = new CollegeStudent("Jonny", "Snow", 3);
        CollegeStudent Rob = new CollegeStudent("Stark", coursesTaken);
        CollegeStudent Sansa = new CollegeStudent("Sansa", "Stark", 4, "Oxford", 6, 78347223);

        Course Math = new Course(new Date(942016), "John");
        Course Tactic = new Course(new Date(432016), "Deineris");
        Course Chemic = new Course("Chemical", 140, "Hodor");
        Course Physic = new Course("Physical", 120, "Petir");
        Course Biology = new Course("Biology", 100, "Varid");


    }
}
