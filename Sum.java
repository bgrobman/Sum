
public class Sum
{
    public static int makeSum(int [] a, int num, int sum){
        int count = 0;
        makeSum(a,0,num,sum, count);
        return count;
    } 
    
    private static int makeSum(int [] a,int i, int num, int sum, int count){
        if(i == a.length){
            return 0;
        }
        
        if(i == a.length - 1){
            return a[i];
        }
        
        if(sum == 0){
            return 0;
        }

        int first = a[i] + makeSum(a, i, num, sum - 1,count);
        int second = a[i] + makeSum(a, i + 1, num, sum -1,count);
        
        
        
        if(first == num)
         count++; 
        
        if(second == num)
         count++;
        
        return makeSum(a, i + 1, num, sum -1,count);
    }
    
}
