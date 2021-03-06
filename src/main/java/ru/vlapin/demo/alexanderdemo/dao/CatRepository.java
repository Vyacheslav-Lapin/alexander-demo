package ru.vlapin.demo.alexanderdemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.alexanderdemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
