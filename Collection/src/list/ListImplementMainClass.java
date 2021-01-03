package list;

 

public class ListImplementMainClass {

	public static void main(String[] str) {
  		
		MyList<Integer> arrayList = new MyArrayList<Integer>();
		MyList<Integer> arrayList1 = new MyArrayList<Integer>();
//		MyList<String> linkedList= new LinkedList<String>();
//		MyList<Integer> vectorObj=new Vector<Integer>();

		/*
		 * List function Implemention
		 */
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList1.add(121);
		arrayList1.add(131);
		arrayList1.add(141);
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList1.add(121);
		arrayList1.add(131);
		arrayList1.add(141);
		
		System.out.println("addAll "+arrayList.addAll(arrayList1));
 
		System.out.println("isEmpty "+arrayList.isEmpty());
		System.out.println("size "+ arrayList.size());
		System.out.println("contains "+ arrayList.contains(15));
		System.out.println("iterator "+arrayList.iterator().next());
		System.out.println("remove "+arrayList.remove(121));
		System.out.println("size "+ arrayList.size());
		System.out.println(arrayList.containsAll(arrayList1));

		while(arrayList.iterator().hasNext()){
			System.out.println("List "+arrayList.iterator().next());

		}
		arrayList.clear();

 		
	}
}
