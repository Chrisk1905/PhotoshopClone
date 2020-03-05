// Filter that blurs the image

public class GaussianFilter implements Filter 
{
  public void filter(PixelImage pi) 
  {
    final int [][] weight = {{1,2,1}, {2,4,2}, {1,2,1}};
    final int scale = 16;
    
    Pixel[][] data = pi.weightedAverage(weight, scale);
    pi.setData(data);
  }
}
