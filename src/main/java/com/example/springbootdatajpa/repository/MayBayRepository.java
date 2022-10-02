package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.ChuyenBay;
import com.example.springbootdatajpa.entity.MayBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MayBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query("select c from MayBay c where c.tamBay > 10000")
    List<MayBay> getMayBayHon10000km();
}
