package com.iraise.course_curriculum_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-courses/mata-kuliah")
public class MataKuliahController {
    @PostMapping()
    @PreAuthorize("hasAuthority('Mengelola matakuliah prodi (Membuat matakuliah)')")
    public String createMataKuliah(){
        return "Created Mata Kuliah";
    }

    @PutMapping("/{mataKuliahId}")
    @PreAuthorize("hasAuthority('Mengelola matakuliah prodi (Mengupdate matakuliah)')")
    public String updateMataKuliah(@PathVariable String mataKuliahId){
        return "Updated Mata Kuliah";
    }

    @GetMapping("/{mataKuliahId}")
    @PreAuthorize("hasAuthority('Mengelola matakuliah prodi (Melihat matakuliah)')")
    public String getMataKuliah(@PathVariable String mataKuliahId){
        return "Mata Kuliah Id: "+mataKuliahId;
    }

    @GetMapping("/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat list mata kuliah prodi')")
    public String getMataKuliahProdi(@PathVariable String prodiId){
        return "List Mata Kuliah Prodi, Id: "+prodiId;
    }

    @PostMapping("/{mataKuliahId}/kelas")
    @PreAuthorize("hasAuthority('Mengelola kelas prodi (Membuat kelas kuliah)')")
    public String createdMataKuliahKelas(@PathVariable String mataKuliahId){
        return "Created Kelas Kuliah, Id matakuliah: "+mataKuliahId;
    }

    @PutMapping("/{mataKuliahId}/kelas/{kelasId}")
    @PreAuthorize("hasAuthority('Mengelola kelas prodi (Mengupdate kelas kuliah)')")
    public String updatedMataKuliahKelas(@PathVariable String mataKuliahId, @PathVariable String kelasId){
        return "Updated Kelas kuliah, kelas Id: "+kelasId;
    }

    @GetMapping("/{mataKuliahId}/kelas/{kelasId}")
    @PreAuthorize("hasAuthority('Mengelola kelas prodi (Melihat kelas kuliah)')")
    public String getMataKuliahKelas(@PathVariable String mataKuliahId, @PathVariable String kelasId){
        return "Kelas Kuliah Kelas Id: "+kelasId;
    }

    @GetMapping("/kelas/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat kelas kuliah prodi')")
    public String getMataKuliahKelasProdi(@PathVariable String prodiId){
        return "List Kelas Kuliah Prodi Id: "+prodiId;
    }

    @GetMapping("/jadwal/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat Jadwal Kuliah Prodi')")
    public String getJadwalMataKuliahProdi(@PathVariable String prodiId){
        return "List Jadwal Kuliah Prodi Id: "+prodiId;
    }

    @GetMapping("/jadwal/dosen/{dosenId}")
    @PreAuthorize("hasAuthority('Melihat Jadwal Kuliah Dosen')")
    public String getJadwalMataKuliahDosen(@PathVariable String dosenId){
        return "List Jadwal Dosen Id: "+dosenId;
    }

    @GetMapping("/jadwal/mahasiswa/{mahasiswaId}")
    @PreAuthorize("hasAuthority('Melihat Jadwal Kuliah Mahasiswa')")
    public String getJadwalMataKuliahMahasiswa(@PathVariable String mahasiswaId){
        return "List Jadwal Mahasiswa Id: "+mahasiswaId;
    }

    @GetMapping("/jadwal/prodi/download/{format}")
    @PreAuthorize("hasAuthority('Export Excel & PDF jadwal mata kuliah (Download Jadwal kuliah yang ada pada Prodi)')")
    public String getDownloadJadwalMataKuliahProdi(@PathVariable String format){
        return "Download Jadwal Prodi Format: "+format;
    }

    @GetMapping("/jadwal/dosen/download/{format}")
    @PreAuthorize("hasAuthority('Export Excel & PDF jadwal mata kuliah (Download Jadwal kuliah yang ada pada Dosen)')")
    public String getDownloadJadwalMataKuliahDosen(@PathVariable String format){
        return "Download Jadwal Dosen Format: "+format;
    }

    @GetMapping("/jadwal/mahasiswa/download/{format}")
    @PreAuthorize("hasAuthority('Export Excel & PDF jadwal mata kuliah (Download Jadwal kuliah yang ada pada Mahasiswa)')")
    public String getDownloadMataKuliahMahasiswa(@PathVariable String format){
        return "Download Jadwal Mahasiswa Format: "+format;
    }


}
