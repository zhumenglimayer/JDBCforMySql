package com.imooc.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.action.GoddessAction;
import com.imooc.model.Goddess;

public class TestAction {
	public static void main(String[] args) throws Exception {
		GoddessAction action= new GoddessAction();
		//查询
//		List<Goddess> result= action.query();
//		for (int i = 0; i < result.size(); i++) {
//			System.out.println(result.get(i).getId()
//					+result.get(i).getUser_name());
//		}
		
		
		
		List<Map<String, Object>> params= new ArrayList<Map<String, Object>>();
		Map<String, Object> param= new HashMap<String, Object>();
		param.put("name", "user_name");
		param.put("rela", "=");
		param.put("value", "'小美'");
		params.add(param);
		List<Goddess> result= action.query(params);
		for(int i= 0; i< result.size() ; i++){
			System.out.println(result.get(i).toString());
		}
		
		Goddess g= new Goddess();
		g.setUser_name("小青2");
		g.setSex(2);
		g.setAge(22);
		g.setBirthday(new Date());
		g.setEmail("xiaoqing@163.com");
		g.setMobile("123456789");
		g.setIsdel(0);
		g.setId(4);
		
		//新增
//		action.add(g);
		
//		action.edit(g);
		
		
//		action.del(4);
	}
}
