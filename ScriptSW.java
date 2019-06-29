package AAATest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.Date;

import com.mysql.fabric.xmlrpc.base.Data;

public class ScriptSW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Robot myrobot = new Robot();
			myrobot.setAutoDelay(72);
//			for(int j=0;j<60;j++) {
//				System.out.println(j);
//			}
			System.out.println("开始");
			long i = 60*70*2;
			myrobot.keyPress(KeyEvent.VK_ALT);
			myrobot.keyPress(KeyEvent.VK_TAB);
			myrobot.keyRelease(KeyEvent.VK_TAB);
			myrobot.keyRelease(KeyEvent.VK_ALT);
			long t1 = System.currentTimeMillis();
			while(i>0) {
				//抛竿  左上角 70 70
				
				if(i%60==0) {
					myrobot.mouseMove(320-70, 450-70);
					myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
					myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
				}
				
				myrobot.mouseMove(500-70, 390-70);
				myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
				myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
				
				if(i%60==0) {
					myrobot.mouseMove(320-70, 450-70);
					myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
					myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
				}
				
				myrobot.mouseMove(500-70, 390-70);
				myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
				myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
				
				myrobot.keyPress(KeyEvent.VK_ESCAPE);
				myrobot.keyRelease(KeyEvent.VK_ESCAPE);
				
				//收取
				myrobot.mouseMove(530-70, 530-70);
				myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
				myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
//
//				myrobot.mouseMove(400, 514);
//				myrobot.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
//				myrobot.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
				
				if(i==1) {

					myrobot.keyPress(KeyEvent.VK_ALT);
					myrobot.keyPress(KeyEvent.VK_TAB);
					myrobot.keyRelease(KeyEvent.VK_TAB);
					myrobot.keyRelease(KeyEvent.VK_ALT);
				}
				i--;
			}
			long t2 = System.currentTimeMillis();
			
			System.out.println(t2-t1);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			boot();
	

	}
	
	public static void boot() {
		Runtime rt = Runtime.getRuntime();
		try {
			rt.exec("cmd.exe /c shutdown -s -t 30");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
