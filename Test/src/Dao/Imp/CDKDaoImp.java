package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.CDKDao;
import Utils.JdbcUtils;
import entity.CDK;

public class CDKDaoImp implements CDKDao{
	
	public CDK selectByCdk(String cdk) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		CDK c = null;
		try {
			
			conn=JdbcUtils.getConn();
			
			String sql = "select * from cdklist where cdk=? "; //SELECT * FROM LIST WHERE NAME = LIMING  
			//String sql = "select * from cdklist";
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, cdk);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				c = new CDK();
				c.setCdk(rs.getString("cdk"));
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
