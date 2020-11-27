package com.info;

import java.util.stream.IntStream;

public class JSONTEST {
	
	public static void main(String[] args) {
		String jsonArrayStr = " {\"asdf\":\"asdf\"}";
		JSONArray jsonArray = new JSONArray(jsonArrayStr);
	    return IntStream.range(0, jsonArray.length())
	      .mapToObj(index -> ((JSONObject)jsonArray.get(index)).optString(key))
	      .collect(Collectors.toList());
	}

}
