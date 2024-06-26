package src.school.management.system;

public class Students {
    private int id;
    private String name;
    private int grade;
    private int paidFee;
    private int totalFees;


    //CREATE CONSTRUCTOR() OF STUDENT OBJ
  public Students(int id, String name, int grade){
    this.paidFee = 0;
    this.totalFees= 30000;
    this.id=id; //tell id from obj = to id in constructor()
    this.name=name;
    this.grade = grade;
  }

  //to update student's grade
  public void setGrade (int grade) {
    this.grade = grade;
  }

  /**keep update the fees to feepiad

   * @param fees is the fees that student pays
   */

  public void updateFeesPaid(int fees) {
      paidFee += fees;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public int getPaidFee() {
    return paidFee;
  }

  public int getTotalFees() {
    return totalFees;
  }
  public void payFees(int fees) {
    //void type methods cuz dun have to return anything back for this method()
    paidFee += fees;
    School.updateTotalMoneyEarned(paidFee);

  }

  public int getRemainingFees() {
    return totalFees - paidFee;
  }

  @Override
  /*a way to represent obj
  ex: in the case that print out user would be as address, so we use toString() to convert that
   */

  public String toString() {
    return "Student's name: " + name +
          "total fees paid so far: $" + paidFee;
  }
}
