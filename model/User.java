package model;

import util.UserComparator;

public abstract class User extends UserComparator<User> implements Comparable<User> {

    protected int id;
    protected String name;
    protected String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }
}
