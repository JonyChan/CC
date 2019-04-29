package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.NameCheckDao;
import Utils.JdbcUtils;
import entity.CDK;
import entity.NameCheck;

public class NameCheckDaoImp implements NameCheckDao{


	public NameCheck namecheck(String name) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		NameCheck c = null;
		try {
			
			conn=JdbcUtils.getConn();
			
			String sql = "select * from user where name=? "; //SELECT * FROM LIST WHERE NAME = LIMING  
			//String sql = "select * from cdklist";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				c = new NameCheck();
				c.setName(rs.getString("name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(conn, ps, rs);
		}
		
		// TODO Auto-generated method stub
		return c;
		
	}

}
