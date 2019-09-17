String[] udidList =  "adb devices".execute().text.tokenize('\n')
def newList = []
 for(int i=1;i<udidList.size();i++)
 {
 	  newList.add(udidList[i].split("\t")[0])
 }

 def devicesMap = [:]
devicesMap.put("Samsung Galaxy J6", "5200cec6424c1645");
devicesMap.put("Samsung Galaxy J7","330043a4230bb2cf");
devicesMap.put("Nokia 3", "NE1GAM4852408241");
devicesMap.put("iPhone 6", "a9fa9349a7a4395f8513dec029d65633ee9f324f");
devicesMap.put("Redmi 5", "8933cd007cf5");
devicesMap.put("iPhone 6 Black", "84c55b070b7f3ca51397524db3e2bbc70bdd9df7");
devicesMap.put("iPhone 6 Silver", "af37c591d5e012065c4c20ac0538c5aac1bcb1cb");
devicesMap.put("iPhone 6 Grey", "b077e0d6a98e4e675c6e3e726821e9271aacf60b");
devicesMap.put("Samsung Galaxy J6 2", "5200cb5a439c16a5");
devicesMap.put("Samsung Galaxy J7","42006bcf9a2f84d3");
def updateDeviceMap = [:]
for(String item : newList )
{
	devicesMap.each{
		if((it.value.equalsIgnoreCase(item)))
		{
			updateDeviceMap.put(it.key,it.value)
		}
	}
}
updateDeviceMap.each{
	println it.key
}
