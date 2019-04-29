package Service.Imp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Service.CDKService;
import Dao.CDKDao;
import Dao.Imp.CDKDaoImp;
import Utils.JdbcUtils;
import entity.CDK;

public class CDKServiceImp implements CDKService {
	
	public boolean CDKComparing(String cdk) {
		boolean result = false;
		CDK u = null;
		Connection conn = null;
		try {
			conn = JdbcUtils.getConn();
			conn.setAutoCommit(false);
			CDKDao ud = new CDKDaoImp();
			u = ud.selectByCdk(cdk);
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
