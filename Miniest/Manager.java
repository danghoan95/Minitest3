package Miniest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager {

    Staff staff = new StaffFullTime(1, "abc", 1100, "abc.1", new Address(), 50, 20, 500);
    Staff staff1 = new StaffFullTime(2, "abc1", 1100, "abc", new Address(), 20, 30, 300);
    Staff staff2 = new StaffFullTime(3, "abc2", 1100, "abc", new Address(), 30, 20, 200);
    Staff staff3 = new StaffFullTime(4, "abc3", 1100, "abc", new Address(), 40, 5, 800);
    Staff staff4 = new StaffFullTime(5, "abc4", 1100, "abc", new Address(), 50, 80, 1000);
    Staff staff5 = new SaffPartTime(6, "abc5", 1100, "abc", new Address(), 80);
    Staff staff6 = new SaffPartTime(7, "abc6", 1100, "abc", new Address(), 40);
    Staff staff7 = new SaffPartTime(8, "abc7", 1100, "abc", new Address(), 50);
    Staff staff9 = new SaffPartTime(9, "abc8", 1100, "abc", new Address(), 30);
    Staff staff8 = new SaffPartTime(10, "abc9", 1100, "abc", new Address(), 20);
    List<Staff> staffList = new ArrayList<>();
    int total = 0;
    int avg = 0;

    public void setStaffList() {
        staffList.add(staff);
        staffList.add(staff1);
        staffList.add(staff2);
        staffList.add(staff3);
        staffList.add(staff4);
        staffList.add(staff5);
        staffList.add(staff6);
        staffList.add(staff7);
        staffList.add(staff8);
        staffList.add(staff9);
    }

    public void showStaffList() {
        for (Staff value : staffList) {
            if (value instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) value;
                System.out.println(staffFullTime);
            } else {
                SaffPartTime saffPartTime = (SaffPartTime) value;
                System.out.println(saffPartTime);
            }
        }
    }

    public void TotalSalary() {
        for (Staff value : staffList) {
            if (value instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) value;
                total += staffFullTime.totalSalary();
            } else {
                SaffPartTime saffPartTime = (SaffPartTime) value;
                total += saffPartTime.totalSalary();
            }
        }
        System.out.println(total);
    }

    public void avgSalary() {
        avg = total / staffList.size();
        System.out.println(avg);
    }

    public void saffavgSalary() {
        for (Staff value : staffList) {
            if (value instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) value;
                if (staffFullTime.getHardSalary() < avg) {
                    System.out.println(staffFullTime);
                }
            }
        }
    }

    public void salaryPartTime() {
        int Total1 = 0;
        for (Staff value : staffList) {
            if (value instanceof SaffPartTime) {
                SaffPartTime saffPartTime = (SaffPartTime) value;
                Total1 += saffPartTime.totalSalary();
            }
        }
        System.out.println(Total1);
    }

    public void ascending() {
        List<StaffFullTime> staffFullTimeList = new ArrayList<>();
        for (Staff value : staffList) {
            if (value instanceof StaffFullTime) {
                StaffFullTime staffFullTime = (StaffFullTime) value;
                staffFullTimeList.add(staffFullTime);
            }
        }
        Collections.sort(staffFullTimeList);
//        Collections.sort(staffFullTimeList, new Comparator<StaffFullTime>() {
//            @Override
//            public int compare(StaffFullTime o1, StaffFullTime o2) {
//                return o1.getHardSalary() - o2.getHardSalary();
//            }
//        });
        for (StaffFullTime value : staffFullTimeList) {
            System.out.println(value);
        }
    }
}