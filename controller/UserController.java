package controller;

import model.User;

public interface UserController<T extends User> {

    public T create(T user);

}