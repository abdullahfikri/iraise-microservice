package com.iraise.student_lecture_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-lecturer-management/dosen")
public class DosenController {

    @GetMapping("")
    public String dosen(){
        return "dosen university";
    }

    @GetMapping("/prodi/{prodiId}")
    public String dosenProdi(@PathVariable("prodiId") Long prodiId){
        return "dosen prodi";
    }

    @PostMapping("")
    public String createDosen(){
        return "created dosen university";
    }

    @GetMapping("/{dosenId}")
    public String findDosen(@PathVariable("dosenId") Long dosenId){
        return "find dosen university";
    }

    @PutMapping("/{dosenId}")
    public String updateDosen(@PathVariable("dosenId") Long dosenId){
        return "updated dosen university";
    }

    @GetMapping("/prodi/{prodiId}/status")
    public String findDosenActiveStatusProdi(@PathVariable("prodiId") Long prodiId){
        return "find dosen status Prodi";
    }

    @PostMapping("/prodi/{prodiId}/pembimbing-akademik")
    public String providePembimbingAkademik(@PathVariable("prodiId") Long prodiId){
        return "provide pembimbing akademik prodi: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}/pembimbing-akademik")
    public String findListPembimbingAkademik(@PathVariable("prodiId") Long prodiId){
        return "find list pembimbing akademik prodi: " + prodiId;
    }

    @GetMapping("/{dosenId}/prodi/{prodiId}/pembimbing-akademik")
    public String findHistoryDosenPembimbingAkademik(@PathVariable("dosenId") Long dosenId, @PathVariable("prodiId") Long prodiId){
        return "Find history mahasiswa bimbingan dosen:" + dosenId + " prodi: " + prodiId;
    }

    @GetMapping("/{dosenId}/kelas")
    public String findHistoryKelasDosen(@PathVariable("dosenId") Long dosenId){
        return "find history kelas dosen: " + dosenId;
    }

    @GetMapping("/{dosenId}/riwayat-pendidikan")
    public String findHistoryPendidikanDosen(@PathVariable("dosenId") Long dosenId){
        return "find history pendidikan dosen: " + dosenId;
    }

    @PostMapping("/{dosenId}/riwayat-pendidikan")
    public String createHistoryPendidikan(@PathVariable("dosenId") Long dosenId){
        return "created history pendidikan dosen: " + dosenId;
    }

    @PutMapping("/{dosenId}/riwayat-pendidikan")
    public String updateHistoryPendidikan(@PathVariable("dosenId") Long dosenId){
        return "updated history pendidikan dosen: " + dosenId;
    }





}
