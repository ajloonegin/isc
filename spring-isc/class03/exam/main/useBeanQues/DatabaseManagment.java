package ir.freeland.spring.usebean;
@Service
public class DatabaseManagment {
  public void save(String value) {
    System.out.println("Save to database result: " + value);

  }
}