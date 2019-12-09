package star;

public class PrintPattern {
	public static void main(String args[]) {
		int i,j,k,m,n=5;
		
		for(i=1,m=-1;i<=n;++i,m+=2){
			if(i==1)
				for(j=1;j<n*2;++j)
					System.out.print("*");
			else{
				for(k=i;k<=n;++k)
					System.out.print("*");
				
				for(k=1;k<=m;++k)
					System.out.print(" ");
				
				for(k=i;k<=n;++k)
					System.out.print("*");
			}
			
			System.out.print("\n");
		}
	}}