package unitedNation;

public interface Country {
     public void setUnitedNation(UnitedNation un);
     public void declare(String message);
     
     public void declare(String message,Country country);
     
     public void getMessage(String message);
     
}
