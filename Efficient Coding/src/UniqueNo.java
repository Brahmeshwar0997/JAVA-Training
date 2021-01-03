import java.util.*;

public class UniqueNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> numList=Arrays.asList(1,1,5,4,3,3,5,6,7,2,7,6);
		    Integer unique = numList.stream().reduce((x,y)->x^y).get();
		    System.out.println(unique);
	}

}
