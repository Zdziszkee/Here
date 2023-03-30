package me.zdziszkee.tasks.immutability;

import java.util.Date;

//we mark class as final so we can't extend it and override its methods
public final class Person {
    //we mark fields final and private so user can't access them from outside and modify them.
    private final String name;
    private final Date birthday;

    public Person(final String name,final Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }


    //Strings are immutable by default no need to create new string object
    public String getName() {
        return name;
    }

    // we create new date object so user can't modify the one inside person object.
    public Date getBirthday() {
        return new Date(birthday.getTime());
    }
}
