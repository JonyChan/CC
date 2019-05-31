package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import entity.user;

import Dao.UserDao;
import Utils.JdbcUtils;
import entity.user;

public class UserDaoImp implements UserDao {

	@Override
	public user selectByNameAndPwd(String name, String pwd) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		user u = null;
		try {
			
			conn=JdbcUtils.getConn();
			String sql = "select * from user where name=? and password=? ";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			ps.setString(2, pwd);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				u = new user();
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
	public user insert(user u) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		try {
			Connection conn = JdbcUtils.getConn();
			String sql = "insert into user values(?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, u.getName());
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getMoney());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, ps, null);
		}
		
				
		return u;
	}

	@Override
	public user selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changePassword(user u) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			
			conn=JdbcUtils.getConn();
			String sql = "update user set password = ? where name=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, u.getPassword());
			ps.setString(2, u.getName());
			
			
			rs = ps.executeQuery();
//			
//			if(rs.next()) {
//				u = new user();
//				u.setName(rs.getString("name"));
//				u.setPassword(rs.getString("password"));
//			}
//			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(conn, ps, rs);
		}
	}

	@Override
	public user selectOne(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		user u = null;;
		
		try {
			conn = JdbcUtils.getConn();
			String sql ="select * from user where name=?";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, name);
			
			
			rs = ps.executeQuery();
			if(rs.next()){
				u=new user();
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setMoney(rs.getString("money"));
//				f.setLaunch(rs.getString("launch"));
//				f.setLand(rs.getString("land"));
//				f.setName(rs.getString("name"));
//				f.setLength(rs.getString("length"));
//				f.setPrice(rs.getInt("price"));

			}	
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JdbcUtils.closeAll(conn, ps, rs);
		}
		return u;
	}

}
