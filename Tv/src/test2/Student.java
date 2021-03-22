package test2;

public class Student implements Observer{
    Subject Myteacher;
    String teacherNum;
	public Student(Subject teacher,String TeacherNum) {
		// TODO Auto-generated constructor stub
		this.Myteacher=teacher;
		this.teacherNum=TeacherNum;
	}
	@Override
	public void update(String newNum) {
		// TODO Auto-generated method stub
		this.teacherNum=newNum;
		System.out.println("Student.update()"+newNum);
	}

}
