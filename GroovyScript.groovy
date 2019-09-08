String[] udidList =  "adb devices".execute().text.tokenize('\n')
def newList = []
 for(int i=1;i<udidList.size();i++)
 {
 	  newList.add(udidList[i].split("\t")[0])
 }
 def modelList = []
 for(int i=0;i<newList.size();i++)
 {
 	 modelList.add("adb -s ${-> newList.get(i)} shell getprop ro.product.model".execute().text)
 }
println  modelList