package com.laba.solvd.databases.parser;

import com.laba.solvd.databases.model.Album;
import com.laba.solvd.databases.model.Playlist;
import com.laba.solvd.databases.model.User;
import com.laba.solvd.databases.model.UserProfile;
import com.laba.solvd.databases.model.Wishlist;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import java.io.File;

import jakarta.xml.bind.Unmarshaller;
import java.util.List;
import javax.xml.transform.stream.StreamSource;


public class XMLParser {

  public User parseXML(String xmlFile) {
    try {

      File file = new File(xmlFile);
      JAXBContext jaxbContext = JAXBContext.newInstance(User.class, UserProfile.class, Playlist.class, Wishlist.class, Album.class);
      Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
      JAXBElement<User> jaxbElement = unmarshaller.unmarshal(new StreamSource(file), User.class);
      User user = jaxbElement.getValue();

      return user;
    } catch (jakarta.xml.bind.JAXBException e) {
      System.out.println("Failed to parse XML.");
      return null;
    }
  }



}
