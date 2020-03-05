/**
 * A class to configure the SnapShop application
 *
 * @author Chris Kim
 * @version 3/18/2019
 * 
 * 
 * Made changes to the PixelImage class to have a built-in methods weightedAverage() for weighted averages and 
 * limiter() to limit int values to 0-255. 
 * Some violation of DRY when iterating through RGB fields, but I couldn't come up with an elegant solution that felt 
 * more efficient or simpler to read.
 * 
 * Biggest surprise was that the in-place 3X3 transformation was harder than I initially thought. 
 * It took a while to realize that elements of the 2D array that were already traversed were transformed and 
 * affected the weighted average of the next pixel. I took the advice of the assignment notes and went with the 
 * 2nd 2D array solution. To my shock the UnsharpMasking filter was still having issues until I realized that
 * I copy pasted the theShop.addFilter() from the line above and only changed the description parameter and 
 * not the filter parameter. 
 * 
 * Biggest hurdle was starting the project, as I wanted to plan out an elegant design that would prevent me from having 
 * to change my code as the project went on. Once deadline day came and I was forced to start without the grand plan, and
 * I realized it's easier to run into problems than try to perceive of all them in advance. Especially as an inexperienced
 * developer.  
 * 
 */
public class SnapShopConfiguration
{
  /**
   * Method to configure the SnapShop.  Call methods like addFilter
   * and setDefaultFilename here.
   * @param theShop A pointer to the application
   */
  public static void configure(SnapShop theShop)
  {

    theShop.setDefaultFilename("/Users/chris/eclipse-workspace/Project6/billg.jpg");
    theShop.addFilter(new FlipHorizontalFilter(), "Flip Horizontal");
    // add your other filters below
    theShop.addFilter(new FlipVerticalFilter(), "Flip Vertical");
    theShop.addFilter(new NegativeFilter(), "Negative");
    theShop.addFilter(new GaussianFilter(), "Gaussian");
    theShop.addFilter(new LaplacianFilter(), "Laplacian");
    theShop.addFilter(new UnsharpMasking(), "Unsharp Masking");
    theShop.addFilter(new EdgyFilter(), "Edgy Filter");
  }
}
