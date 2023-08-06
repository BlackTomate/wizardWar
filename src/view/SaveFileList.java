package view;

import java.util.ArrayList;
import java.util.List;

public class SaveFileList extends MapFileList {

	public SaveFileList() {
		List<String> saveList = new ArrayList<String>();
		for(String s : mapStringList){
			if(s.indexOf(".sav") != -1){
				saveList.add(s);
			}
		}
		this.setListData(saveList.toArray(new String[saveList.size()]));
	}
}
