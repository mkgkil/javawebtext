package com.example.demo.Service;

import com.example.demo.entity.Announcement;
import com.example.demo.entity.User;

import java.util.List;

public interface AnnouncementService {

    List<Announcement> announcementSelect();

    void announcementupdate(Announcement announcement);

    void announcementadd(Announcement announcement);

    void announcementdelete(Announcement announcement);

}
