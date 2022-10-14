# Java
For Practice

/*Matrix Multiplication*/

public class Main
{
	public static void main(String[] args) {
		int arr[][]={{1,3,2},{3,1,1},{1,2,2}};
		int arr1[][]={{2,1,1},{1,0,1},{1,3,1}};
		int res[][]=new int[arr.length][arr[0].length];
		int a=0,x=0;
		for(int i=0;i<arr.length;i++){
		    for(int j=0;j<arr1[0].length;j++){
		        a=0;
		        for(int z=0;z<arr1.length;z++){
		            a+=arr[i][z]*arr1[z][j];    
		        }
		        res[i][j]=a;
		    }
		    
		}
		for(int i=0;i<res.length;i++){
		    for(int j=0;j<res[0].length;j++){
		        System.out.print(res[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}

