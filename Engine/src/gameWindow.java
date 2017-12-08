
public class gameWindow extends Thread{
	
	public boolean running;
	
	public gameWindow() {
		
		this.run();
	}
	
	public void run(){
		long nextFrame =  (System.nanoTime() + 16666667);
		
		while(true) {
			if(System.nanoTime() >= nextFrame) {
				nextFrame += 16666667;
				//frame
			}
			
		}
		
	}

}
