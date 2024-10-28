package com.iraise.administration_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-affairs/wisuda")
public class WisudaController {

    @PostMapping("/mahasiswa/{mahasiswaId}")
    public String requestWisuda(@PathVariable String mahasiswaId){
        return "Mengajukan proses Wisuda oleh Mahasiswa " + mahasiswaId;
    }

    @PostMapping("/mahasiswa/{mahasiswaId}/process")
    public String requestWisudaProcess(@PathVariable String mahasiswaId){
        return "Memproses pengajuan wisuda dari Mahasiswa " + mahasiswaId;
    }

    @GetMapping("/mahasiswa")
    public String getWisuda(){
        return "Melihat pengajuan wisuda dari Mahasiswa";
    }



}
