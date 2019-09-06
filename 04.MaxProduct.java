public class MaxProduct {
  public int adjacentElementsProduct(int[] array) {
    int ans = Integer.MIN_VALUE;
    for (int i = 0; i < array.length-1; i++)
      ans = Math.max(ans,array[i]*array[i+1]);
    return ans;
  }
}