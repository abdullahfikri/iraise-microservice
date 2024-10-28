package com.iraise.performance_assessment_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-performance/mata-kuliah")
public class MataKuliahController {


    @GetMapping("/{mataKuliahId}/kelas/{kelasId}/penilaian")
    public String historyNilaiKelasMahasiswa(@PathVariable String mataKuliahId, @PathVariable String kelasId) {
        return "Melihat riwayat nilai MHS di kelas mata kuliah";
    }

    @GetMapping("/{mataKuliahId}/kelas/{kelasId}/absensi")
    public String historyAbsensiKelas(@PathVariable String mataKuliahId, @PathVariable String kelasId) {
        return "Melihat Histori Absensi Kelas" + kelasId+ ", Mata Kuliah " + mataKuliahId;
    }

    @PostMapping("/{mataKuliahId}/kelas/{kelasId}/absensi")
    public String melakukanAbsensi(@PathVariable String mataKuliahId, @PathVariable String kelasId) {
        return "Melakukan Absen Kelas "+ kelasId+ ", Mata Kuliah " + mataKuliahId;
    }

}
