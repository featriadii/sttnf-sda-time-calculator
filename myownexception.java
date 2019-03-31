package timecalculator;

class myownexception extends Exception{
	public myownexception(){

	}

	public myownexception(String message){
		super(message);
	}

	public myownexception(Throwable cause){
		super(cause);
	}

	public myownexception(String message, Throwable cause){
		super(message, cause);
	}
}