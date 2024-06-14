package org.example.service.impl;

import org.example.model.MenuItem;
import org.example.repository.IMenuRepository;
import org.example.service.IMenuService;

import java.util.List;

public class MenuServiceImpl implements IMenuService {

    private final IMenuRepository menuRepository;

    public MenuServiceImpl(IMenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public boolean addMenuItem(MenuItem menuItem) {
        return menuRepository.addMenuItem(menuItem);
    }

    @Override
    public boolean removeMenuItem(MenuItem menuItem) {
        return menuRepository.removeMenuItem(menuItem);
    }

    @Override
    public List<MenuItem> getMenu() {
        return menuRepository.getMenu();
    }

}
