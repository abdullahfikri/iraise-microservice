package com.iraise.communication_support_management_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/communication-support")
public class PengumumanController {

    @GetMapping("/pengumuman")
    public String pengumuman() {
        return "Melihat pengumuman";
    }

    @PostMapping("/pengumuman/akademik")
    public String createdPengumumanAkademik() {
        return "Membuat Pengumuman Akademik";
    }

    @PostMapping("/pengumuman/prodi")
    public String createdPengumumanProdi() {
        return "Membuat pengumuman prodi";
    }
}
