import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JColorChooser;
class Car extends JFrame implements ActionListener{
	
	private Container c,dailcon,dailcoccn;
	private JPanel jp;
	private JLabel title,showreporttiitle,subtitle,dailytitle,dBus,dcar,dbike,drickshaw,dbusAmount,dcarAmount,dbikeAmount,dRickshawAmount;
	private JButton choose,bus,normarcar,bike,rickshaw,showreport,deletereport,dd1,dd2,dd3,dd4,dd5,actiondaily;
	private Font size,style,nice,small;
	private JTextField bust,normarcart,biket,rickshawt,showreportt,deletereportt,day1,day2,day3,day4,day5,day6,dtotalCar,dtotalAmount;
	private int totalcar = 0;
	private int totalAmou = 0;
 	private int totalbus = 0;
	private int totalcars = 0;
	private int totalbike = 0;
	private int totalrickshaw = 0;
	private int totalbusamount = 0;	
	private int totalcaramount = 0;	
	private int totalbikeamount = 0;	
	private int totalricksamount = 0;
	private ImageIcon logo;
	private JMenuBar mbar;
	private JMenu menucre,edit,report,about,help;
	private JMenuItem nee,save,saveus,open,cut,redo,undo,delete,copy,past,selectAll,monthly,yearly,weakly,daily,press,developer,exit;
	
