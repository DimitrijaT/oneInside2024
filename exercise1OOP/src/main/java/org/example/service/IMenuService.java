package org.example.service;

import org.example.model.MenuItem;

import java.util.List;

public interface IMenuService {

    boolean addMenuItem(MenuItem menuItem);
    boolean removeMenuItem(MenuItem menuItem);
    List<MenuItem> getMenu();

}
