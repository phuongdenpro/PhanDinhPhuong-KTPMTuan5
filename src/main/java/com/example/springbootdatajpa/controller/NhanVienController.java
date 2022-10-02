package com.example.springbootdatajpa.controller;


import com.example.springbootdatajpa.entity.NhanVien;
import com.example.springbootdatajpa.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    private NhanVienService nhanVienService;

    //Câu 3
    @GetMapping("/nhan-vien-luong-duoi-10000")
    public List<NhanVien> findNhanVienDuoi10000(){
        List<NhanVien> nhanVienList = nhanVienService.findNhanVienLuongDuoi10000();
        return nhanVienList;
    }
}
