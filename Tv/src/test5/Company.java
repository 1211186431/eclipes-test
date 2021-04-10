package test5;

public abstract class Company {
     private String name;
     public Company(String name) {
    	 this.name=name;
     }
     public abstract void Add(Company c);
     public abstract void Delete(Company c);
}
