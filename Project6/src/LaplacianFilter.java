// Filter that highlights edges

public class LaplacianFilter implements Filter
{
  public void filter(PixelImage pi)
  {
    final int [][] weight = {{-1,-1,-1}, {-1,8,-1}, {-1,-1,-1}};
    final int scale = 1;
    
    Pixel[][] data = pi.weightedAverage(weight, scale);
    pi.setData(data);
  }
}
