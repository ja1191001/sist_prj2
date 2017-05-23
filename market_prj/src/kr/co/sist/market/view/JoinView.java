package kr.co.sist.market.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JoinView extends JDialog {

	private JTextField jtfName, jtfSsn, jtfId, jtfAnswer;
	private JButton jbImage, jbSignUp, jbCancel;
	private JComboBox<String> jcbQuest;
	private JTextArea jtaIntro;
	private JPasswordField jpwSsn, jpwPass, jpwPassChk;
	
	public JoinView() {

		JPanel jplbBox=new JPanel(); //���� ���� �г�
		JPanel jptfBox=new JPanel(); // �Է�ĭ���� ���� �г�
		JPanel jptaIntro=new JPanel(); // �ڱ�Ұ� ���� �г�
		JPanel jpimg=new JPanel(); // ������ ���� �г�
		JPanel jpbutton=new JPanel(); // ��ư ���� �г�
		JPanel jpSsn=new JPanel(); // �ֹι�ȣ ���� �г�
		
		ImageIcon profile=new ImageIcon("C:/dev/workspace/prj2/src/prj2/img/default.jpg");
		
		JLabel jlName=new JLabel("�̸�");
		JLabel jlSsn=new JLabel("�ֹι�ȣ");
		JLabel jlId=new JLabel("���̵�");
		JLabel jlPass=new JLabel("��й�ȣ");
		JLabel jlPassChk=new JLabel("��й�ȣ Ȯ��");
		JLabel jlQuest=new JLabel("��й�ȣ ����");
		JLabel jlAnswer=new JLabel("��й�ȣ �亯");
		JLabel jlhyphen=new JLabel("-");
		JLabel jlimg=new JLabel(profile);
		JLabel jlIntro=new JLabel("�ڱ�Ұ�");
		
		setLayout(null); //������ġ
		
		//�г� ���̾ƿ� ����
		jplbBox.setLayout(new GridLayout(1, 7));
		jptfBox.setLayout(new GridLayout(1, 7));
		jptaIntro.setLayout(new BorderLayout());
		jpimg.setLayout(new BorderLayout());
		jpbutton.setLayout(new GridLayout(2, 1));
		jpSsn.setLayout(new FlowLayout());
		
		//jpSsn����
		jpSsn.add(jtfSsn);
		jpSsn.add(jlhyphen);
		jpSsn.add(jpwSsn);
		
		//jplbBox �� �󺧵� ����
		jplbBox.add(jlName);
		jplbBox.add(jlSsn);
		jplbBox.add(jlId);
		jplbBox.add(jlPass);
		jplbBox.add(jlPassChk);
		jplbBox.add(jlQuest);
		jplbBox.add(jlAnswer);
		
		//jptfBox �� �Է¶��� ����
		jptfBox.add(jtfName); //�̸�
		jptfBox.add(jpSsn); //�ֹι�ȣ �г�
		jptfBox.add(jtfId); // ���̵�
		jptfBox.add(jpwPass); //��й�ȣ
		jptfBox.add(jpwPassChk); //��й�ȣ Ȯ��
		jptfBox.add(jcbQuest); //��й�ȣ ����
		jptfBox.add(jtfAnswer); //��й�ȣ �亯
		
		//�̹��� �г�
		jpimg.add(jlimg);
		jpimg.add("South", jbImage);
		
		//�ڱ�Ұ� �г�
		jptaIntro.add("North", jlIntro);
		jptaIntro.add(jtaIntro);
		
		//��ư �г�
		jpbutton.add(jbSignUp);
		jpbutton.add(jbCancel);
		
		//�� �г� ��ġ
		setBounds(50, 50, 500, 500);
		
		
		
	}//joinView
	
	
	
}//class