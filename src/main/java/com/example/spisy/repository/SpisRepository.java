package com.example.spisy.repository;

import com.example.spisy.model.Spis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpisRepository  extends JpaRepository<Spis,Long> {



}
