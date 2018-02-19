package AnikeenkoHw4;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StudentLessonMainXML {

//	private void selectAll(){}

//	private void selectAll2(){}
	
	

	public void studentsEntered() {
		System.out.println("Student successfully entered room");
	};
	

	public void studentsWrote() {
		System.out.println("Successfully wrote the exam");
	};
	
	

	public void studentsGetMarks() {
		System.out.println("Get good mark");
	};
	

	public void studentsLeftRoom() {
		System.out.println("Left room");
	};
}
