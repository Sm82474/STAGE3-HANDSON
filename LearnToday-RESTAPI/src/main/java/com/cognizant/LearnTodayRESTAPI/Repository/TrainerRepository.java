package com.cognizant.LearnTodayRESTAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.LearnTodayRESTAPI.model.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Integer>{

}
