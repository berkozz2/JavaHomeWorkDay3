package homeWorkDay3;

public class StudentManager {
	public void discontinuity(Student student) {
		double dis = 16 - (student.attendance * student.totalLesson / 100);
		if(dis>14) {
			System.out.println(student.firstName  + " " + student.lastName + " : " + "Devams�zl��� yoktur Ba�ar�l�..");
		}else {
			System.out.println(student.firstName  + " " + student.lastName + " : " + "Devams�zl�ktan kald�." );
		}
	}
}
