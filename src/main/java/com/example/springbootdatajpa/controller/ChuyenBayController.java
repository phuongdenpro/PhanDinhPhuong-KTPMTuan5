package com.example.springbootdatajpa.controller;

import com.example.springbootdatajpa.entity.ChuyenBay;
import com.example.springbootdatajpa.repository.ChuyenBayRepository;
//import com.example.springbootdatajpa.service.ChuyenBayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController()
@RequestMapping("/chuyen-bay")
public class ChuyenBayController {
    @Autowired
//    private ChuyenBayService chuyenBayService;
    private ChuyenBayRepository chuyenBayRepository;
    @GetMapping("/chuyen-bay-toi-dad")
    public List<ChuyenBay> toDalat() {
        List<ChuyenBay> listChuyenBay = (List<ChuyenBay>) chuyenBayRepository.getChuyenBayDen("DAD");
        System.out.println(listChuyenBay);
        return listChuyenBay;
    }
    }