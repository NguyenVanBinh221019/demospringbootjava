package com.example.demospringbootjava.repository;

import com.example.demospringbootjava.entity.New;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewRepository extends JpaRepository<New, Long> {
    New findByid(Long id);

}
