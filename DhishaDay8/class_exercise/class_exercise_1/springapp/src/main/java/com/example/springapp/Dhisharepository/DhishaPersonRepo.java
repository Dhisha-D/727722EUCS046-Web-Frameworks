package com.example.springapp.Dhisharepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.Dhishamodel.DhishaPerson;
import java.util.List;


@Repository
public interface DhishaPersonRepo extends JpaRepository<DhishaPerson,Integer>{

    List<DhishaPerson> findByNameStartingWith(String name);
    List<DhishaPerson> findByNameEndingWith(String name);
    
}
