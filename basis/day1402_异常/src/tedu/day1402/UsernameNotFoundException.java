package tedu.day1402;

public class UsernameNotFoundException extends Exception {
	//参考父类构造方法参数，
	//添加相同参数的构造方法
	//接收的参数，直接交给父类构造方法处理
		
	public UsernameNotFoundException() {
		super();
	}

	public UsernameNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UsernameNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UsernameNotFoundException(String message) {
		super(message);
	}

	public UsernameNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
