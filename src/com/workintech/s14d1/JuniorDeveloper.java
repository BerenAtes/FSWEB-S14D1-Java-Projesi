package com.workintech.s14d1;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + "Junior Developer starts to working ");
    }

}
