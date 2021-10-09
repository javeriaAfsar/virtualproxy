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
public class RealImage implements Image{
    private String fileName;
   private String format;
   private String size;
   public RealImage(String fileName,String format,String size){
      this.fileName = fileName;
      this.format=format;
      this.size=size;
      loadFromDisk(fileName);
   }

    

   @Override
   public void display() {
      System.out.println("Displaying " + fileName+"\nformat: "+format+"\nSize: "+size);
   }

   private void loadFromDisk(String fileName){
      System.out.println("Loading " + fileName);
   }
    
}
