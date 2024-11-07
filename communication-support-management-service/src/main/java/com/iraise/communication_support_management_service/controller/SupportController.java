package com.iraise.communication_support_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communication-support")
public class SupportController {
    @PostMapping("/layanan-aduan")
    @PreAuthorize("hasAnyAuthority('Membuat Aduan')")
    public String requestLayananAduan(){
        return "Membuat Aduan";
    }

    @PostMapping("/layanan-aduan/proses")
    @PreAuthorize("hasAnyAuthority('Memproses Aduan User')")
    public String prosesRequestLayananAduan(){
        return "Memproses Aduan User";
    }

    @GetMapping("/tutorial/download/{level}")
    @PreAuthorize("hasAuthority('Mendownload tutorial penggunaan iRaise')")
    public String downloadTutorial(@PathVariable("level") String level){
        return "Tutorial Download Iraise " + level ;
    }
}
