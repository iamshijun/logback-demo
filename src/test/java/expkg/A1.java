package expkg;

public class A1 {
	
	public void doA1(){
		new A2().doA2();
	}
	
	public static void main(String[] args) {
		try{
			new A1().doA1();
		}catch(Throwable t){
			ExLogger.logger.info("/////////////////////////");
			ExLogger.logger.error("Got Throwable in A1",t); 
			throw t;
			//这里可以看到 cause的异常堆栈少了几个 是因为在A3中捕捉后被新抛出来的异常拥有3个相同的异常frame.
			// 其实可以看到日志输出中类似 	... 3 common frames omitted的字样
			
			//the stack trace basically
			//@see also ThrowableProxyUtil.asString(tp) : String 
		}
	}
}

