package com.example.springbootdatajpa.repository;

import com.example.springbootdatajpa.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.Map;
import java.util.List;
public interface NhanVienRepository extends JpaRepository<NhanVien,String> {
    @Query("select c from NhanVien c where c.luong < 10000")
    List<NhanVien> findNhanVienLuongDuoi10000();
}
