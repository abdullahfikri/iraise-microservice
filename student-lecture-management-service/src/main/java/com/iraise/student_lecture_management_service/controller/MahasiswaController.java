package com.iraise.student_lecture_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-lecturer-management/mahasiswa")
public class MahasiswaController {

    @PostMapping()
    @PreAuthorize("hasAuthority('Input data mahasiswa baru')")
    public String createMahasiswa() {
        return "Created mahasiswa";
    }

    @GetMapping("/{mahasiswaId}")
    @PreAuthorize("hasAuthority('Melihat data mahasiswa')")
    public String getMahasiswaMahasiswa(@PathVariable("mahasiswaId") Long mahasiswaId) {
        return "Get data mahasiswa " + mahasiswaId;
    }

    @PutMapping("/{mahasiswaId}")
    @PreAuthorize("hasAuthority('Update data mahasiswa')")
    public String updateMahasiswa(@PathVariable("mahasiswaId") Long mahasiswaId) {
        return "Updated mahasiswa " + mahasiswaId;
    }

    @PutMapping("/{mahasiswaId}/repair")
    @PreAuthorize("hasAuthority('Memperbaiki data mahasiswa yang salah')")
    public String repairMahasiswa(@PathVariable Long mahasiswaId) {
        return "Repaired mahasiswa " + mahasiswaId;
    }

    @GetMapping()
    @PreAuthorize("hasAuthority('Melihat list mahasiswa di Universitas')")
    public String getMahasiswa( @RequestParam String angkatan){
        return "Get Mahasiswa angkatan " + angkatan;
    }

    @GetMapping("/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat list mahasiswa di Prodi')")
    public String getMahasiswaProdi(@PathVariable String prodiId, @RequestParam String angkatan){
        return "Get Mahasiswa prodi " + prodiId + ", angkatan: " + angkatan;
    }

    @GetMapping("/prodi/{prodiId}/kelas/{kelasId}")
    @PreAuthorize("hasAuthority('Melihat list mahasiswa perkelas')")
    public String getMahasiswaProdiPerkelas(@PathVariable String prodiId, @PathVariable String kelasId, @RequestParam String angkatan){
        return "Get Mahasiswa prodi " + prodiId + " kelas: " + kelasId + ", angkatan " + angkatan;
    }

    @GetMapping("/transfer/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat list mahasiswa transfer prodi')")
    public String getMahasiswaTransferProdi(@PathVariable String prodiId){
        return "Get Mahasiswa transfer prodi: " + prodiId;
    }

    @PostMapping("/transfer")
    @PreAuthorize("hasAuthority('Memproses mahasiswa transfer')")
    public String processMahasiswaTransfer(){
        return "Process Mahasiswa transfer";
    }

    @GetMapping("/status")
    @PreAuthorize("hasAuthority('Melihat list Status mahasiswa (Aktif, Cuti, Alpha, Drop Out, Tamat) Prodi')")
    public String getMahasiswaStatus(@RequestParam(required = false) String angkatan){
        return "Get Mahasiswa status angkatan: " + angkatan;
    }

    @GetMapping("/{mahasiswaId}/histori-pembayaran")
    @PreAuthorize("hasAuthority('Melihat riwayat pembayaran Kuliah mahasiswa')")
    public String getMahasiswaHistoryPembayaran(@PathVariable Long mahasiswaId){
        return "Get Mahasiswa history pembayaran";
    }




}
