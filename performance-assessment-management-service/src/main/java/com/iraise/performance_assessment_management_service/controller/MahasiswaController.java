package com.iraise.performance_assessment_management_service.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-performance/mahasiswa")
public class MahasiswaController {

    @GetMapping("/{mahasiswaId}/transkrip")
    @PreAuthorize("hasAuthority('Melihat transkrip nilai Mahasiswa')")
    public String transkripMahasiswa(@PathVariable String mahasiswaId) {
        return "Transkrip Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/{mahasiswaId}/khs")
    @PreAuthorize("hasAuthority('Melihat KHS individu Mahasiswa')")
    public String khsMahasiswa(@PathVariable String mahasiswaId) {
        return "Khs Mahasiswa: " + mahasiswaId;
    }

    @PostMapping("/{mahasiswaId}/input-nilai")
    @PreAuthorize("hasAuthority('Menginput Nilai Mahasiswa')")
    public String inputNilaiMahasiswa(@PathVariable String mahasiswaId) {
        return "Input Nilai Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/transkrip/prodi/{prodiId}/kelas/{kelasId}")
    @PreAuthorize("hasAuthority('Melihat transkrip perkelas')")
    public String transkripMahasiswaPerKelas(@PathVariable String prodiId, @PathVariable String kelasId) {
        return "Transkrip Mahasiswa Prodi: " + prodiId + ", Kelas: " + kelasId;
    }

    @GetMapping("/khs/prodi/{prodiId}/kelas/{kelasId}")
    @PreAuthorize("hasAuthority('melihat khs perkelas')")
    public String khsMahasiswaPerKelas(@PathVariable String prodiId, @PathVariable String kelasId) {
        return "Khs Mahasiswa: " + prodiId + ", Kelas: " + kelasId;
    }

    @GetMapping("/prodi/{prodiId}/laporan/hapus-nilai")
    @PreAuthorize("hasAuthority('Melihat laporan hapus nilai MHS')")
    public String laporanHapusNilaiMahasiswaProdi(@PathVariable String prodiId) {
        return "Melihat laporan hapus nilai Mahasiswa  Prodi: " + prodiId;
    }

    @PostMapping("/prodi/{prodiId}/laporan/hapus-nilai/{hapusNilaiId}")
    @PreAuthorize("hasAuthority('Mengelola hapus nilai MHS')")
    public String processHapusNilaiMahasiswaProdi(@PathVariable String prodiId, @PathVariable String hapusNilaiId) {
        return "Mengelola hapus nilai  Mahasiswa Prodi: " + prodiId + ", Hapus id: " + hapusNilaiId;
    }

    @GetMapping("/prodi/{prodiId}/status")
    @PreAuthorize("hasAuthority('Grafik kuliah mahasiswa Prodi')")
    public String chartKuliahMahasiswaProdi(@PathVariable String prodiId, @RequestParam("status-kuliah") String statusKuliah) {
        return "Grafik kuliah mahasiswa Prodi: " + prodiId;
    }

    @PostMapping("/{mahasiswaId}/krs")
    @PreAuthorize("hasAuthority('Melakukan pengisian KRS')")
    public String fillKRSMahasiswa(@PathVariable String mahasiswaId) {
        return "Melakukan pengisian KRS Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/{mahasiswaId}/krs")
    @PreAuthorize("hasAuthority('Melihat riwayat KRS mahasiswa')")
    public String historyKRSMahasiswa(@PathVariable String mahasiswaId) {
        return "Melihat riwayat KRS mahasiswa " + mahasiswaId;
    }

    @GetMapping("/krs/prodi/{prodiId}/status?status-isi")
    @PreAuthorize("hasAuthority('Grafik mahasiswa yang sudah melakukan pengisian KRS di Prodi')")
    public String chartIsiKRSMahasiswaProdi(@PathVariable String prodiId, @RequestParam("status-isi") String statusIsi) {
        return "Grafik mahasiswa yang sudah melakukan pengisian KRS di Prodi: " + prodiId;
    }

    @GetMapping("/krs/prodi/{prodiId}/status")
    @PreAuthorize("hasAuthority('Melihat rekap mahasiswa isi krs')")
    public String listMahasiswaIsiKRS(@PathVariable String prodiId) {
        return "Melihat rekap mahasiswa isi krs prodi: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/list/IP")
    @PreAuthorize("hasAuthority('Melihat list IP Mahasiswa Prodi')")
    public String listIPMahasiswaProdi(@PathVariable String prodiId, @RequestParam(value = "angkatan", required = false) String angkatan) {
        return "Melihat list IP Mahasiswa Prodi " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/list/IPK")
    @PreAuthorize("hasAuthority('Melihat list IPK Mahasiswa Prodi')")
    public  String listIPKMahasiswaProdi(@PathVariable String prodiId, @RequestParam(value = "angkatan", required = false) String angkatan) {
        return "Melihat list IPK Mahasiswa Prodi " + prodiId;
    }


}
