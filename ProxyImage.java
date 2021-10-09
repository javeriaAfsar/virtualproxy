/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualProxy;

import VirtualProxy.Image;

/**
 *
 * @author JAVERIA
 */
public class ProxyImage implements Image {
    private RealImage realImage;
   private String fileName;
   private String format;
   private String size;

   public ProxyImage(String fileName,String format,String size){
      this.fileName = fileName;
      this.format=format;
      this.size=size;
   }

   @Override
   public void display() {
      if(realImage == null){
         realImage = new RealImage(fileName,format,size);
      }
      realImage.display();
   }
}
