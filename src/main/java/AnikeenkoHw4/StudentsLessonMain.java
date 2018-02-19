package AnikeenkoHw4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.AfterReturning;

@Aspect
public class StudentsLessonMain  {
	@Pointcut("execution(* AnikeenkoHw4.Student.getName(..))")
	private void selectAll(){}
	@Pointcut("execution(* AnikeenkoHw4.Student.getMark(..))")
	private void selectAll2(){}
	
	
	 @Before("selectAll()")
	public void studentsEntered() {
		System.out.println("Student successfully entered room");
	};
	
	@AfterReturning("selectAll()")
	public void studentsWrote() {
		System.out.println("Successfully wrote the exam");
	};
	
	
	
	@Before("selectAll2()")
	public void studentsGetMarks() {
		System.out.println("Get good mark");
	};
	
	@After("selectAll2()")
	public void studentsLeftRoom() {
		System.out.println("Left room");
	};
	
}
