
import java.io.*;

class GFG {
    void mergeSort(long []a,int l,int r)
    {
        if(l<r){
        int m=(l+r)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge(a,l,m,r);
        }
    }
    void merge(long []a,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        long []b=new long [n1];
        long []c=new long [n2];
        for(int i=0;i<n1;i++)
        {
            b[i]=a[l+i];
        }
        for(int i=0;i<n2;i++)
        {
            c[i]=a[m+1+i];
        }
         int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) { 
            if (b[i] <= c[j]) { 
                a[k] = b[i]; 
                i++; 
            } 
            else { 
                a[k] = c[j]; 
                j++; 
            } 
            k++; 
        } 
  
        while (i < n1) { 
            a[k] = b[i]; 
            i++; 
            k++; 
        } 
        while (j < n2) { 
            a[k] = c[j]; 
            j++; 
            k++; 
        } 
    }
	public static void main (String[] args) {
	    double start=System.currentTimeMillis();
	    GFG g=new GFG();
	    long []arr=new long[]{9,8,4,5};
	    g.mergeSort(arr,0,arr.length-1);
	    /*
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    */
	    double end=System.currentTimeMillis();
	    double diff=(double)(end-start);
	    System.out.print(diff);
	}
}
