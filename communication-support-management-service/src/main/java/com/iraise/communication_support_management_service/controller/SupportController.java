package com.iraise.communication_support_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communication-support")
public class SupportController {
    @PostMapping("/layanan-aduan")
    public String requestLayananAduan(){
        return "Layanan Aduan";
    }

    @PostMapping("/layanan-aduan/proses")
    public String prosesRequestLayananAduan(){
        return "Memproses pengajuan Layanan Aduan";
    }

    @GetMapping("/tutorial/download/{level}")
    public String downloadTutorial(@PathVariable("level") String level){
        return "Tutorial Download Iraise " + level ;
    }
}
