//Filter that masks blurred images

public class UnsharpMasking implements Filter 
{
  public void filter(PixelImage pi) 
  {
    final int [][] weight = {{-1,-2,-1}, {-2,28,-2}, {-1,-2,-1}};
    final int scale = 16;
    
    Pixel[][] data = pi.weightedAverage(weight,scale);
    pi.setData(data);
  }
}
