package src.school.management.system;
import java.util.ArrayList;
import java.util.List;
public class Main {

  public static void main(String[] args) {
    Teacher pheak = new Teacher(1, "pheak", 900);
    Teacher Lina = new Teacher(2, "Lina", 500);
    Teacher disney  = new Teacher(3, "disney", 3000);

    List<Teacher> teacherList = new ArrayList<>();
    teacherList.add(pheak);
    teacherList.add(Lina);
    teacherList.add(disney);


    Students tina = new Students(1, "tina", 1000);
    Students biney = new Students(2, "biney", 500);
    Students mara  = new Students(3, "mara", 3000);

    List<Students> studentList = new ArrayList<>();
    studentList.add(tina);
    studentList.add(biney);
    studentList.add(mara);


    School E2STEMPVH = new School (teacherList, studentList);

    //get school fees
    tina.payFees(500);
    biney.payFees(500);
    System.out.println("total money earned is: $"+E2STEMPVH.getTotalMoneyEarned());

    //pay for teachers
    pheak.receivedSalary(pheak.getSalary());
    System.out.println("E2STEMPVH has spent salary for "+pheak.getName()+" and now has: $"+E2STEMPVH.getTotalMoneyEarned());

    System.out.println(tina); //output: src.school.management.system.Students@3fb6a447, so need to use toString()

  }
}
