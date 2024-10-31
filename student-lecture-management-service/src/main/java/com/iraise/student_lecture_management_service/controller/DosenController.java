package com.iraise.student_lecture_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-lecturer-management/dosen")
public class DosenController {

    @GetMapping("")
    @PreAuthorize("hasAuthority('Melihat list seluruh dosen di universitas')")
    public String dosen(){
        return "dosen university";
    }

    @GetMapping("/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Melihat list seluruh dosen di prodi')")
    public String dosenProdi(@PathVariable("prodiId") Long prodiId){
        return "dosen prodi";
    }

    @PostMapping("")
    @PreAuthorize("hasAuthority('Menginput/mengelola data dosen')")
    public String createDosen(){
        return "created dosen university";
    }

    @GetMapping("/{dosenId}")
    @PreAuthorize("hasAuthority('Menginput/mengelola data dosen')")
    public String findDosen(@PathVariable("dosenId") Long dosenId){
        return "find dosen university";
    }

    @PutMapping("/{dosenId}")
    @PreAuthorize("hasAuthority('Menginput/mengelola data dosen')")
    public String updateDosen(@PathVariable("dosenId") Long dosenId){
        return "updated dosen university";
    }

    @GetMapping("/prodi/{prodiId}/status")
    @PreAuthorize("hasAuthority('Melihat list dosen aktif prodi')")
    public String findDosenActiveStatusProdi(@PathVariable("prodiId") Long prodiId){
        return "find dosen status Prodi";
    }

    @PostMapping("/prodi/{prodiId}/pembimbing-akademik")
    @PreAuthorize("hasAuthority('Menetapkan mahasiswa untuk Pembimbing akademik')")
    public String providePembimbingAkademik(@PathVariable("prodiId") Long prodiId){
        return "provide pembimbing akademik prodi: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/pembimbing-akademik")
    @PreAuthorize("hasAuthority('Melihat list PA dan mahasiswa bimbingannya prodi')")
    public String findListPembimbingAkademik(@PathVariable("prodiId") Long prodiId){
        return "find list pembimbing akademik prodi: " + prodiId;
    }

    @GetMapping("/{dosenId}/prodi/{prodiId}/pembimbing-akademik")
    @PreAuthorize("hasAuthority('List Histori Mahasiswa Bimbingan Akademik Dosen')")
    public String findHistoryDosenPembimbingAkademik(@PathVariable("dosenId") Long dosenId, @PathVariable("prodiId") Long prodiId){
        return "Find history mahasiswa bimbingan dosen:" + dosenId + " prodi: " + prodiId;
    }

    @GetMapping("/{dosenId}/kelas")
    @PreAuthorize("hasAuthority('Melihat Histori Kelas Dosen')")
    public String findHistoryKelasDosen(@PathVariable("dosenId") Long dosenId){
        return "find history kelas dosen: " + dosenId;
    }

    @GetMapping("/{dosenId}/riwayat-pendidikan")
    @PreAuthorize("hasAuthority('Melihat dan mengelola riwayat pendidikan dosen')")
    public String findHistoryPendidikanDosen(@PathVariable("dosenId") Long dosenId){
        return "find history pendidikan dosen: " + dosenId;
    }

    @PostMapping("/{dosenId}/riwayat-pendidikan")
    @PreAuthorize("hasAuthority('Melihat dan mengelola riwayat pendidikan dosen')")
    public String createHistoryPendidikan(@PathVariable("dosenId") Long dosenId){
        return "created history pendidikan dosen: " + dosenId;
    }

    @PutMapping("/{dosenId}/riwayat-pendidikan")
    @PreAuthorize("hasAuthority('Melihat dan mengelola riwayat pendidikan dosen')")
    public String updateHistoryPendidikan(@PathVariable("dosenId") Long dosenId){
        return "updated history pendidikan dosen: " + dosenId;
    }





}
