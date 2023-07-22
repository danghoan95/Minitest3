package Miniest;

public class SaffPartTime extends Staff{
  private int  workingHours ;


  public SaffPartTime(int id, String name, double phoneNumber, String email, Address address, int workingHours) {
    super(id, name, phoneNumber, email, address);
    this.workingHours = workingHours;
  }
  public int totalSalary(){
    return workingHours*100000;
  }
  public int getWorkingHours() {
    return workingHours;
  }

  public void setWorkingHours(int workingHours) {
    this.workingHours = workingHours;
  }
  @Override
  public String toString(){
    return super.toString() + " workingHours:" + getWorkingHours();
  }
}
