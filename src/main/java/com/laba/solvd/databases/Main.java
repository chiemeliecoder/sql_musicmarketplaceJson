package com.laba.solvd.databases;

import com.laba.solvd.databases.model.Album;
import com.laba.solvd.databases.model.Playlist;
import com.laba.solvd.databases.model.PlaylistList;
import com.laba.solvd.databases.model.User;
import com.laba.solvd.databases.model.UserProfile;
import com.laba.solvd.databases.model.Wishlist;
import com.laba.solvd.databases.parser.JsonParser;
import com.laba.solvd.databases.parser.XMLParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.xml.stream.XMLStreamException;
import org.apache.log4j.Logger;

public class Main {
  private static final Logger logger = Logger.getLogger(Main.class);

  public static void main(String args[]) throws FileNotFoundException, XMLStreamException {



    try {
      String jsonFilePath = "src/main/resources/musicdata.json";

      User user = JsonParser.parseJsonFile(jsonFilePath);

      // Access the parsed user object and perform operations
      System.out.println(user.getName());
      System.out.println(user.getEmail());
      System.out.println(user.getPassword());
      System.out.println(user.getUserProfile().getBio());
      System.out.println(user.getUserProfile().getLocation());
      System.out.println(user.getUserProfile().getProfileimage());
      System.out.println(user.getPlaylistList().getPlaylists());
      System.out.println(user.getWishlistList());
//      System.out.println(user.getWishlistList().get(0).getAlbumList().get(0).getAlbumName());
    } catch (IOException e) {
      e.printStackTrace();
    }

    logger.info("Jaxb Parser Results:");

    String xmlFile = "src/main/resources/musicdata.xml";
    XMLParser xmlParser = new XMLParser();
    User user = xmlParser.parseXML(xmlFile);

//    PlaylistList playlistList = new PlaylistList();

    Integer UserId = user.getUserId();
    String name = user.getName();
    String email = user.getEmail();
    String password = user.getPassword();
    UserProfile userProfile = user.getUserProfile();
    PlaylistList playlistList = user.getPlaylistList();
    List<Wishlist> wishlistList = user.getWishlistList();
    

    System.out.println("User ID:" + UserId);
    System.out.println("User Name:" + name);
    System.out.println("User Email:" + email);
    System.out.println("User Password:" + password);
    System.out.println("User Profile:" + userProfile);
    System.out.println("Playlist: " + playlistList);



    if (playlistList != null) {
      List<Playlist> playlists = playlistList.getPlaylists();
      if (playlists != null) {
        for (Playlist playlist : playlists) {
          Integer playlistId = playlist.getPlaylistid();
          String playlistName = playlist.getPlaylistName();
          System.out.println("Playlist ID: " + playlistId);
          System.out.println("Playlist Name: " + playlistName);
        }
      }
    }


    for (Wishlist wishlist:wishlistList) {
      System.out.println("Wishlist id:" + wishlist.getId());
      System.out.println("Wishlist Name:"+ wishlist.getName());
      System.out.println("Album List:" + wishlist.getAlbumList());
    }



    logger.info("end of information");




  }

}
