package com.laba.solvd.databases.model;

import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


//@XmlRootElement(name = "playlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class Playlist {

  @XmlElement(name = "playlistid")
  private Integer playlistid;

  @XmlElement(name = "playlistName")
  private String playlistName;



  public Playlist() {
  }

  public Playlist(Integer id, String playlistName) {
    this.playlistid = id;
    this.playlistName = playlistName;
  }

  public Integer getPlaylistid() {
    return playlistid;
  }

  public void setPlaylistid(Integer playlistid) {
    this.playlistid = playlistid;
  }

  public String getPlaylistName() {
    return playlistName;
  }

  public void setPlaylistName(String playlistName) {
    this.playlistName = playlistName;
  }


  @Override
  public String toString() {
    return "Playlist{" +
        "playlistid=" + playlistid +
        ", playlistName='" + playlistName + '\'' +
        '}';
  }
}
