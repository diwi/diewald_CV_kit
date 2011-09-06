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

package diewald_CV_kit.blobdetection;

import java.util.ArrayList;


/**
*
* used for calculating the blobs.<br>
* 
* 
* @author thomas diewald (c) 2011
*
*/
public final class PixelRow {

  protected final int y_;  // y position of the row
  protected final int xs_; // row start 
  protected int xe_;       // row end
  
  protected final ArrayList<PixelRow> top_rows_    = new ArrayList<PixelRow>(3);
  protected final ArrayList<PixelRow> bottom_rows_ = new ArrayList<PixelRow>(3);
  private PixelRow last_added_ = null;
  protected Blob blob_;
  
  protected PixelRow(int x, int y){ 
    y_ = y;
    xs_ = xe_ = x;
  }
 
  protected final void addTopRow(PixelRow top_row){
    if( last_added_ != top_row){
      last_added_ = top_row;
      top_rows_.add(top_row);
      top_row.bottom_rows_.add(this);
    }
  }
  
  protected final void linkWithBlob(Blob blob){
    if( blob_ != null )
      return;
    blob_ = blob;

    blob_.addPixelRow(this);
    
    for(int i = 0; i < top_rows_   .size(); i++ ) top_rows_   .get(i).linkWithBlob(blob);
    for(int i = 0; i < bottom_rows_.size(); i++ ) bottom_rows_.get(i).linkWithBlob(blob); 
  }
  
  
  protected final Blob getBlob(){
    return blob_;
  }
  
  /**
   * returns the start x-position of the pixelrow.
   * @return the start x-position of the pixelrow.
   */
  public final int getStartX(){
    return xs_;
  }
  /**
   * returns the end x-position of the pixelrow.
   * @return the end x-position of the pixelrow.
   */
  public final int getEndX(){
    return xe_;
  }
  /**
   * returns the y-position of the pixelrow.
   * @return the y-position of the pixelrow.
   */
  public final int getY(){
    return y_;
  }
}
