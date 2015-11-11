package list;

public class LockDListNode extends DListNode
{
	boolean isLocked = false;
//	protected LockDListNode prev;
//	protected LockDListNode next;

	
	LockDListNode(Object item, DListNode prev, DListNode next) 
	{
		super(item, prev, next);
	}
	
	public boolean isLocked()
	{
		return isLocked;
	}
	
	public void setLocked(boolean isLocked) 
	{
		this.isLocked = isLocked;
	}

}
