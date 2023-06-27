package com.laba.solvd.databases.parser;

import com.laba.solvd.databases.model.Album;
import com.laba.solvd.databases.model.Playlist;
import com.laba.solvd.databases.model.User;
import com.laba.solvd.databases.model.UserProfile;
import com.laba.solvd.databases.model.Wishlist;
import jakarta.xml.bind.JAXBContext;
import java.io.File;

import jakarta.xml.bind.Unmarshaller;



public class XMLParser {
  public User parseXML(File xmlFile) {
    try {


      JAXBContext jaxbContext = JAXBContext.newInstance(User.class, UserProfile.class, Playlist.class, Wishlist.class, Album.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      User user = (User) unmarshaller.unmarshal(xmlFile);

      return user;
    } catch (jakarta.xml.bind.JAXBException e) {
      e.printStackTrace();
      return null;
    }
  }

//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//  xsi:noNamespaceSchemaLocation="musicdata.xsd"




}
