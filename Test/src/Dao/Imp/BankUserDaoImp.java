package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.BankUserDao;
import Utils.JdbcUtils;
import entity.BankUser;

public class BankUserDaoImp implements BankUserDao{
	
	public BankUser updatebankpassword(String name, String bankpassword) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BankUser u = null;
		try {
			
			conn=JdbcUtils.getConn();
			String sql = "select * from user where name=? and password=?";
			//update libraryBuilding set bankpassword= ? where name= ?
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			ps.setString(2, bankpassword);
			
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				u = new BankUser();
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(conn, ps, rs);
		}
		
		// TODO Auto-generated method stub
		return u;
	}

	@Override
	public BankUser updatebalance(String balance) {
		// TODO Auto-generated method stub
		return null;
	}

}
