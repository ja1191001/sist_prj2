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

import kr.co.sist.market.vo.ItemInfoVO;
import kr.co.sist.market.vo.LoginVO;
import kr.co.sist.market.vo.MemberInfoVO;


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
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * �α��� �������θ� �����ϴ� ��
	 * @return boolean
	 * @param LoginVO
	 */
	public boolean selectLogin(LoginVO lv){
		Boolean flag=false;
		
		return flag;
	}//selectLogin
	

	/**
	 * ��й�ȣ ������ �����Ͽ� �ҷ����� ��
	 * @return List<String>
	 */
	public List<String> selectPassQu(){
		List<String> list=new ArrayList<>();
		
		return list;
	}//selectPassQu
	
	
	/**
	 * �Ǹ��� ��ǰ�� ��ǰ���̺� ����ϴ� ��
	 * @param itemInfoVO
	 */
	public void insertItem(ItemInfoVO iiv){
		
	}//insertItem
	
	
	/**
	 * ������ ������ ȸ���� ���� ������ �ҷ����� ��
	 * @param id
	 * @return MemberInfoVO
	 */
	public MemberInfoVO selectPreMember(String id){
		MemberInfoVO miv=null;
		
		return miv;
	}//selectPreMember
//	
//	
//	/**
//	 * �Է��� ȸ�������� ȸ�����̺� �߰��ϴ� ��
//	 * @param MemberJoinVO
//	 */
//	public void insertMember(MemberJoinVO){
//		
//	}//insertMember
//	
//	
//	/**
//	 * ȸ���� ������ �����ϴ� ��
//	 * @param MemberInfoVO
//	 */
//	public void updateMember(MemberInfoVO){
//		
//	}//updateMember
//	
//	
//	/**
//	 * �Է��� �޼����� �����޼����� �߰��ϴ� ��
//	 * @param MsgListVO
//	 */
//	public void insertSendMsg(MsgListVO){
//		
//	}//insertSendMsg
//	
//	
//	/**
//	 *  �޼��������� ���� �޼����� �߰��ϴ� ��
//	 * @param MsgListVO
//	 */
//	public void insertGetMsg(MsgListVO){
//		
//	}//insertGetMsg
//	
//	
//	/**
//	 * �ڽ��� ���̵� ��ȸ�ϴ� ��
//	 * @param IdVO
//	 * @return String
//	 */
//	public String selectMyId(IdVO){
//		
//	}
//	
//	
//	/**
//	 * �ڽ��� ��й�ȣ�� ��ȸ�ϴ� ��
//	 * @param PassVO
//	 * @return String
//	 */
//	public String selectMyPass(PassVO){
//		
//	}
//	
//	
//	/**
//	 * �޴���ȭ��ȣ�� �߰��ϴ� ��
//	 * @param PhoneVO
//	 */
//	public void insertPhone(PhoneVO){
//	
//	}
//	
//	
//	/**
//	 * �޴���ȭ��ȣ�� ��ȸ�ϴ� ��
//	 * @param itemCode
//	 * @return String
//	 */
//	public String selectPhone(String itemCode){
//	
//	}
//	
//	
//	/**
//	 * ���� ȸ�������� ��ȸ�ϴ� ��
//	 * @param id
//	 * @return MyInfoVO
//	 */
//	public MyInfoVO selectMyInfo(String id){
//	
//	}
//	
//	
//	/**
//	 * �޼����� ������ ��ȸ�ϴ� ��
//	 * @param id
//	 * @return String
//	 */
//	public String selectMsgInfo(String id){
//	
//	}
	
	
}//class
