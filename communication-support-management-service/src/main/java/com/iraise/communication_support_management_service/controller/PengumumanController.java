package com.iraise.communication_support_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/communication-support")
public class PengumumanController {

    @GetMapping("/pengumuman")
    @PreAuthorize("hasAnyAuthority('Melihat pengumuman')")
    public String pengumuman() {
        return "Melihat pengumuman";
    }

    @PostMapping("/pengumuman/akademik")
    @PreAuthorize("hasAnyAuthority('Membuat Pengumuman Akademik')")
    public String createdPengumumanAkademik() {
        return "Membuat Pengumuman Akademik";
    }

    @PostMapping("/pengumuman/prodi")
    @PreAuthorize("hasAnyAuthority('Membuat pengumuman prodi')")
    public String createdPengumumanProdi() {
        return "Membuat pengumuman prodi";
    }
}
