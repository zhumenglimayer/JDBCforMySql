package com.imooc.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.imooc.dao.GoddessDao;
import com.imooc.model.Goddess;

public class GoddessAction {
	public void add(Goddess goddess) throws Exception{
		GoddessDao dao= new GoddessDao();
		dao.addGoddess(goddess);
		
	}
	public Goddess get(Integer id) throws Exception{
		GoddessDao dao= new GoddessDao();
		return dao.get(id);
	}
	public void edit(Goddess goddess) throws Exception{
		GoddessDao dao= new GoddessDao();
		dao.updateGoddess(goddess);
	}
	public void del(Integer id) throws Exception{
		GoddessDao dao= new GoddessDao();
		dao.delGoddess(id); 
	}
	public List<Goddess> query() throws Exception{
		GoddessDao dao= new GoddessDao();
		return dao.query();
	}
	public List<Goddess> query(List<Map<String, Object>> params) throws Exception{
		GoddessDao dao= new GoddessDao();
		return dao.query(params);
	}
	public static void main(String[] args) throws Exception {
		GoddessDao g = new GoddessDao();
		List<Map<String, Object>> params= new ArrayList<Map<String, Object>>();
		Map<String, Object> param= new HashMap<String, Object>();
		param.put("name", "user_name");
		param.put("rela", "=");
		param.put("value", "'小美'");
		params.add(param);
		List<Goddess> result= g.query(params);
		for(int i= 0; i< result.size() ; i++){
			System.out.println(result.get(i).toString());
		}
		
		
		
//		//查询多个内容
//		GoddessDao g = new GoddessDao();
//		List<Goddess> gs= g.query("小美");
//		for(int i= 0; i< gs.size() ; i++){
//			System.out.println(gs.get(i).toString());
//		}
		
		
		
//		GoddessDao g= new GoddessDao();
//		Goddess g1= new Goddess();
//		g1.setUser_name("小夏");
//		g1.setAge(27);
//		g1.setSex(1);
//		g1.setBirthday(new Date());
////		g1.setCreater_user("ADMIN");
//		g1.setUpdate_user("ADMIN");
//		g1.setEmail("XXXX@163.com");
//		g1.setIsdel(1);
//		g1.setMobile("3423525");
//		g1.setId(3);
//		
//		Goddess g3= g.get(1);
//		System.out.println(g3.toString());
		
//		g.delGoddess(3);
		
//		g.updateGoddess(g1);
		
//		g.addGoddess(g1);
		
		
		
	}

}
