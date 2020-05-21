import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class calcbody extends JFrame implements ActionListener{



JFrame jf=new JFrame("Calculator");
JLabel jl=new JLabel();
newbutton n1=new newbutton();
newbutton n2=new newbutton();
newbutton n3=new newbutton();
newbutton n4=new newbutton();
newbutton n5=new newbutton();
newbutton n6=new newbutton();
newbutton n7=new newbutton();
newbutton n8=new newbutton();
newbutton n9=new newbutton();
newbutton n0=new newbutton();
newbutton nplus=new newbutton();
newbutton nminus=new newbutton();
newbutton npro=new newbutton();
newbutton ndiv=new newbutton();
newbutton nequal=new newbutton();
newbutton nclear=new newbutton();

public calcbody()
{
	
	setSize(500,500);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	
	
	jl.setSize(50,100);
	jl.setBounds(50,50,50,100);
	jl.setVisible(true);
	add(jl);

	n1.setproperty(n1,"1",50,50,100,150);
	add(n1);

	n2.setproperty(n2,"2",50,50,175,150);
	add(n2);

	n3.setproperty(n3,"3",50,50,250,150);
	add(n3);

	n4.setproperty(n4,"4",50,50,100,225);
	add(n4);

	n5.setproperty(n5,"5",50,50,175,225);
	add(n5);

	
	n6.setproperty(n6,"6",50,50,250,225);
	add(n6);

	n7.setproperty(n7,"7",50,50,100,300);
	add(n7);

	n8.setproperty(n8,"8",50,50,175,300);
	add(n8);

	n9.setproperty(n9,"9",50,50,250,300);
	add(n9);

	n0.setproperty(n0,"0",50,50,100,375);
	add(n0);


	nplus.setproperty(nplus,"+",50,50,325,150);
	add(nplus);

	
	nminus.setproperty(nminus,"-",50,50,325,225);
	add(nminus);

	
	npro.setproperty(npro,"*",50,50,325,300);
	add(npro);

	ndiv.setproperty(ndiv,"/",50,50,325,375);
	add(ndiv);

	nequal.setproperty(nequal,"=",50,50,175,375);
	add(nequal);

	nclear.setproperty(nclear,"C",50,50,250,375);
	add(nclear);

	n1.addActionListener(this);
	n2.addActionListener(this);
	n3.addActionListener(this);
	n4.addActionListener(this);
	n5.addActionListener(this);
	n6.addActionListener(this);
	n7.addActionListener(this);
	n8.addActionListener(this);
	n9.addActionListener(this);
	n0.addActionListener(this);
	nplus.addActionListener(this);
	nminus.addActionListener(this);
	npro.addActionListener(this);
	ndiv.addActionListener(this);
	nclear.addActionListener(this);
	nequal.addActionListener(this);

}
public void actionPerformed(ActionEvent e)
	{
		String str=jl.getText();

		if(e.getSource()==n1)
			jl.setText(str+"1");
		if(e.getSource()==n2)
			jl.setText(str+"2");
		if(e.getSource()==n3)
			jl.setText(str+"3");
		if(e.getSource()==n4)
			jl.setText(str+"4");
		if(e.getSource()==n5)
			jl.setText(str+"5");
		if(e.getSource()==n6)
			jl.setText(str+"6");
		if(e.getSource()==n7)
			jl.setText(str+"7");
		if(e.getSource()==n8)
			jl.setText(str+"8");
		if(e.getSource()==n9)
			jl.setText(str+"9");
		if(e.getSource()==n0)
			jl.setText(str+"0");
		if(e.getSource()==nplus)
			jl.setText(str+"+");
		if(e.getSource()==nminus)
			jl.setText(str+"-");
		if(e.getSource()==npro)
			jl.setText(str+"*");
		if(e.getSource()==ndiv)
			jl.setText(str+"/");
		if(e.getSource()==nclear)
			jl.setText("");
		if(e.getSource()==nequal)
		{
			char spcl='\0';
			String[] strarr=new String[10];
			int[] a=new int[10];
			int res;
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if((ch=='+')|(ch=='-')|(ch=='*')|(ch=='/'))
					spcl=ch;
			}
			strarr=str.split("\\"+spcl);
			for(int i=0;i<strarr.length;i++)
			{
				a[i]=Integer.parseInt(strarr[i]);
			}
			res=a[0];
			for(int i=1;i<strarr.length;i++)
			{


				if(spcl=='+')
					res=res+a[i];
				if(spcl=='-')
					res=res-a[i];
				if(spcl=='*')
					res=res*a[i];
				if(spcl=='/')
				{
					if(a[i]==0)
						jl.setText("Division by zero not possible");
					else
						res=res/a[i];
				}
			}
			jl.setText(""+res);
		}
			
			





		jl.setVisible(true);
		

	}
}

class newbutton extends JButton{

		public newbutton()
		{
			JButton button=new JButton();
		}

		public JButton setproperty(JButton button,String str,int height,int width,int x,int y)
		{
			button.setLabel(str);
			button.setSize(new Dimension(height,width));
			button.setVisible(true);
			button.setBounds(x,y,height,width);
			return button;
		}
}

class calc
{

public static void main(String args[])
{
	calcbody ccb=new calcbody();
}

}
