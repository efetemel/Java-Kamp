package homeWork_1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		PersonManager personManager = new PersonManager();
		CourseManager courseManager = new CourseManager();
		
		Person person1 = new Person("Efe Temel ERSÖZ",17,2000);
		Course course1 = new Course(1, "Java Kampı", "Yazılım Geliştirme", 0);
		
		personManager.addPerson(person1);
		personManager.delPerson(person1);
		
		courseManager.addCourse(course1);
		courseManager.delCourse(course1);
		
		Person[] persons = {person1};
		Course[] courses = {course1};
		
		for(Person person:persons) {
			System.out.println(person.name);
		}
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		
	}

}
