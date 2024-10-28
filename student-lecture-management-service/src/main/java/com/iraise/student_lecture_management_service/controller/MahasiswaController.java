package com.iraise.student_lecture_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-lecturer-management/mahasiswa")
public class MahasiswaController {

    @PostMapping()
    public String createMahasiswa() {
        return "Created mahasiswa";
    }

    @GetMapping("/{mahasiswaId}")
    public String getMahasiswaMahasiswa(@PathVariable("mahasiswaId") Long mahasiswaId) {
        return "Get data mahasiswa " + mahasiswaId;
    }

    @PutMapping("/{mahasiswaId}")
    public String updateMahasiswa(@PathVariable("mahasiswaId") Long mahasiswaId) {
        return "Updated mahasiswa " + mahasiswaId;
    }

    @PutMapping("/{mahasiswaId}/repair")
    public String repairMahasiswa(@PathVariable Long mahasiswaId) {
        return "Repaired mahasiswa " + mahasiswaId;
    }

    @GetMapping()
    public String getMahasiswa( @RequestParam String angkatan){
        return "Get Mahasiswa angkatan " + angkatan;
    }

    @GetMapping("/prodi/{prodiId}")
    public String getMahasiswaProdi(@PathVariable String prodiId, @RequestParam String angkatan){
        return "Get Mahasiswa prodi " + prodiId + ", angkatan: " + angkatan;
    }

    @GetMapping("/prodi/{prodiId}/kelas/{kelasId}")
    public String getMahasiswaProdiPerkelas(@PathVariable String prodiId, @PathVariable String kelasId, @RequestParam String angkatan){
        return "Get Mahasiswa prodi " + prodiId + " kelas: " + kelasId + ", angkatan " + angkatan;
    }

    @GetMapping("/transfer/{prodiId}")
    public String getMahasiswaTransferProdi(@PathVariable String prodiId){
        return "Get Mahasiswa transfer prodi: " + prodiId;
    }

    @PostMapping("/transfer")
    public String processMahasiswaTransfer(){
        return "Process Mahasiswa transfer";
    }

    @GetMapping("/status")
    public String getMahasiswaStatus(@RequestParam(required = false) String angkatan){
        return "Get Mahasiswa status angkatan: " + angkatan;
    }

    @GetMapping("/{mahasiswaId}/histori-pembayaran")
    public String getMahasiswaHistoryPembayaran(@PathVariable Long mahasiswaId){
        return "Get Mahasiswa history pembayaran";
    }




}
