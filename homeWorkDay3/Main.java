package homeWorkDay3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.firstName = "Engin";
		instructor.lastName = "Demiroğ";
		instructor.lessonName = "Java Course";
		
		Instructor instructor2 = new Instructor();
		instructor2.id = 2;
		instructor2.firstName = "Murat";
		instructor2.lastName = "Kurtboğan";
		instructor2.lessonName = "Python Course";
		
		Student student = new Student();
		student.id = 1;
		student.firstName = "Berk";
		student.lastName = "Özmenekşe";
		student.attendance = 10;
		student.totalLesson = 16;
		
		Student student2 = new Student();
		student2.id = 2;
		student2.firstName = "Burak";
		student2.lastName = "Özmenekşe";
		student2.attendance = 15;
		student2.totalLesson = 16;
		
		
		
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		
		instructorManager.add(instructor);
		studentManager.discontinuity(student2);
		studentManager.discontinuity(student);
		userManager.entry(instructor);
		
		

	}

}
