package com.iraise.administration_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-affairs")
public class AdministrationController {

    @PostMapping("/prodi/{prodiId}/transkrip/pengaturan")
    @PreAuthorize("hasAuthority('Mengelola Pengaturan Transkrip')")
    public String transkripPengaturan(@PathVariable("prodiId") String prodiId) {
        return "Mengelola Pengaturan Transkrip";
    }

    @GetMapping("/akademik/kalender")
    @PreAuthorize("hasAuthority('Melihat Kalender Akademik')")
    public String kalenderAkademik(@RequestParam("tahun-ajaran") String tahun) {
        return "Melihat Kalender Akademik " + tahun;
    }

    @PostMapping("/akademik/kalender")
    @PreAuthorize("hasAuthority('Membuat dan mengelola Kalender Akademik')")
    public String createKalenderAkademik(){
        return "Membuat dan mengelola Kalender Akademik";
    }

}
