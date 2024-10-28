package com.iraise.course_curriculum_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-courses/mata-kuliah")
public class MataKuliahController {
    @PostMapping()
    public String createMataKuliah(){
        return "Created Mata Kuliah";
    }

    @PutMapping("/{mataKuliahId}")
    public String updateMataKuliah(@PathVariable String mataKuliahId){
        return "Updated Mata Kuliah";
    }

    @GetMapping("/{mataKuliahId}")
    public String getMataKuliah(@PathVariable String mataKuliahId){
        return "Mata Kuliah Id: "+mataKuliahId;
    }

    @GetMapping("/prodi/{prodiId}")
    public String getMataKuliahProdi(@PathVariable String prodiId){
        return "List Mata Kuliah Prodi, Id: "+prodiId;
    }

    @PostMapping("/{mataKuliahId}/kelas")
    public String createdMataKuliahKelas(@PathVariable String mataKuliahId){
        return "Created Kelas Kuliah, Id matakuliah: "+mataKuliahId;
    }

    @PutMapping("/{mataKuliahId}/kelas/{kelasId}")
    public String updatedMataKuliahKelas(@PathVariable String mataKuliahId, @PathVariable String kelasId){
        return "Updated Kelas kuliah, kelas Id: "+kelasId;
    }

    @GetMapping("/{mataKuliahId}/kelas/{kelasId}")
    public String getMataKuliahKelas(@PathVariable String mataKuliahId, @PathVariable String kelasId){
        return "Kelas Kuliah Kelas Id: "+kelasId;
    }

    @GetMapping("/kelas/prodi/{prodiId}")
    public String getMataKuliahKelasProdi(@PathVariable String prodiId){
        return "List Kelas Kuliah Prodi Id: "+prodiId;
    }

    @GetMapping("/jadwal/prodi/{prodiId}")
    public String getJadwalMataKuliahProdi(@PathVariable String prodiId){
        return "List Jadwal Kuliah Prodi Id: "+prodiId;
    }

    @GetMapping("/jadwal/dosen/{dosenId}")
    public String getJadwalMataKuliahDosen(@PathVariable String dosenId){
        return "List Jadwal Dosen Id: "+dosenId;
    }

    @GetMapping("/jadwal/mahasiswa/{mahasiswaId}")
    public String getJadwalMataKuliahMahasiswa(@PathVariable String mahasiswaId){
        return "List Jadwal Mahasiswa Id: "+mahasiswaId;
    }

    @GetMapping("/jadwal/prodi/download/{format}")
    public String getDownloadJadwalMataKuliahProdi(@PathVariable String format){
        return "Download Jadwal Prodi Format: "+format;
    }

    @GetMapping("/jadwal/dosen/download/{format}")
    public String getDownloadJadwalMataKuliahDosen(@PathVariable String format){
        return "Download Jadwal Dosen Format: "+format;
    }

    @GetMapping("/jadwal/mahasiswa/download/{format}")
    public String getDownloadMataKuliahMahasiswa(@PathVariable String format){
        return "Download Jadwal Mahasiswa Format: "+format;
    }


}
