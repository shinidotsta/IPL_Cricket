package com.face.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.BO.SkillBO;

public class SkillDAO {

	public   static int find_By_Skillname(Connection connection, String skill_name) throws SQLException 
	{
		Statement st=connection.createStatement();
		String query="SELECT *FROM Skill WHERE skill_name='"+skill_name +"'";
		//System.out.println(query);
		ResultSet rs=st.executeQuery(query);
		int IDSkill = 0;
		SkillBO SkBo=new SkillBO();

		while(rs.next())
		{
		//System.out.println(rs.getString("skill_name"));
		//System.out.println(rs.getInt("skill_id"));
		SkBo.setSkillname(rs.getString("skill_name"));
		SkBo.setSkillid(rs.getInt("skill_id"));
		IDSkill=rs.getInt("skill_id");
		}
		//System.out.println(IDSkill);
		return IDSkill;
		
		
	}

	
}
