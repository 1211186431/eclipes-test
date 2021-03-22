package test2;

import java.util.ArrayList;

public class Teacher implements Subject{
    String phoneNum;
    boolean changed;
    ArrayList<Observer> StudentList;
    
    public Teacher() {
		// TODO Auto-generated constructor stub
    	this.StudentList= new ArrayList<Observer>();
    	this.phoneNum="";
    	this.changed=false;
	}
	@Override
	public void addStudent(Observer observer) {
		// TODO Auto-generated method stub
		if(!StudentList.contains(observer))
			StudentList.add(observer);
	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyStudent() {
		// TODO Auto-generated method stub
		if(changed) {
			for(int i=0;i<StudentList.size();i++) {
				Observer observer=StudentList.get(i);
				observer.update(this.phoneNum);
			}
			this.changed=false;
		}
		
	}
	public void setPhoneNum(String newNum) {
		this.phoneNum=newNum;
		this.changed=true;
	}
    
}
