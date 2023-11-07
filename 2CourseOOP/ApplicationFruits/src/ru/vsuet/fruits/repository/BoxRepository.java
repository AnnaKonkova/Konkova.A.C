package ru.vsuet.fruits.repository;

import ru.vsuet.fruits.domain.Box;

import java.util.List;

public interface BoxRepository {
    Box find(long id);
    List<Box>list();
    void save(Box box);
    void remove(Box box);
}
