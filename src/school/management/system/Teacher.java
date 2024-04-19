package src.school.management.system;

public class Teacher {
  private int id;
  private String name;
  private int salary;
  private int salaryEarned;

  public Teacher(int id, String name, int salary) {
    this.id=id;
    this.name=name;
    this.salary = salary;
    this.salaryEarned=0;
  }

  public int getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public int getSalary() {
    return salary;
  }

  //update the salary
  public void updateSalary (int salary) {
      this.salary = salary;
  }

  public void receivedSalary(int alary){
    salaryEarned += salary;
    School.updateTotalMoneySpent(salary);
  }
}
