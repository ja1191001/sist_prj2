package kr.co.sist.market.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.swing.JOptionPane;

import kr.co.sist.market.vo.IdVO;
import kr.co.sist.market.vo.ItemInfoVO;
import kr.co.sist.market.vo.LoginVO;
import kr.co.sist.market.vo.MemberInfoVO;
import kr.co.sist.market.vo.MemberJoinVO;
import kr.co.sist.market.vo.MsgListVO;
import kr.co.sist.market.vo.MyInfoVO;
import kr.co.sist.market.vo.PassVO;
import kr.co.sist.market.vo.PhoneVO;


/**
 * test
 * @author user
 *
 */
public class CustomerDAO {
	
	private static CustomerDAO c_dao;
	
	//�⺻������
	private CustomerDAO(){
	}//CustomerDAO
	
	//Instance���
	public static CustomerDAO getInstance(){
		if(c_dao == null){ 
			c_dao=new CustomerDAO();
		}//end if
		return c_dao;
	}//getInstatnce()
	
	//Connection���
	private Connection getConnection() throws SQLException{
		Connection con=null;
		Properties prop=new Properties();
		
		try {
				File file=new File("../market_db.properties");
				if(file.exists()){ 
						prop.load(new FileInputStream(file)); 
						String driver=prop.getProperty("driver"); 
						String url=prop.getProperty("url");  
						String id=prop.getProperty("dboid"); 
						String pass=prop.getProperty("dbopwd"); 
						try {
							Class.forName(driver); //����̹� �ε�
							con=DriverManager.getConnection(url,id,pass); 
						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}//end catch
				}else{
					JOptionPane.showMessageDialog(null, "���������� ��θ� Ȯ���ϼ���."); 
				}//end if
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch
		
		return con;
	}//getConnection()
	
	//////////////////////////////////////////////�޼ҵ�//////////////////////////////////////////////////////
	/**
	 * �α��� �������θ� �����ϴ� ��
	 * @return boolean
	 * @param LoginVO
	 */
	public boolean selectLogin(LoginVO lv) throws SQLException{
		Boolean flag=false;
		
		return flag;
	}//selectLogin

	
	/**
	 * ��й�ȣ ������ �����Ͽ� �ҷ����� ��
	 * @return List<String>
	 */
	public List<String> selectPassQu() throws SQLException{
		List<String> list=new ArrayList<>();
		
		return list;
	}//selectPassQu
	
	
	/**
	 * �Ǹ��� ��ǰ�� ��ǰ���̺� ����ϴ� ��
	 * @param ItemInfoVO
	 */
	public void insertItem(ItemInfoVO iiv) throws SQLException{
		
	}//insertItem
	
	
	/**
	 * ������ ������ ȸ���� ���� ������ �ҷ����� ��
	 * @param id
	 * @return MemberInfoVO
	 */
	public MemberInfoVO selectPreMember(String id) throws SQLException{
		MemberInfoVO miv=null;
		
		return miv;
	}//selectPreMember
	
	
	/**
	 * �Է��� ȸ�������� ȸ�����̺� �߰��ϴ� ��
	 * @param MemberJoinVO
	 */
	public void insertMember(MemberJoinVO mjv) throws SQLException{
		
	}//insertMember
	
	
	/**
	 * ȸ���� ������ �����ϴ� ��
	 * @param MemberInfoVO
	 */
	public void updateMember(MemberInfoVO miv) throws SQLException{
		
	}//updateMember
	
	
	/**
	 * �Է��� �޼����� �����޼����� �߰��ϴ� ��
	 * @param MsgListVO
	 */
	public void insertSendMsg(MsgListVO mlv) throws SQLException{
		
	}//insertSendMsg
	
	
	/**
	 *  �޼��������� ���� �޼����� �߰��ϴ� ��
	 * @param MsgListVO
	 */
	public void insertGetMsg(MsgListVO mlv) throws SQLException{
		
	}//insertGetMsg
	
	
	/**
	 * �ڽ��� ���̵� ��ȸ�ϴ� ��
	 * @param IdVO
	 * @return String
	 */
	public String selectMyId(IdVO iv) throws SQLException{
		String id="";
		
		return id;
	}//selectMyId
	
	
	/**
	 * �ڽ��� ��й�ȣ�� ��ȸ�ϴ� ��
	 * @param PassVO
	 * @return String
	 */
	public String selectMyPass(PassVO pv) throws SQLException{
		String pass="";
		
		return pass;
	}//selectMyPass
	
	
	/**
	 * �޴���ȭ��ȣ�� �߰��ϴ� ��
	 * @param PhoneVO
	 */
	public void insertPhone(PhoneVO phv) throws SQLException{
		
	}//insertPhone
	
	
	/**
	 * �޴���ȭ��ȣ�� ��ȸ�ϴ� ��
	 * @param itemCode
	 * @return String
	 */
	public String selectPhone(String itemCode) throws SQLException{
		String phone="";
		
		return phone;
	}//selectPhone
	
	
	/**
	 * ���� ȸ�������� ��ȸ�ϴ� ��
	 * @param id
	 * @return MyInfoVO
	 */
	public MyInfoVO selectMyInfo(String id) throws SQLException{
		MyInfoVO miv=null;
		
		return  miv;
	}//selectMyInfo
	
	
	/**
	 * �޼����� ������ ��ȸ�ϴ� ��
	 * @param id
	 * @return String
	 */
	public String selectMsgInfo(String id) throws SQLException{
		String msg="";
		
		return msg;
	}//selectMsgInfo
	
}//class
