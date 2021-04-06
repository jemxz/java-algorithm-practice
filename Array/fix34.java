/*

Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.


fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

public int[] fix34(int[] nums) {
  int count3 = 0;
  int count4 = 0;
  int[] up = new int[nums.length];
  for(int i=0; i<up.length; i++){
    if(nums[i]==3){
      count3++;
      up[i] = 3;
      up[i+1] = 4;
      i++;
    }
  }
  
  // count the number of fours
  for(int i=0; i<up.length; i++)
    if(nums[i]==4)
      count4++;
      
  // fill the remaining 4s into up
  int counter = count3;
  for(int i=0; i<up.length; i++){
    if(counter>=count4)
      break;
    if(up[i]!=3 && up[i]!=4){
      up[i] = 4;
      counter++;
    }
  }
  
  int cur = 0;
  // fill with the remaining non4 non3 elements
  for(int i=0; i<up.length; i++){
    if(nums[i]!=3 && nums[i]!=4){
     while(true){
       if(up[cur]!=4 && up[cur]!=3){
         up[cur] = nums[i];
         cur++;
         break;
       }
       cur++;
     } 
    }
  }
  return up;
}
