package com.iraise.performance_assessment_management_service.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-performance/mahasiswa")
public class MahasiswaController {

    @GetMapping("/{mahasiswaId}/transkrip")
    public String transkripMahasiswa(@PathVariable String mahasiswaId) {
        return "Transkrip Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/{mahasiswaId}/khs")
    public String khsMahasiswa(@PathVariable String mahasiswaId) {
        return "Khs Mahasiswa: " + mahasiswaId;
    }

    @PostMapping("/{mahasiswaId}/input-nilai")
    public String inputNilaiMahasiswa(@PathVariable String mahasiswaId) {
        return "Input Nilai Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/transkrip/prodi/{prodiId}/kelas/{kelasId}")
    public String transkripMahasiswaPerKelas(@PathVariable String prodiId, @PathVariable String kelasId) {
        return "Transkrip Mahasiswa Prodi: " + prodiId + ", Kelas: " + kelasId;
    }

    @GetMapping("/khs/prodi/{prodiId}/kelas/{kelasId}")
    public String khsMahasiswaPerKelas(@PathVariable String prodiId, @PathVariable String kelasId) {
        return "Khs Mahasiswa: " + prodiId + ", Kelas: " + kelasId;
    }

    @GetMapping("/prodi/{prodiId}/laporan/hapus-nilai")
    public String laporanHapusNilaiMahasiswaProdi(@PathVariable String prodiId) {
        return "Melihat laporan hapus nilai Mahasiswa  Prodi: " + prodiId;
    }

    @PostMapping("/prodi/{prodiId}/laporan/hapus-nilai/{hapusNilaiId}")
    public String processHapusNilaiMahasiswaProdi(@PathVariable String prodiId, @PathVariable String hapusNilaiId) {
        return "Mengelola hapus nilai  Mahasiswa Prodi: " + prodiId + ", Hapus id: " + hapusNilaiId;
    }

    @GetMapping("/prodi/{prodiId}/status")
    public String chartKuliahMahasiswaProdi(@PathVariable String prodiId, @RequestParam("status-kuliah") String statusKuliah) {
        return "Grafik kuliah mahasiswa Prodi: " + prodiId;
    }

    @PostMapping("/{mahasiswaId}/krs")
    public String fillKRSMahasiswa(@PathVariable String mahasiswaId) {
        return "Melakukan pengisian KRS Mahasiswa: " + mahasiswaId;
    }

    @GetMapping("/{mahasiswaId}/krs")
    public String historyKRSMahasiswa(@PathVariable String mahasiswaId) {
        return "Melihat riwayat KRS mahasiswa " + mahasiswaId;
    }

    @GetMapping("/krs/prodi/{prodiId}/status?status-isi")
    public String chartIsiKRSMahasiswaProdi(@PathVariable String prodiId, @RequestParam("status-isi") String statusIsi) {
        return "Grafik mahasiswa yang sudah melakukan pengisian KRS di Prodi: " + prodiId;
    }

    @GetMapping("/krs/prodi/{prodiId}/status")
    public String listMahasiswaIsiKRS(@PathVariable String prodiId) {
        return "Melihat rekap mahasiswa isi krs prodi: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/list/IP")
    public String listIPMahasiswaProdi(@PathVariable String prodiId, @RequestParam(value = "angkatan", required = false) String angkatan) {
        return "Melihat list IP Mahasiswa Prodi " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/list/IPK")
    public  String listIPKMahasiswaProdi(@PathVariable String prodiId, @RequestParam(value = "angkatan", required = false) String angkatan) {
        return "Melihat list IPK Mahasiswa Prodi " + prodiId;
    }


}
