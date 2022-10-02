package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.NhanVien;
import com.example.springbootdatajpa.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienServiceImpl implements NhanVienService{
    @Autowired
    private NhanVienRepository nhanVienRepository;
    @Override
    public List<NhanVien> findNhanVienLuongDuoi10000() {
        List<NhanVien> nhanVienList = nhanVienRepository.findNhanVienLuongDuoi10000();
        return nhanVienList;
    }
}
