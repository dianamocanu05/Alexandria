package com.example.alexandriaapi.repositories;

import com.example.alexandriaapi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query(value = "SELECT * FROM Categories WHERE NAME = ?1", nativeQuery = true)
    Category findByName(String name);
}
