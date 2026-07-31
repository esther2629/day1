public class mergesort {
    public static void mergesort(int[] array,int left,int right)//recursive function to divide the array into two halves
{
    if(left<right)
    {
        int mid=(left+right)/2;
        mergesort(array,left,mid);
        mergesort(array,mid+1,right);
        merge(array,left,mid,right);

    }

}   
public static void merge(int[] array,int left,int mid,int right)
{
    int n1=mid-left+1;
    int n2=right-mid;
    int[] L=new int[n1];
    int[] R=new int[n2];
    for(int i=0;i<n1;i++)
    {
        L[i]=array[left+i];
    }
    for(int j=0;j<n2;j++)
    {
        R[j]=array[mid+1+j];
    }
     int i=0,j=0,k=left;
    while(i<n1&&j<n2)
    {
        if(L[i]<=R[j])
        {
            array[k++]=L[i++];
            
        }
        else
        {
            array[k++]=R[j++];
            
        }
        
    }
    while(i<n1)
    {
        array[k++]=L[i++];
    }
    while(j<n2)
    {
        array[k++]=R[j++];}
} 
public static void main(String[] args) {
    int[] array={1,5,3,0,9,6};
    int n=array.length;
    mergesort(array,0,n-1);
    System.out.println("Sorted array:");
    for(int i=0;i<n;i++)
    {
        System.out.print(array[i]+" ");
    }
}
}
