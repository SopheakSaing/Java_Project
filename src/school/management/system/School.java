package src.school.management.system;
import java.util.List;
//many teachers, many students

public class School {
  //not gonna use array cuz dk no students and teachers but ArrayList
  private List<Teacher> teachers;
  private List<Students> students;
  private int totalMoneyEarned;
  private int totalMoneySpent;

  public School(final List<Teacher> teachers, final List<Students> students) {
    this.teachers = teachers;
    this.students = students;
    this.totalMoneyEarned=0;
    this.totalMoneySpent=0;
  }

  //use GET to return the field of the attribute
  public List<Teacher> getTeachers() {
    return teachers;
  }

  public List<Students> getStudents() {
    return students;
  }

  public int getTotalMoneyEarned() {
    return totalMoneyEarned;
  }

  public int getTotalMoneySpent() {
    return totalMoneySpent;
  }

  /*
  update number of teachers
   */
  public void updateTeachers(Teacher teacher) {
    //a single teacher that will be updated to list of teachers
    teachers.add(teacher);
  }

  public void updateStudents(Students student) {
    students.add(student);
  }


  public void updateTotalMoneyEarned(int MoneyEarned) {
    totalMoneyEarned += MoneyEarned;
  }


  // update money which after spent money on teachers
  public void updateTotalMoneySpent(int MoneySpent) {
    totalMoneyEarned -= MoneySpent;
  }
}
