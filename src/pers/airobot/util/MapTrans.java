package pers.airobot.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pers.airobot.DbHelper.DbHelper;
import pers.airobot.model.BookType;

public class MapTrans {
	static Map<String, Item> map = new HashMap<String, Item>();

	public static Map<String, Item> getMap() {
		List<?> list = DbHelper.selectBookCategory();
		for (int i = 0; i < list.size(); i++) {
			BookType booktype = (BookType) list.get(i);

			Item item = new Item();
			item.setId(booktype.getId());
			item.setName(booktype.getTypeName());
			map.put(item.getId(), item);

		}
		return map;
	}
}
