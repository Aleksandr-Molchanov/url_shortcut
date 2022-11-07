package ru.job4j.shortcut.service;

import org.springframework.stereotype.Service;
import ru.job4j.shortcut.model.Url;
import ru.job4j.shortcut.repository.UrlRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class UrlService {

    private final UrlRepository repository;

    public UrlService(UrlRepository repository) {
        this.repository = repository;
    }

    public Set<Url> findAll() {
        return repository.findAll();
    }

    public Optional<Url> findByCode(String code) {
        return repository.findByCode(code);
    }

    public Url save(Url url) {
        return repository.save(url);
    }

    public Optional<Url> findById(int id) {
        return repository.findById(id);
    }

    public void delete(Url url) {
        repository.delete(url);
    }

    public void incrementTotal(String code) {
        repository.incrementTotal(code);
    }

}
