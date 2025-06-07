package com.example.demo.Service.Impl;

import com.example.demo.Service.AnnouncementService;
import com.example.demo.entity.Announcement;
import com.example.demo.mapper.AnnouncementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnouncementServiceImpl implements AnnouncementService {
    @Autowired
    private AnnouncementMapper announcementMapper;
    @Override
    public List<Announcement> announcementSelect(){
        return announcementMapper.announcementSelect();
    }
    @Override
    public void announcementadd(Announcement announcement) {
        announcementMapper.addAnnouncement(announcement); ;
    }
    @Override
    public void announcementdelete(Announcement announcement) {
        announcementMapper.deleteAnnouncement(announcement);
    }
    @Override
    public void announcementupdate(Announcement announcement) {
        announcementMapper.updateAnnouncement(announcement);
    }
}
