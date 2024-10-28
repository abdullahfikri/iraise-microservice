package com.iraise.administration_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-affairs")
public class AdministrationController {

    @PostMapping("/prodi/{prodiId}/transkrip/pengaturan")
    public String transkripPengaturan(@PathVariable("prodiId") String prodiId) {
        return "Mengelola Pengaturan Transkrip";
    }

    @GetMapping("/akademik/kalender")
    public String kalenderAkademik(@RequestParam("tahun-ajaran") String tahun) {
        return "Melihat Kalender Akademik " + tahun;
    }

    @PostMapping("/akademik/kalender")
    public String createKalenderAkademik(){
        return "Membuat dan mengelola Kalender Akademik";
    }

}
