package com.iraise.performance_assessment_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/academic-performance/dosen")
public class DosenController {

    @GetMapping("/prodi/{prodiId}/input-nilai/status")
    @PreAuthorize("hasAuthority('Melihat Rekap dosen prodi yang mengisi nilai')")
    public String statusDosenMengisiNilai(@PathVariable("prodiId") String prodiId) {
        return "Melihat Rekap dosen prodi yang mengisi nilai";
    }

    @GetMapping("/prodi/{prodiId}/absen")
    @PreAuthorize("hasAuthority('Melihat rekap dosen prodi yang mengisi absen kuliah')")
    public String statusDosenMengisiAbsen(@PathVariable("prodiId") String prodiId) {
        return "Melihat rekap dosen prodi yang mengisi absen kuliah";
    }

    @GetMapping("/prodi/{prodiId}/laporan/sks")
    @PreAuthorize("hasAuthority('Melihat laporan sks dosen Prodi')")
    public String laporanSKSProdi(@PathVariable String prodiId) {
        return "Melihat laporan sks dosen Prodi " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/laporan/mk")
    @PreAuthorize("hasAuthority('Melihat laporan MK Dosen Prodi')")
    public String laporanMKProdi(@PathVariable String prodiId) {
        return "Melihat laporan mk dosen Prodi " + prodiId;
    }

}
