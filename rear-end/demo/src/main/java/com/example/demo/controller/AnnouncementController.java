package com.example.demo.controller;

import com.example.demo.Service.AnnouncementService;
import com.example.demo.entity.Announcement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class AnnouncementController {
    @Autowired
    private AnnouncementService announcementService;
    @GetMapping("/announcementSelect")
    public List<Announcement> Select(){
        return announcementService.announcementSelect();
    }
    @PostMapping("/announcement add")
    public void add(Announcement announcement){
        announcementService.announcementadd(announcement);
    }
    @DeleteMapping("/announcement delete")
    public void delete(Announcement announcement){
        announcementService.announcementdelete(announcement);
    }
    @PutMapping("/announcement update")
    public void update(Announcement announcement){
        announcementService.announcementupdate(announcement);
    }
}