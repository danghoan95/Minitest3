package Miniest;

public class StaffFullTime extends Staff implements Comparable <StaffFullTime>{
    private int bonus;
    private int fine;
    private int hardSalary;


    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public StaffFullTime(int id, String name, double phoneNumber, String email, Address address, int bonus, int fine, int hardSalary) {
        super(id, name, phoneNumber, email, address);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(int hardSalary) {
        this.hardSalary = hardSalary;
    }
    @Override
    public String toString (){
        return super.toString() + "  hardSalary:" + hardSalary + "  bonus:" + bonus + "  file :" + fine ;
    }
    public int totalSalary() {
        return hardSalary + bonus - fine;
    }

    @Override
    public int compareTo(StaffFullTime o) {
        return this.hardSalary - o.hardSalary;
    }
}
