package tedu.day1402;

public class UsernameNotFoundException extends Exception {
	//�ο����๹�췽��������
	//�����ͬ�����Ĺ��췽��
	//���յĲ�����ֱ�ӽ������๹�췽������
		
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
