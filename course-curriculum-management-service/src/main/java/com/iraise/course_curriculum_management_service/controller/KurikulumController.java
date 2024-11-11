package com.iraise.course_curriculum_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-courses/kurikulum")
public class KurikulumController {

    @GetMapping("/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('List Kurikulum Prodi')")
    public String getListKurikulum(@PathVariable("prodiId") Long prodiId, @RequestParam String tahun) {
        return "List Kurikulum prodi: " + prodiId + " .Tahun: " + tahun;
    }

    @PostMapping("")
    @PreAuthorize("hasAuthority('Mengelola Kurikulum (Membuat kurikulum)')")
    public String createKurikulum() {
        return "Created kurikulum prodi";
    }

    @GetMapping("/{kurikulumId}")
    @PreAuthorize("hasAuthority('Mengelola Kurikulum (Melihat kurikulum)')")
    public String getKurikulum(@PathVariable("kurikulumId") String kurikulumId) {
        return "Get kurikulum: " + kurikulumId ;
    }

    @PutMapping("/{kurikulumId}")
    @PreAuthorize("hasAuthority('Mengelola Kurikulum (Mengupdate kurikulum)')")
    public String editKurikulum(@PathVariable("kurikulumId") String kurikulumId) {
        return "Update kurikulum: " + kurikulumId ;
    }



}
