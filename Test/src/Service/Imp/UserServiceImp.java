package Service.Imp;

import java.sql.Connection;
import java.sql.SQLException;

import Dao.UserDao;
import Dao.Imp.UserDaoImp;
import Service.UserService;
import Utils.JdbcUtils;
import entity.user;

public class UserServiceImp implements UserService{

	@Override
	public boolean login(String name, String pwd) {
		
		boolean result = false;
		user u = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			UserDao ud = new UserDaoImp();
			u = ud.selectByNameAndPwd(name, pwd);
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

	@Override
	public void regist(user u) {
		// TODO Auto-generated method stub
		user u1 = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			UserDao ud = new UserDaoImp();
			u1 = ud.insert(u);
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
			}
		}finally {
			JdbcUtils.closeAll(conn, null, null);
		}
		
		
		
		
	}

	@Override
	public boolean check(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void changePassword(user u) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			con = JdbcUtils.getConn();
			con.setAutoCommit(false);
			UserDao ud = new UserDaoImp();
			ud.changePassword(u);
			
			con.commit();
			//System.out.println("service IMpl");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//System.out.println("sss");
			//return false;
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			JdbcUtils.closeAll(con,null, null);
		}
	}

}
