package Service.Imp;

import java.sql.Connection;
import java.sql.SQLException;


import Dao.BankUserDao;
import Dao.Imp.BankUserDaoImp;
import Service.BankUserService;
import Service.CDKService;
import Utils.JdbcUtils;
import entity.BankUser;




public class BankUserServiceImp implements BankUserService{
	
	public boolean resetbankpwd(String name,String password) {
		
		boolean result = false;
		BankUser u = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			BankUserDao ud = new BankUserDaoImp();
			u = ud.updatebankpassword(name, password);
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
