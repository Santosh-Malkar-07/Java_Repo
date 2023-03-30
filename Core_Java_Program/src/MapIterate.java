import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterate {

	public static void main(String[] args) {
		Map<String, String> mapDatas = new HashMap<String, String>();

		mapDatas.put("A", "a1");
		mapDatas.put("B", "b1");
		mapDatas.put("C", "c1");
		mapDatas.put("D", "d1");

//		for (Map.Entry<String, String> mapData : mapDatas.entrySet()) {
//
//			System.out.println(mapData.getKey() + "     " + mapData.getValue());
//		}
//
//		for (String dataKey : mapDatas.keySet()) {
//			System.out.println(dataKey);
//		}
//
//		for (String dataValue : mapDatas.values()) {
//			System.out.println(dataValue);
//		}
//
//		Iterator<Map.Entry<String, String>> hashMap = mapDatas.entrySet().iterator();
//		while (hashMap.hasNext()) {
//			Map.Entry<String, String> hashMapData = hashMap.next();
//			System.out.println(hashMapData.getKey() + "        " + hashMapData.getValue());
//		}

//		mapDatas.forEach((keyData, valueData) -> {
//			System.out.println(keyData + "   ==    " + valueData);
//		});
//		
		
		mapDatas.entrySet().forEach(data -> {
			System.out.println(data.getKey() + "  " + data.getValue());
		});
	}

}
