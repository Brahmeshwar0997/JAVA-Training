package GridQuestion;


public class ForestFinding {
	static int[][] animal= {{1,1,0,0,1},{1,0,1,0,0},{0,0,1,1,0},{1,1,0,1,1},{0,1,1,1,0}};
	int rowIndex[]= {-1,-1,-1,0,0,0,1,1,1};
	int colIndex[]= {-1,0,1,-1,0,1,-1,0,1};
static int counter=0;
	void find_animal(int row, int col) {
		for (int i=0;i<rowIndex.length;i++) {
			boolean check=can_Move((row+rowIndex[i]),(col+colIndex[i]));
			System.out.println("Grid moves "+(row+rowIndex[i])+" "+(col+colIndex[i])+" "+check);
			if(check) {
				System.out.println("Moves check");
				animal[(row+rowIndex[i])][(col+colIndex[i])]=9;
				counter++;
				 find_animal(row+rowIndex[i],col+colIndex[i]);
			}
		}
	}
boolean can_Move(int row,int col) {
	
	if(row>=0 && col>=0 && row<animal.length && col<animal[0].length) {
		if(animal[row][col]!=1 ){
			return false;
		}
		return true;
	}
	return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForestFinding test=new ForestFinding();
		test.find_animal(2, 2);
		for (int i = 0; i < animal.length; i++) {
			for (int j = 0; j < animal.length; j++) {
				System.out.print(animal[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(counter);
	}
	static int[][] animal1= {{1,1,0,0,1},
							{1,0,1,0,0},
							{0,0,1,1,0},
							{1,1,0,1,1},
							{0,1,1,1,0}};

}
