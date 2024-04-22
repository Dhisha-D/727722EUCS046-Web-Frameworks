package com.examly.class_exercise_1.Dhisharepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.Dhishamodel.DhishaPerson;

/**
 * PersonRepo
 */
@Repository
public interface DhishaPersonRepo extends JpaRepository<DhishaPerson, Integer> {

     List<DhishaPerson> findByAge(int byAge);
}