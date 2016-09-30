package expkg;

public class A3 {
	
	public void doA3(){
		try{
			new A4().doA4();
		}catch(Throwable e){
			ExLogger.logger.error("Got Throwable In A3:",e);
			throw new IllegalStateException("Got Throwable :" + e.getMessage(),e);
		}
	}
}
