package test2;

public interface Subject {
    public abstract void addStudent(Observer observer);
    public abstract void deleteStudent();
    public abstract void notifyStudent();
}
