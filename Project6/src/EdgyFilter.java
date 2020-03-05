// Filter that sharpens the edges in the image

public class EdgyFilter implements Filter 
{
  public void filter(PixelImage pi)
  {
    final int [][] weight = {{-1,-1,-1}, {-1,9,-1}, {-1,-1,-1}};
    final int scale = 1;
    
    Pixel[][] data = pi.weightedAverage(weight, scale);
    pi.setData(data);
  }
}
