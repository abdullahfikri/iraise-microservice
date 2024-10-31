package com.iraise.course_curriculum_management_service.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academic-courses/schedule")
public class ScheduleController {
    @PostMapping("/krs/input")
    @PreAuthorize("hasAuthority('Membuka/Tutup Pengisian KRS')")
    public String scheduleKrsInput() {
        return "Membuka/Tutup Pengisian KRS";
    }

    @PostMapping("/grade/input")
    @PreAuthorize("hasAuthority('Membuka/Tutup Pengisian Nilai Mahasiswa oleh Dosen')")
    public String scheduleGradeInput() {
        return "Membuka/Tutup Pengisian Nilai Mahasiswa oleh Dosen";
    }

    @PostMapping("/cuti/input")
    @PreAuthorize("hasAuthority('Membuka/Tutup jadwal pengajuan cuti kuliah')")
    public String scheduleCutiInput() {
        return "Membuka/Tutup jadwal pengajuan cuti kuliah";
    }
}
