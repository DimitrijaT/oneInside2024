package org.example.repository.impl;

import org.example.model.MenuItem;
import org.example.repository.IMenuRepository;

import java.util.ArrayList;
import java.util.List;

public class MenuRepositoryImpl implements IMenuRepository {

    List<MenuItem> menu;

    public MenuRepositoryImpl() {
        menu = new ArrayList<>();
    }

    @Override
    public boolean addMenuItem(MenuItem menuItem) {
        menu.add(menuItem);
        return true;
    }

    @Override
    public boolean removeMenuItem(MenuItem menuItem) {
        menu.remove(menuItem);
        return true;
    }

    @Override
    public String printMenuItem(MenuItem menuItem) {
        return menuItem.toString();
    }

    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }


}
