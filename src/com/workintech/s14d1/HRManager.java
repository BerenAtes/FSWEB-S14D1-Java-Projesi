package com.workintech.s14d1;

import java.util.Arrays;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary, JuniorDeveloper[] juniorDevelopers, MidDeveloper[] midDevelopers, SeniorDeveloper[] seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;
    }

    @Override
    public void work() {
        setSalary(30000);
        System.out.println(getName() + "HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = junior;
            } else {
                System.out.println("This index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Geçersiz index:" + index);
        } catch (Exception exception) {
            System.out.println("Bir hata oluştu:" + exception.getMessage());
        }
    }

    public void addEmployee(int index,MidDeveloper mid){
        try {
            if(midDevelopers[index]==null){
                midDevelopers[index]=mid;
            } else {
                System.out.println("This index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Geçersiz index:" + index);
        } catch (Exception exception){
            System.out.println("Bir hata oluştu:" + exception.getMessage());
        }
    }

    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = senior;
            } else {
                System.out.println("This index is full");
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Geçersiz index:" + index);
        } catch (Exception exception) {
            System.out.println("Bir hata oluştu:" + exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                '}';
    }
}
