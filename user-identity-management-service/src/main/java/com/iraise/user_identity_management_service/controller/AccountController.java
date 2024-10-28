package com.iraise.user_identity_management_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-identity-management/account")
public class AccountController {
    @GetMapping("/profile/{username}")
    @ResponseBody
    public String profile(@PathVariable String username) {
        return "Hello " + username;
    }

    @PutMapping("/profile/{username}")
    @ResponseBody
    public String updateProfile(@PathVariable String username) {
        return "Hello " + username;
    }

    @PostMapping("/change-password/{username}")
    public String changePassword(@PathVariable String username) {
        return "Password " + username + " has been changed";
    }

    @PostMapping("/forgot-password")
    public String forgotPassword() {
        return "Success recovery the password";
    }

    @PostMapping("/forgot-password/{username}")
    public String forgotPassword(@PathVariable String username) {
        return "Success recovery the password pejabat";
    }

    @GetMapping("/akademik")
    public String manageListAkademikAccount() {
        return "List akademik account";
    }

    @PostMapping("/akademik")
    public String manageAkademikAccount() {
        return "Create akademik account";
    }

    @PutMapping("/akademik/{userId}")
    public String updateAkademikAccount(@PathVariable String userId) {
        return "Update akademik account by id: " + userId;
    }

    @GetMapping("/akademik/{userId}")
    public String getAkademikAccount(@PathVariable String userId) {
        return "Get akademik account by id: " + userId;
    }

    @GetMapping("/prodi/{prodiId}/user/{userId}")
    public String getProdiAccount(@PathVariable String userId , @PathVariable String prodiId) {
        return "Get prodi account by id: " + userId + " and prodi id: " + prodiId;
    }

    @PutMapping("/prodi/{prodiId}/user/{userId}")
    public String updateProdiAccount(@PathVariable String userId , @PathVariable String prodiId) {
        return "Update prodi account by id: " + userId + " and prodi id: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}")
    public String getListProdiAccount(@PathVariable String prodiId) {
        return "Get list prodi prodi by id: " + prodiId;
    }

    @PostMapping("/prodi")
    public String createProdiAccount() {
        return "Create prodi account";
    }

    @GetMapping("/mahasiswa/{mahasiswaId}")
    public String getMahasiswaAccount(@PathVariable String mahasiswaId) {
        return "Get mahasiswa account by id: " + mahasiswaId;
    }

    @PutMapping("/mahasiswa/{mahasiswaId}")
    public String updateMahasiswaAccount(@PathVariable String mahasiswaId) {
        return "Update mahasiswa account by id: " + mahasiswaId;
    }

    @GetMapping("/mahasiswa/prodi/{prodiId}")
    public String getListMahasiswaAccountByProdi(@PathVariable String prodiId) {
        return "Get list mahasiswa account by id: " + prodiId;
    }

    @PostMapping("/mahasiswa")
    public String createMahasiswaAccount() {
        return "Create mahasiswa account";
    }

    @PostMapping("/dosen")
    public String createDosenAccount() {
        return "Create dosen account";
    }

    @GetMapping("/dosen/{dosenId}")
    public String getDosenAccount(@PathVariable String dosenId) {
        return "Get dosen account by id: " + dosenId;
    }
    @PutMapping("/dosen/{dosenId}")
    public String updateDosenAccount(@PathVariable String dosenId) {
        return "Update dosen account by id: " + dosenId;
    }

    @GetMapping("/dosen/prodi/{prodiId}")
    public String getListDosenAccountByProdi(@PathVariable String prodiId) {
        return "Get list dosen account by prodi id: " + prodiId;
    }






}
