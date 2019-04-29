package Service.Imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.AppDao;

import Dao.Imp.AppDaoImp;

import Service.AppService;
import Utils.JdbcUtils;
import entity.app;



public class AppServiceImp implements AppService {

	@Override
	public void newApp(app a) {
		// TODO Auto-generated method stub

		
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			AppDao ad = new AppDaoImp();
//			System.out.println(11);
			a = ad.insert(a);
			conn.commit();
//			System.out.println(12);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally {
			JdbcUtils.closeAll(conn, null, null);
		}
		
	}

	@Override
	public List<app> showAll() {
		// TODO Auto-generated method stub
		List<app>list = new ArrayList<app>();
		Connection conn = null;
		try {
		conn = JdbcUtils.getConn();
		
			conn.setAutoCommit(false);
			AppDao ad = new AppDaoImp();
			list = ad.showAll();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println(e1);
			}
		}finally {
			JdbcUtils.closeAll(conn, null, null);
		}
		
		return list;
	}

}
