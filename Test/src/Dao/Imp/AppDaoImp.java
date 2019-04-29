package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.AppDao;
import Utils.JdbcUtils;
import entity.app;


public class AppDaoImp implements AppDao {

	@Override
	public app insert(app a) {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			String sql = "insert into app values(?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, a.getAppname());
			ps.setString(2, a.getAppdescri());
			ps.setString(3, a.getWarpath());
			ps.setString(4, a.getIconpath());
			ps.setString(5, a.getProvider());
			
			ps.executeUpdate();
			
			System.out.println(a.getAppname());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeAll(null, ps, null);
		}
		
		return a;
	}

	@Override
	public List<app> showAll() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		app a = null;
		List<app> list = new ArrayList<>();
		try {
		conn = JdbcUtils.getConn();
		System.out.println("Conn is " + conn);
		
		String sql = "select * from app";
		
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				a = new app();
				a.setAppname(rs.getString("appname"));
				a.setAppdescri(rs.getString("appdescri"));
				a.setWarpath(rs.getString("warpath"));
				a.setIconpath(rs.getString("iconpath"));
				a.setProvider(rs.getString("provider"));
				
				list.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}finally {
			JdbcUtils.closeAll(conn, ps, rs);
		}
		
		return list;
	}

}
