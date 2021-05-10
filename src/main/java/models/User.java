package models;

import java.util.List;

public class User
{
	private int userId; // primary key
	private String username; // not null, unique
	private String password; // not null
	private String firstName; // not null
	private String lastName; // not null
	private String email; // not null
	private Role role;
	private List<Account> accounts;
	
	public User()
	{
		super();
	}
	
	public User(int userId, String username, String password, String firstName, String lastName, String email, Role role, List<Account> accounts)
	{
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.role = role;
		this.accounts = accounts;
	}
	
	public void setUsername(String uname)
	{
		username = uname;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public void setPassword(String pword)
	{
		password = pword;
	}
	
	public String getPassword()
	{
		return password;
	}
}
