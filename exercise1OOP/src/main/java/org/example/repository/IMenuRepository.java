package org.example.repository;

import org.example.model.MenuItem;

import java.util.List;

public interface IMenuRepository {
    boolean addMenuItem(MenuItem menuItem);

    boolean removeMenuItem(MenuItem menuItem);

    String printMenuItem(MenuItem menuItem);

    List<MenuItem> getMenu();
}
