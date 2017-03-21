import java.util.LinkedHashMap;	//Import LinkedHashMap

public class DrillMap {	//Declaration of DrillMap class
	
	public static LinkedHashMap<String, Integer> getDrillCost(){	//LinkedHashMap, the components will be replaced in the sequence in which they were inserted.
		
		LinkedHashMap<String, Integer> getDrillCost = new LinkedHashMap <String, Integer>();	//Create a LinkedHashMap
		getDrillCost.put("Light", 100000);	//Put key and value in the map
		getDrillCost.put("Special", 250000);	//Put key and value in the map
		getDrillCost.put("Heavy", 500000);	//Put key and value in the map
		
		return getDrillCost;	//Return values of each key
		
	}

}

/*Code to use to access from different class
Integer value = DrillMap.getDrillCost().get("Light")*/