	Car(){
		
		carLogic();
	}
	
public void carLogic(){
	
	c = this.getContentPane();
	c.setLayout(null);
	
	logo = new ImageIcon(getClass().getResource("logo.png"));
	this.setIconImage(logo.getImage());
	
	mbar = new JMenuBar();
	mbar.setBackground(Color.BLACK);
	mbar.setForeground(Color.WHITE);
	this.setJMenuBar(mbar);
	
	menucre = new JMenu("File");
	menucre.setForeground(Color.WHITE);
	mbar.add(menucre);
	
	nee = new JMenuItem("New");
	nee.setForeground(Color.BLACK);
	menucre.add(nee);
	
	save = new JMenuItem("Save");
	save.setForeground(Color.BLACK);
	menucre.add(save);
	saveus = new JMenuItem("Save As");
	saveus.setForeground(Color.BLACK);
	menucre.add(saveus);
	
	open = new JMenuItem("Open");
	open.setForeground(Color.BLACK);
	menucre.add(open);
	
	exit = new JMenuItem("Exit");
	exit.setForeground(Color.BLACK);
	menucre.add(exit);
	
	edit = new JMenu("Edit");
	edit.setForeground(Color.WHITE);
	mbar.add(edit);
	
	redo = new JMenuItem("Redo");
	redo.setForeground(Color.BLACK);
	edit.add(redo);
	
	undo = new JMenuItem("Undo");
	undo.setForeground(Color.BLACK);
	edit.add(undo);
	
	cut = new JMenuItem("Cut");
	cut.setForeground(Color.BLACK);
	edit.add(cut);
	
	copy = new JMenuItem("Copy");
	copy.setForeground(Color.BLACK);
	edit.add(copy);
	
	past = new JMenuItem("Paste");
	past.setForeground(Color.BLACK);
	edit.add(past);
	
	selectAll = new JMenuItem("Select All");
	selectAll.setForeground(Color.BLACK);
	edit.add(selectAll);
	
	report = new JMenu("Report");
	report.setForeground(Color.WHITE);
	mbar.add(report);
	
	daily = new JMenuItem("Daily Report");
	daily.setForeground(Color.BLACK);
	report.add(daily);
	
	weakly = new JMenuItem("Weakly Report");
	weakly.setForeground(Color.BLACK);
	report.add(weakly);
	
	monthly = new JMenuItem("Monthly Report");
	monthly.setForeground(Color.BLACK);
	report.add(monthly);
	
	yearly = new JMenuItem("Yearly Report");
	yearly.setForeground(Color.BLACK);
	report.add(yearly);
	
	help = new JMenu("Help");
	help.setForeground(Color.WHITE);
	mbar.add(help);
	
	press = new JMenuItem("Click Help");
	press.setForeground(Color.BLACK);
	help.add(help);
	

	
	about = new JMenu("About Developer");
	about.setForeground(Color.WHITE);
	mbar.add(about);
	
	developer = new JMenuItem("Devoloper");
	developer.setForeground(Color.BLACK);
	about.add(developer);
	
	
	size = new Font("Cambria",Font.BOLD,28);
	style = new Font("Cambria",Font.BOLD,15);
	nice = new Font("Cambria",Font.ITALIC,13);
	small = new Font("Cambria",Font.ITALIC,10);
	
	title = new JLabel("Business Car Management Software");
	title.setForeground(Color.BLACK);
	title.setBounds(200,10,500,50);
	title.setFont(size);
	c.add(title);
	
	subtitle = new JLabel("Easily Handeling Your Parking");
	subtitle.setForeground(Color.BLACK);
	subtitle.setBounds(500,40,500,50);
	subtitle.setFont(nice);
	c.add(subtitle);
	
	bus = new JButton("Click For Entered Bus");
	bus.setBounds(10,120,200,50);
	bus.setForeground(Color.WHITE);
	bus.setFont(style);
	bus.setBackground(Color.BLUE);
	c.add(bus);
	
	normarcar = new JButton("Click For Entered Car");
	normarcar.setBounds(10,180,200,50);
	normarcar.setForeground(Color.WHITE);
	normarcar.setFont(style);
	normarcar.setBackground(Color.BLUE);
	c.add(normarcar);

	bike = new JButton("Click For Entered Bike");
	bike.setBounds(10,240,200,50);
	bike.setForeground(Color.WHITE);
	bike.setFont(style);
	bike.setBackground(Color.BLUE);
	c.add(bike);

	rickshaw = new JButton("Click For Entered Rickshaw");
	rickshaw.setBounds(10,300,200,50);
	rickshaw.setForeground(Color.WHITE);
	rickshaw.setFont(style);
	rickshaw.setBackground(Color.BLUE);
	c.add(rickshaw);

	showreport = new JButton("Show Record");
	showreport.setBounds(10,360,200,50);
	showreport.setForeground(Color.WHITE);
	showreport.setFont(style);
	showreport.setBackground(Color.BLUE);
	c.add(showreport);	

	deletereport = new JButton("Delete Record");
	deletereport.setBounds(10,420,200,50);
	deletereport.setForeground(Color.WHITE);
	deletereport.setFont(style);
	deletereport.setBackground(Color.BLUE);
	c.add(deletereport);
	
	// dd1 = new JButton("Report-01");
	// dd1.setBounds(10,10,100,50);
	// dd1.setBackground(Color.BLACK);
	// dd1.setForeground(Color.WHITE);
	// dd1.setFont(small);
	// c.add(dd1);
	
	
	bust = new JTextField();
	bust.setBounds(250,120,300,50);
	c.add(bust);
	
	normarcart = new JTextField();
	normarcart.setBounds(250,180,300,50);
	c.add(normarcart);
	
	biket = new JTextField();
	biket.setBounds(250,240,300,50);
	c.add(biket);
	
	rickshawt = new JTextField();
	rickshawt.setBounds(250,300,300,50);
	c.add(rickshawt);
	
	 showreportt = new JTextField();
	 showreportt.setBounds(250,360,300,50);
	 c.add(showreportt);
	 
	 day1 = new JTextField("REPORT LIST");
	 day1.setBackground(Color.BLUE);
	 day1.setForeground(Color.WHITE);
	 day1.setEnabled(false);
	 day1.setBounds(580,120,200,50);
	 c.add(day1);
	 
	 day2 = new JTextField("Report-02");
	 day2.setBounds(580,180,200,50);
	 c.add(day2);
	 
	 day3 = new JTextField("Report-03");
	 day3.setBounds(580,240,200,50);
	 c.add(day3);
	 
	 day4 = new JTextField("Report-04");
	 day4.setBounds(580,300,200,50);
	 c.add(day4);
	 
	 day5 = new JTextField("Report-05");
	 day5.setBounds(580,300,200,50);
	 c.add(day5);
	 
	 day6 = new JTextField("Report-05");
	 day6.setBounds(580,360,200,50);
	 c.add(day6);
	 
	 choose = new JButton("Change");
	 choose.setBounds(900,10,92,30);
	 choose.setForeground(Color.WHITE);
	 choose.setBackground(Color.BLACK);
	 c.add(choose);
	 

	
	bus.addActionListener(this);
	normarcar.addActionListener(this);
	bike.addActionListener(this);
	rickshaw.addActionListener(this);
	showreport.addActionListener(this);
	deletereport.addActionListener(this);
	nee.addActionListener(this);
	exit.addActionListener(this);
	daily.addActionListener(this);
	developer.addActionListener(this);
	choose.addActionListener(this);
	// dd1.addActionListener(this);
	
	
	// daily report programming
	

	
	
	
	
	
}

public void actionPerformed(ActionEvent e){
	
	
	if(e.getSource()==bus){
		
		if(totalcar <= 50){
		totalcar = totalcar+1;
		totalAmou = totalAmou+300;
		totalbusamount = totalbusamount+300;
		totalbus = totalbus+1;
		
		bust.setText("Total Bus "+totalbus);
		}else{
			JOptionPane.showMessageDialog(null,"Not Enough Space For Bus Parking");
		}
		

		
	}
	
	else if(e.getSource()==normarcar){
		
		if(totalcar <= 50){
		totalcar = totalcar+1;
		totalAmou = totalAmou+200;
		totalcaramount = totalcaramount+200;
		totalcars = totalcars+1;
		
		normarcart.setText("Total Car "+totalcars);
		}else{
			JOptionPane.showMessageDialog(null,"Not Enough Space For Car Parking");
		}
		

		
	}
	
	else if(e.getSource() ==choose ){
		Color color = JColorChooser.showDialog(null,"SelectColor",Color.yellow);
		c.setBackground(color);
		
	}
	
		else if(e.getSource()==bike){
		
		if(totalcar <= 50){
		totalcar = totalcar+1;
		totalAmou = totalAmou+100;
		totalbikeamount = totalbikeamount+200;
		totalbike = totalbike+1;
		
		biket.setText("Total Car "+totalbike);
		}else{
			JOptionPane.showMessageDialog(null,"Not Enough Space For Bike Parking");
		}
		

		
	}
	
	else if(e.getSource()==rickshaw){
		
		if(totalcar <= 50){
		totalcar = totalcar+1;
		totalAmou = totalAmou+50;
		totalricksamount = totalricksamount+50;
		totalrickshaw = totalrickshaw+1;
		
		rickshawt.setText("Total Car "+totalrickshaw);
		}else{
			JOptionPane.showMessageDialog(null,"Not Enough Space For Rickshaw Parking");
		}
		

		
	}
	else if(e.getSource()== showreport){
	
		
		String TBus = String.valueOf(totalbus);
		String TCar = String.valueOf(totalcars);
		String TBike = String.valueOf(totalbike);
		String TRicks = String.valueOf(totalrickshaw);
		
		totalcar = totalbus+totalcars+totalbike+totalrickshaw;
		totalAmou = totalbusamount+totalcaramount+totalbikeamount+totalricksamount;
		showreportt.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		






		 if(totalcar >= 50){
			 day2.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		 }
		// if(totalcar <= 30){
			// day4.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		// }
		 // if(totalcar <= 40){
			// day5.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		// }
		 // if(totalcar <= 50){
			// day6.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		// }
		
	}
	

	
	else if(e.getSource() == deletereport){

		bust.setText("");
		normarcart.setText("");
		biket.setText("");
		rickshawt.setText("");
		showreportt.setText("");
	
	}
	
	else if(e.getSource() == dd1){
		if(totalcar <=10){
			day2.setText("Total Car Parking  :"+totalcar + " "+" Total Amount "+totalAmou);
		}
	}

	
	
	else if(e.getSource() == nee ){
		
		JFrame frames = new JFrame();
		frames.setVisible(true);
		frames.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frames.setBounds(0,0,992,600);
		frames.setTitle("New Car Management Frame");
		
	}else if(e.getSource() == exit){
		System.exit(0);
	}
	
	// daily report programming
	
	else if(e.getSource() == daily){
		
		JFrame dailyfra = new JFrame();
		dailyfra.setVisible(true);
		dailyfra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		dailyfra.setBounds(0,0,992,600);
		dailyfra.setTitle("Daily REPORT SYSTEM");
		
		dailcon = dailyfra.getContentPane();
		dailcon.setLayout(null);
		

		dailytitle = new JLabel("Daily Report");
		dailytitle.setBounds(300,50,300,50);
		dailytitle.setFont(size);
		dailcon.add(dailytitle);
		
		dBus = new JLabel("");
		dBus.setBounds(10,100,200,50);
		dailcon.add(dBus);
		
		dcar = new JLabel("Total Car : ");
		dcar.setBounds(10,160,200,50);
		dailcon.add(dcar);
		
		dbike = new JLabel("Total Bike : ");
		dbike.setBounds(10,220,200,50);
		dailcon.add(dbike);
		
		drickshaw = new JLabel("Total Rickshaw : ");
		drickshaw.setBounds(10,290,200,50);
		dailcon.add(drickshaw);
		
		
		dbusAmount = new JLabel("Total Bus Amount : ");
		dbusAmount.setBounds(230,100,200,50);
		dailcon.add(dbusAmount);
		
		dcarAmount = new JLabel("Total Car Amount : ");
		dcarAmount.setBounds(230,160,200,50);
		dailcon.add(dcarAmount);
		
		dbikeAmount = new JLabel("Total Bike Amount : ");
		dbikeAmount.setBounds(230,220,200,50);
		dailcon.add(dbikeAmount);
		
		dRickshawAmount = new JLabel("Total Rickshaw Amount : ");
		dRickshawAmount.setBounds(230,290,200,50);
		dailcon.add(dRickshawAmount);
		
		
		dtotalCar = new JTextField("Total Car Parking Is : ");
		dtotalCar.setBounds(470,150,200,50);
		dailcon.add(dtotalCar);
		
		dtotalAmount = new JTextField("Total Car Parking Is : ");
		dtotalAmount.setBounds(470,250,200,50);
		dailcon.add(dtotalAmount);
		
		
		actiondaily = new JButton("Click Report");
		actiondaily.setBounds(0,10,200,50);
		actiondaily.setBackground(Color.PINK);
		dailcon.add(actiondaily);
		
		
			
		String ddBus = String.valueOf(totalbus);
		String dCar = String.valueOf(totalcars);
		String dBike = String.valueOf(totalbike);
		String dRicks = String.valueOf(totalrickshaw);
		
		totalcar = totalbus+totalcars+totalbike+totalrickshaw;
		totalAmou = totalbusamount+totalcaramount+totalbikeamount+totalricksamount;
		
		dtotalCar.setText("Today Total Parking :"+totalcar);
		dtotalAmount.setText("Today Total Earning :"+totalAmou);
		
		dBus.setText("Total Bus : "+totalbus);
		dcar.setText("Total Car : "+totalcars);
		dbike.setText("Total Bike : "+totalbike);
		drickshaw.setText("Total Rickshaw : "+totalrickshaw);
		
		dbusAmount.setText("Total Bus Earning : "+totalbusamount);
		dcarAmount.setText("Total Car Earning : "+totalcaramount);
		dbikeAmount.setText("Total Bike  Earning: "+totalbikeamount);
		dRickshawAmount.setText("Total Rickshaw Earning : "+totalricksamount);
			
		
	

		
		
		
		
	}
	else if(e.getSource() == developer){
		
		
		JFrame developfram = new JFrame();
		developfram.setVisible(true);
		developfram.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		developfram.setBounds(0,0,700,500);
		developfram.setTitle("Develper Information");
		
		ImageIcon info = new ImageIcon(getClass().getResource("love.png"));
		developfram.setIconImage(info.getImage());
		
		dailcoccn = developfram.getContentPane();
		dailcoccn.setLayout(null);
		
		Font spe = new Font("Cambria",Font.BOLD,13);
		
		JLabel name = new JLabel("Developed By : Abu Riad");
		name.setFont(spe);
		name.setBounds(10,10,300,50);
		name.setForeground(Color.BLUE);
		dailcoccn.add(name);
		
		JButton jnameb = new JButton();
		jnameb.setFont(spe);
		jnameb.setBackground(Color.PINK);
		jnameb.setBounds(10,60,300,2);
		dailcoccn.add(jnameb);
		
		JLabel lan = new JLabel("Usage Language : Java");
		lan.setFont(spe);
		lan.setBounds(10,50,300,50);
		dailcoccn.add(lan);
		
		JLabel framework = new JLabel("Usage Framework : Swing");
		framework.setFont(spe);
		framework.setBounds(10,70,300,50);
		dailcoccn.add(framework);
		
		JLabel softwarf = new JLabel("Software For : Usage Car Management");
		softwarf.setFont(spe);
		softwarf.setBounds(10,90,300,50);
		dailcoccn.add(softwarf);
		
		JLabel Licence = new JLabel("Licence : Free ");
		Licence.setFont(spe);
		Licence.setBounds(10,110,300,50);
		dailcoccn.add(Licence);
		
		
		ImageIcon photo = new ImageIcon(getClass().getResource("Riad.png"));
		
		JLabel setpho = new JLabel(photo);
		setpho.setBounds(450,20,400,400);
		dailcoccn.add(setpho);
		
		
		
		JButton space = new JButton();
		space.setFont(spe);
		space.setBackground(Color.RED);
		space.setBounds(10,165,150,2);
		dailcoccn.add(space);
		
		JLabel Educational = new JLabel("Educational Qualification : Running Diploma Engineering ");
		Educational.setFont(spe);
		Educational.setBounds(10,130,350,50);
		dailcoccn.add(Educational);
		
		JLabel sub = new JLabel("Depertment of : Computer Science ");
		sub.setFont(spe);
		sub.setBounds(10,150,300,50);
		dailcoccn.add(sub);
		
		JLabel exper = new JLabel("Expert On : Web Design ");
		exper.setFont(spe);
		exper.setBounds(10,170,300,50);
		dailcoccn.add(exper);
		
		JLabel cla = new JLabel("Project Clear : Web Design ");
		cla.setFont(spe);
		cla.setBounds(10,190,300,50);
		dailcoccn.add(cla);
		
		
	}
	
	

	

	

	
	
}
	
	public static void main(String[] args){
		
		Car softwareFrame = new Car();
		softwareFrame.setVisible(true);
		softwareFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		softwareFrame.setBounds(0,0,992,600);
		softwareFrame.setTitle("Car Management Software");
		softwareFrame.setResizable(false);
		
	}
	
}