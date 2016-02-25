package chapter2;

public class NickName 
{
	private Name nick;
	
	public NickName()
	{
		nick = new Name();
	} // end of default constructor
	
	public void setNickName(String nickName)
	{
		nick.setFirst(nickName);
	} // end of setNickName
	
	public String getNickName()
	{
		return nick.getFirst();
	} // end of getNickname
} // end NickName