package com.iraise.user_identity_management_service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-identity-management/account")
public class AccountController {
    @GetMapping("/profile/{username}")
    @ResponseBody
    @PreAuthorize("hasAuthority('Mengelola Profil Diri (Melihat Profil Diri)')")
    public String profile(@PathVariable String username) {
        return "Hello " + username;
    }

    @PutMapping("/profile/{username}")
    @ResponseBody
    @PreAuthorize("hasAuthority('Mengelola Profil Diri (Mengubah Profil Diri)')")
    public String updateProfile(@PathVariable String username) {
        return "Hello " + username;
    }

    @PostMapping("/change-password/{username}")
    @PreAuthorize("hasAuthority('Mengubah Password Akun')")
    public String changePassword(@PathVariable String username) {
        return "Password " + username + " has been changed";
    }

    @PostMapping("/forgot-password")
    public String forgotPassword() {
        return "Success recovery the password";
    }

    @PostMapping("/forgot-password/{username}")
    @PreAuthorize("hasAuthority('Pemulihan Akun/Password Pejabat')")
    public String forgotPassword(@PathVariable String username) {
        return "Success recovery the password pejabat";
    }

    @GetMapping("/akademik")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat list akun akademik)')")
    public String manageListAkademikAccount() {
        return "List akademik account";
    }

    @PostMapping("/akademik")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Membuat akun akademik)')")
    public String manageAkademikAccount() {
        return "Create akademik account";
    }

    @PutMapping("/akademik/{userId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Mengupdate akun akademik)')")
    public String updateAkademikAccount(@PathVariable String userId) {
        return "Update akademik account by id: " + userId;
    }

    @GetMapping("/akademik/{userId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat akun akademik)')")
    public String getAkademikAccount(@PathVariable String userId) {
        return "Get akademik account by id: " + userId;
    }

    @GetMapping("/prodi/{prodiId}/user/{userId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat akun prodi)')")
    public String getProdiAccount(@PathVariable String userId , @PathVariable String prodiId) {
        return "Get prodi account by id: " + userId + " and prodi id: " + prodiId;
    }

    @PutMapping("/prodi/{prodiId}/user/{userId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Mengupdate akun prodi)')")
    public String updateProdiAccount(@PathVariable String userId , @PathVariable String prodiId) {
        return "Update prodi account by id: " + userId + " and prodi id: " + prodiId;
    }

    @GetMapping("/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat list akun prodi)')")
    public String getListProdiAccount(@PathVariable String prodiId) {
        return "Get list prodi prodi by id: " + prodiId;
    }

    @PostMapping("/prodi")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Membuat akun prodi)')")
    public String createProdiAccount() {
        return "Create prodi account";
    }

    @GetMapping("/mahasiswa/{mahasiswaId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat akun mahasiswa)')")
    public String getMahasiswaAccount(@PathVariable String mahasiswaId) {
        return "Get mahasiswa account by id: " + mahasiswaId;
    }

    @PutMapping("/mahasiswa/{mahasiswaId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Mengupdate akun mahasiswa)')")
    public String updateMahasiswaAccount(@PathVariable String mahasiswaId) {
        return "Update mahasiswa account by id: " + mahasiswaId;
    }

    @GetMapping("/mahasiswa/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat list akun mahasiswa di prodi)')")
    public String getListMahasiswaAccountByProdi(@PathVariable String prodiId) {
        return "Get list mahasiswa account by id: " + prodiId;
    }

    @PostMapping("/mahasiswa")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Membuat akun mahasiswa)')")
    public String createMahasiswaAccount() {
        return "Create mahasiswa account";
    }

    @PostMapping("/dosen")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Membuat akun dosen)')")
    public String createDosenAccount() {
        return "Create dosen account";
    }

    @GetMapping("/dosen/{dosenId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat akun dosen)')")
    public String getDosenAccount(@PathVariable String dosenId) {
        return "Get dosen account by id: " + dosenId;
    }
    @PutMapping("/dosen/{dosenId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Mengupdate akun dosen)')")
    public String updateDosenAccount(@PathVariable String dosenId) {
        return "Update dosen account by id: " + dosenId;
    }

    @GetMapping("/dosen/prodi/{prodiId}")
    @PreAuthorize("hasAuthority('Mengelola Seluruh Akun di IRaise (Melihat list akun dosen di prodi)')")
    public String getListDosenAccountByProdi(@PathVariable String prodiId) {
        return "Get list dosen account by prodi id: " + prodiId;
    }






}
