package com.example.bootjpa;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends JpaRepository<Alien,Integer> {
        List<Alien> findByTech(String tech);
        List<Alien> findByAidGreaterThan(int aid);
        @Query("from Alien where aname=?1 order by tech")
        List<Alien> findByTechSorted(String aname);

}
