package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.ChuyenBay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ChuyenBayRepository extends JpaRepository<ChuyenBay, String> {
    @Query("select c from ChuyenBay c where c.gaDen = :gaDen")
    List<ChuyenBay> getChuyenBayDen(@Param("gaDen") String gaDen);

    @Query("select c from ChuyenBay c where c.doDai > 8000 AND c.doDai < 10000")
    List<ChuyenBay> getChuyenBayTu8000den10000();

    @Query("select c from ChuyenBay c where c.gaDi = 'SGN' AND c.gaDen = 'BMV'")
    List<ChuyenBay> getChuyenBayTuSaiGondenBuonMeThuoc();
}
