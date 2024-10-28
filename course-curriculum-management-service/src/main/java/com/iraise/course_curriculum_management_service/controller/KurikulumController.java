package com.iraise.course_curriculum_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/academic-courses/kurikulum")
public class KurikulumController {

    @GetMapping("/prodi/{prodiId}")
    public String getListKurikulum(@PathVariable("prodiId") Long prodiId, @RequestParam String tahun) {
        return "List Kurikulum prodi: " + prodiId + " .Tahun: " + tahun;
    }

    @PostMapping("")
    public String createKurikulum() {
        return "Created kurikulum prodi";
    }

    @GetMapping("/{kurikulumId}")
    public String getKurikulum(@PathVariable("kurikulumId") String kurikulumId) {
        return "Get kurikulum: " + kurikulumId ;
    }

    @PutMapping("/{kurikulumId}")
    public String editKurikulum(@PathVariable("kurikulumId") String kurikulumId) {
        return "Update kurikulum: " + kurikulumId ;
    }



}
