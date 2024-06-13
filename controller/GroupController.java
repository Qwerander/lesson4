package controller;

import model.User;

public interface GroupController<T extends User> {

    public void add(T user);
    public void update(int index, T user);
}
