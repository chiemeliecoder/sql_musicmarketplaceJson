package com.laba.solvd.databases.model;

import java.util.List;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "playlistList")
@XmlAccessorType(XmlAccessType.FIELD)
public class PlaylistList {

  @XmlElement(name = "playlist")
  private List<Playlist> playlists;

  public List<Playlist> getPlaylists() {
    return playlists;
  }

  public void setPlaylists(List<Playlist> playlists) {
    this.playlists = playlists;
  }

  @Override
  public String toString() {
    return "PlaylistList{" +
        "playlists=" + playlists +
        '}';
  }
}
