package ru.neoflex.practice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.neoflex.practice.model.Base;
@Repository
public interface BaseRepository extends JpaRepository<Base,Long> {

}
