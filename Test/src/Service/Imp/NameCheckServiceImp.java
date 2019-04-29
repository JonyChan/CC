package Service.Imp;

import Service.NameCheckService;
import Utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import Dao.NameCheckDao;
import Dao.Imp.NameCheckDaoImp;
import Dao.Imp.NameCheckDaoImp;
import entity.NameCheck;

public class NameCheckServiceImp implements NameCheckService{
	public boolean NameCheck(String name) {
		boolean result = false;
		NameCheck u = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			NameCheckDao ud = new NameCheckDaoImp();
			u = ud.namecheck(name);
			if(u != null) {
				result = true;
			}
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.println(e1);
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}finally {
				JdbcUtils.closeAll(conn, null, null);
			}
		}
		// TODO Auto-generated method stub
		return result;
	}

}
