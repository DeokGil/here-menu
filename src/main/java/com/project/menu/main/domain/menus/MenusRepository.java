package com.project.menu.main.domain.menus;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenusRepository extends JpaRepository<Menus,Long> {
    @Query(value = "select m from heremenu.menu m where m.category = :category",nativeQuery = true)
    List<Menus> findByAllCategory(@Param("category") String category);

}
