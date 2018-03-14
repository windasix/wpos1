package com.apply.test.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class fastjsontest {
	
	public static void main(String[] args) {
		String str="{'button':[{'type':'click','name':'今日歌曲','key':'V1001_TODAY_MUSIC'},{'name':'菜单','sub_button':["+
				"{'type':'view','name':'搜索','url':'http://www.soso.com/'},{'type':'click','name':'赞一下我们','key':'V1001_GOOD'}]}]}"; 
		JSON json = new JSONObject();	
		JSONObject jsonobject = json.parseObject(str);		
		JSONArray jsonArray = json.parseArray(jsonobject.toJSONString());		
		//json.writeJSONString(Appendable a);		
		System.out.println(jsonobject+"!");		
		System.out.println(jsonArray+"@");
		
		
		
	}
	
}
