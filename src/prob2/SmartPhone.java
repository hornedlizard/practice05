package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute( String function ) {
		if ( function.equals("앱") ) {
			playApp();
			return;
		} else if (function.equals("음악")) {
			super.execute( function );
			return;
		}						
		super.execute( function );		
	}

	protected void playApp() {
		System.out.println("앱실행");
	}
}
