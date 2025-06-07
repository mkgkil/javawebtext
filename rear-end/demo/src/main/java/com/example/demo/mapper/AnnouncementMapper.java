package com.example.demo.mapper;

import com.example.demo.entity.Announcement;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
// 声明一个名为Announcement的接口
public interface AnnouncementMapper {
    @Select("SELECT * From announcement WHERE id = #{id}")
    List<Announcement> announcementSelect();
    @Update("UPDATE Set announcement SET content = #{content} WHERE id = #{id}")
    void updateAnnouncement(Announcement announcement);
    @Insert("insert into announcement(title, content, time) values(#{title}, #{content}, #{time}) ")
    void  addAnnouncement(Announcement announcement);
    void AnnouncementInsert(String title, String content, String time);
    @Delete("DELETE FROM announcement WHERE id = #{id}")
    void deleteAnnouncement(Announcement announcement);

}
