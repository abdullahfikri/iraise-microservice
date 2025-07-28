package com.iraise.administration_management_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-affairs/cuti")
public class CutiController {
    private static final Logger log = LoggerFactory.getLogger(CutiController.class);

    @GetMapping("")
    @PreAuthorize("hasAuthority('Melihat Pengajuan Cuti Kuliah')")
    public String cuti(){
        log.info("invoke");
        return "Melihat Pengajuan Cuti Kuliah";
    }

    @PostMapping("/{cutiId}/process")
    @PreAuthorize("hasAuthority('Memproses Pengajuan Cuti Kuliah yang sudah disetujui')")
    public String prosesCuti(@PathVariable String cutiId){
        return "Memproses Pengajuan Cuti Kuliah yang sudah disetujui CutiId: " + cutiId;
    }

    @PostMapping("/{cutiId}/accepted")
    @PreAuthorize("hasAuthority('Menyetujui Pengajuan Cuti Kuliah')")
    public String acceptedCuti(@PathVariable String cutiId){
        return "Menyetujui Pengajuan Cuti Kuliah";
    }

    @PostMapping("/request")
    @PreAuthorize("hasAuthority('Mengajukan Cuti Kuliah')")
    public String requestCuti(){
        return "Mengajukan Cuti Kuliah";
    }


}
