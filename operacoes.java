package POO;
import java.util.*;
public class operacoes {
	
	private String username;
	private int password;

public  operacoes ( String username, int password) {
	this.username = username;
	this.password = password;
 }

public String getusername() {
	return username; 
	
}
public int getpassword() {
	return password;
}

public void setusername(String username) {
	this.username = username;
	
}
public void setpassword (int password) {
	this.password = password;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) return true; // 
    if (obj == null || getClass() != obj.getClass()) return false; 
    operacoes user = (operacoes) obj;
    return password == user.password && username.equals(user.username); 
}
@Override
public int hashCode() {
    return Objects.hash(username, password); 
}

}