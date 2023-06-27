package com.laba.solvd.databases.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.List;


@XmlRootElement(name = "User")
//@XmlAccessorType(XmlAccessType.NONE)
@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

  @XmlElement(name = "userId")
  @JsonProperty("userId")
  private Integer userId;

  @XmlElement
  @JsonProperty("Name")
  private String name;

  @XmlElement
  private String email;

  @XmlTransient
  private String password;

  @XmlElement(name = "userProfile")
  private UserProfile userProfile;

//  @XmlElementWrapper(name = "playlistList")
//  @XmlElement(name = "playlist")
//  private List<Playlist> playlistList;

  @XmlElement(name = "playlistList")
  private PlaylistList playlistList;

  @XmlElementWrapper(name = "wishlistList")
  @XmlElement(name = "wishlist")
  private List<Wishlist> wishlistList;



  public User() {
    playlistList = new PlaylistList();
  }

  public User(Integer id, String name, String email, String password) {
    this.userId = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public User(Integer id, String name, String email, String password,
      UserProfile userProfile,
      PlaylistList playlistList,
      List<Wishlist> wishlistList) {
    this.userId = id;
    this.name = name;
    this.email = email;
    this.password = password;
    this.userProfile = userProfile;
    this.playlistList = playlistList;
    this.wishlistList = wishlistList;
  }


  @JsonProperty("userId")
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  @JsonProperty("Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("Email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @JsonProperty("Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @JsonProperty("userProfile")
  public UserProfile getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
  }

  @JsonProperty("PlaylistsList")
  public PlaylistList getPlaylistList() {
    return playlistList;
  }



  public void setPlaylistList(PlaylistList playlistList) {
    this.playlistList = playlistList;
  }

  @JsonProperty("WishlistsList")
  public List<Wishlist> getWishlistList() {
    return wishlistList;
  }

  public void setWishlistList(List<Wishlist> wishlistList) {
    this.wishlistList = wishlistList;
  }


  @Override
  public String toString() {
    return "User{" +
        "id=" + userId +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", userProfile=" + userProfile +
        ", playlistList=" + playlistList +
        ", wishlistList=" + wishlistList +
        '}';
  }
}
