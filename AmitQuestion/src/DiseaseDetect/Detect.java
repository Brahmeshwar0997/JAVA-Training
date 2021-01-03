package DiseaseDetect;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Detect {

	static Map<String, Integer> disease = new HashMap<String, Integer>();
	
	static String[][] AGELESS = { { "hibernation", "" }, { "wrinkles",""}, { "spot", ""}, { "uneven_Skin_Tone", ""},
			{ "redness", ""}, { "pores","" }, { "pimples","" } };
	static String AGEGREATER[][] = { { "wrinkles", ""}, { "hibernation", ""}, { "spot", ""}, { "uneven_Skin_Tone","" },
			{ "redness","" }, { "pores","" }, { "pimples", ""} };
	static String AGEEQUAL[][] = { { "pimples", ""}, { "hibernation", ""}, { "spot", ""}, { "uneven_Skin_Tone","" },
			{ "redness","" }, { "pores","" }, { "wrinkles", ""} };

	static void addData(String key, int value) {
		disease.put(key, value);

	}

	static void operationMap(int age) {

		List<Integer> Listofvalues = new ArrayList(disease.values());
		boolean flag = false;
		for (int s : Listofvalues) {
			if (Collections.frequency(Listofvalues, s) > 1) {
				flag = true;
				break;
			}
		}
		for (Integer integer : Listofvalues) {
			if (Collections.frequency(Listofvalues, integer) > 1) {
				flag = true;
				break;
			}
		}
		if (flag == false) {
			disease.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
					.forEach(System.out::println);
			

		} else {
			if (age <30) {
				for (int i = 0; i < 7; i++) {
				
					 AGELESS[i][1]= disease.get(AGELESS[i][0]).toString();
				}}
				else {if (age ==30) {
					for (int i = 0; i < 7; i++) {
					
						AGEEQUAL[i][1]= disease.get(AGEEQUAL[i][0]).toString();
					}

			} else {
				for (int i = 0; i < 7; i++) {
					AGEGREATER[i][1] = disease.get(AGELESS[i][0]).toString();
				}

			}
		}}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Detect.addData("hibernation", 2);
		Detect.addData("wrinkles", 12);
		Detect.addData("spot", 22);
		Detect.addData("uneven_Skin_Tone", 32);
		Detect.addData("redness", 24);
		Detect.addData("pores", 22);
		Detect.addData("pimples", 62);
		
		Detect.operationMap(10);
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print (AGELESS[i][j]+" ");
			}
			System.out.println();
		}
	}

}
