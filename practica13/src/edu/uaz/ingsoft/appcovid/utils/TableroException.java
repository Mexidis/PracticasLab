public class TableroException extends Exception {
	private int index;

	public TableroException(String msg, int index){
		super(msg);
		this.index = index;
	}

	public int getIndex(){
		return index;
	}
}