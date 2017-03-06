package com.imooc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.imooc.db.DBUtil;
import com.imooc.model.Goddess;

public class GoddessDao {
	public void addGoddess(Goddess g) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + " insert into imooc_goddess" 
				+ " (user_name,sex,age,birthday,email,mobile,"
				+ " creater_user,creater_date,update_user,update_date,isdel)"
				+ " values(?,?,?,?,?,?,?,current_date(),?,current_date(),?)";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, 1);
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, "ADMIN");
		ptmt.setString(8, "ADMIN");
		ptmt.setInt(9, 0);
		ptmt.execute();
	}

	public void updateGoddess(Goddess g) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = "" + " update imooc_goddess" 
				+ " set user_name=?,sex=?,age=?,birthday=?,email=?,mobile=?,"
				+ " update_user=?,update_date=current_date(),isdel=?"
				+ " where id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, g.getUser_name());
		ptmt.setInt(2, g.getSex());
		ptmt.setInt(3, g.getAge());
		ptmt.setDate(4, new Date(g.getBirthday().getTime()));
		ptmt.setString(5, g.getEmail());
		ptmt.setString(6, g.getMobile());
		ptmt.setString(7, g.getUpdate_user());
		ptmt.setInt(8, g.getIsdel());
		ptmt.setInt(9, g.getId());
		ptmt.execute();
	}

	public void delGoddess(Integer id) throws Exception {
		Connection conn = DBUtil.getConnection();
		String sql = " delete from imooc_goddess" 
				+ " where id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, id);
		ptmt.execute();
	}
	
	
	public List<Goddess> query() throws Exception {
		StringBuilder sb= new StringBuilder();
		sb.append("select * from imooc_goddess");
		Connection conn = DBUtil.getConnection();
		PreparedStatement ptmt= conn.prepareStatement(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;
		while (rs.next()) {
			g = new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreater_date(rs.getDate("creater_date"));
			g.setCreater_user(rs.getString("creater_user"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setIsdel(rs.getInt("isdel"));

			gs.add(g);
		}
		return gs;
	}

	public List<Goddess> query(String name) throws Exception {
		StringBuilder sb= new StringBuilder();
		sb.append("select * from imooc_goddess");
		sb.append(" where user_name=?");
		Connection conn = DBUtil.getConnection();
		PreparedStatement ptmt= conn.prepareStatement(sb.toString());
		ptmt.setString(1, name);
		ResultSet rs = ptmt.executeQuery();
		List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;
		while (rs.next()) {
			g = new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreater_date(rs.getDate("creater_date"));
			g.setCreater_user(rs.getString("creater_user"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setIsdel(rs.getInt("isdel"));

			gs.add(g);
		}
		return gs;
	}
	public List<Goddess> query(List<Map<String, Object>> params) throws Exception {
		StringBuilder sb= new StringBuilder();
		sb.append("select * from imooc_goddess where 1=1 ");
		Connection conn = DBUtil.getConnection();
		if(params!=null&&params.size()>0){
			for(int i= 0;i< params.size();i++){
				Map<String, Object> map =params.get(i);
				sb.append(" and "+map.get("name")+" "+map.get("rela")+" "+map.get("value")); 
			}
		}
		PreparedStatement ptmt= conn.prepareStatement(sb.toString());
		System.out.println(sb.toString());
		ResultSet rs = ptmt.executeQuery();
		List<Goddess> gs = new ArrayList<Goddess>();
		Goddess g = null;
		while (rs.next()) {
			g = new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreater_date(rs.getDate("creater_date"));
			g.setCreater_user(rs.getString("creater_user"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setIsdel(rs.getInt("isdel"));

			gs.add(g);
		}
		return gs;
	}

	public Goddess get(Integer id) throws Exception {
		Goddess g=null;
		Connection conn = DBUtil.getConnection();
		String sql = " select * from imooc_goddess" 
				+ " where id=?";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, id);
		ResultSet rs= ptmt.executeQuery();
		while(rs.next()){
			g= new Goddess();
			g.setId(rs.getInt("id"));
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			g.setSex(rs.getInt("sex"));
			g.setBirthday(rs.getDate("birthday"));
			g.setEmail(rs.getString("email"));
			g.setMobile(rs.getString("mobile"));
			g.setCreater_date(rs.getDate("creater_date"));
			g.setCreater_user(rs.getString("creater_user"));
			g.setUpdate_user(rs.getString("update_user"));
			g.setUpdate_date(rs.getDate("update_date"));
			g.setIsdel(rs.getInt("isdel"));
		}
		return g;
	}

}
