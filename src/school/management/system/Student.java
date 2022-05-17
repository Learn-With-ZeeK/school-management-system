package school.management.system;


public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /*
      To create a new student by initializing.
      Fees for every student is $30,000.
      Fees paid initially is 0.
      id for the student: unique.
      name name of the student.
      grade grade of the student.
     */
    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name, student's id.


    /*
      Used to update the student's grade.
    
     */
    public void setGrade(int grade){
        this.grade=grade;
    }


    /*
     Keep adding the fees to feesPaid Field.
      Add the fees to the fees paid.
       The school is going receive the funds.
       fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /*
      Return id of student
     */
    public int getId() {
        return id;
    }

    /*
     Returnname of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /*
     Return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /*
      Return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /*
     Return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
