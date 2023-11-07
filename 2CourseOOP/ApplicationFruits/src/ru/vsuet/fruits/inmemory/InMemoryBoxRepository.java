package ru.vsuet.fruits.inmemory;

import ru.vsuet.fruits.domain.Box;
import ru.vsuet.fruits.repository.BoxRepository;
import ru.vsuet.fruits.store.Storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InMemoryBoxRepository implements BoxRepository {
    private final Storage storage=Storage.getInstance();
    @Override
    public Box find(long id) {
        return storage.boxes.stream()
                .filter(box -> Objects.equals(box.getId(),id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Box> list() {
        return new ArrayList<>(storage.boxes);
    }

    @Override
    public void save(Box box) {

    }

    @Override
    public void remove(Box box) {

    }
}
