package com.iraise.communication_support_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communication-support")
public class SupportController {
    @PostMapping("/layanan-aduan")
    @PreAuthorize("hasAnyAuthority('Layanan Aduan')")
    public String requestLayananAduan(){
        return "Layanan Aduan";
    }

    @PostMapping("/layanan-aduan/proses")
    @PreAuthorize("hasAnyAuthority('Memproses pengajuan Layanan Aduan')")
    public String prosesRequestLayananAduan(){
        return "Memproses pengajuan Layanan Aduan";
    }

    @GetMapping("/tutorial/download/{level}")
    @PreAuthorize("hasAuthority('Mendownload tutorial penggunaan iRaise')")
    public String downloadTutorial(@PathVariable("level") String level){
        return "Tutorial Download Iraise " + level ;
    }
}
