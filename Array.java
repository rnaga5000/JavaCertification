package MyPack;

public class Array {

	public static void main(String[] args)
	{
	      double[] myList = {1.9, 2.9, 3.4, 3.5};
	      double[] myList1 = {1.9, 2.9, 4.5, 1.3};

	      	for(int i=0;i<myList.length;i++)
	      	{
	      		for(int j=0;j<myList1.length;j++)
	      		{
	      			if(myList[i]==myList1[j])
	      			{
	      				System.out.println(myList[i]);
	      			}
	      		}
	      	}

	}

}
