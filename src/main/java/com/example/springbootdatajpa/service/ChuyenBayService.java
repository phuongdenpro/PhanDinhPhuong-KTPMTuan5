package com.example.springbootdatajpa.service;

import com.example.springbootdatajpa.entity.ChuyenBay;

import java.util.List;

public interface ChuyenBayService {
    List<ChuyenBay> getChuyenBayDen(String gaDen);
    List<ChuyenBay> getChuyenBayTu8000den10000();
    List<ChuyenBay> getChuyenBayTuSaiGondenBuonMeThuoc();
    int tinhChuyenBayByGaDiSaiGon();
}
