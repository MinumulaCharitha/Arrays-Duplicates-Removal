public class Dsa_DplicatesRemoval {
    public static int removeduplicates(int nums[],int n){
        int p1=0,p2=1;
        while(p2<n){
            if(nums[p1]==nums[p2]){
                p2++;
            }
            else{
                if(p1!=p2){
                p1++;
                nums[p1]=nums[p2];
                }
            }
        }
    return p1+1;
    }
    public static void main(String args[]){
        int nums[]={1,1,2,2,3,3,3,4,4,4};
        int n=10;
        int countafterduplicatesremoval=removeduplicates(nums,10);
        System.out.println("array after duplicates removal");
        for(int i=0;i<countafterduplicatesremoval;i++){
            
            System.out.print(nums[i]+" ");
        }
    }
}

