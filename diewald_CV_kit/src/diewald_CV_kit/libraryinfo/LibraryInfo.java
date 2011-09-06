/**
 * diewald_CV - Computer Vision - Processing Library.
 * 
 * this processing-library provides simple tools needed in computer-vision.
 * 
 * 
 * Copyright (c) 2011 Thomas Diewald
 *
 *
 * This source is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This code is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 * 
 * A copy of the GNU General Public License is available on the World
 * Wide Web at <http://www.gnu.org/copyleft/gpl.html>. You can also
 * obtain it by writing to the Free Software Foundation,
 * Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA.
 */


package diewald_CV_kit.libraryinfo;
/**
 * 
 * some information about the library
 * 
 * @author thomas diewald (c) 2011
 *
 */
public final class LibraryInfo {
  
  private static final String DATE_    = "sept 2011";
  private static final String AUTHOR_  = "thomas diewald";
  private static final String NAME_    = "diewald_CV_kit";
  private static final String VERSION_ = "v1.00";
  
  private LibraryInfo(){
  }
  
  
  static{
    System.out.println("\nprocessing library: "+NAME_ +" - "+ VERSION_+"\n");
  }

  public static final String date(){
    return DATE_;
  }
  public static final String author(){
    return AUTHOR_;
  }
  public static final String name(){
    return NAME_;
  }
  public static final String version(){
    return VERSION_;
  }

  
}
