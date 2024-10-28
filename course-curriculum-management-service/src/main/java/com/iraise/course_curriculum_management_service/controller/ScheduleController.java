package com.iraise.course_curriculum_management_service.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academic-courses/schedule")
public class ScheduleController {
    @PostMapping("/krs/input")
    public String scheduleKrsInput() {
        return "Membuka/Tutup Pengisian KRS";
    }

    @PostMapping("/grade/input")
    public String scheduleGradeInput() {
        return "Membuka/Tutup Pengisian Nilai Mahasiswa oleh Dosen";
    }

    @PostMapping("/cuti/input")
    public String scheduleCutiInput() {
        return "Membuka/Tutup jadwal pengajuan cuti kuliah";
    }
}
