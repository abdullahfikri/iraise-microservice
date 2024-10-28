package com.iraise.administration_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-affairs/cuti")
public class CutiController {
    @GetMapping()
    public String cuti(){
        return "Melihat Pengajuan Cuti Kuliah";
    }

    @PostMapping("/{cutiId}/process")
    public String prosesCuti(@PathVariable String cutiId){
        return "Memproses Pengajuan Cuti Kuliah yang sudah disetujui CutiId: " + cutiId;
    }

    @PostMapping("/{cutiId}/accepted")
    public String acceptedCuti(@PathVariable String cutiId){
        return "Menyetujui Pengajuan Cuti Kuliah";
    }

    @PostMapping("/request")
    public String requestCuti(){
        return "Mengajukan Cuti Kuliah";
    }


}
