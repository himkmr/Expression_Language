
public class User {
String name;
String email;
int id;
Address adr_obj;
public Address getAdr_obj() {
	return adr_obj;
}
public void setAdr_obj(Address adr_obj) {
	this.adr_obj = adr_obj;
}
public User()
{
	name="";
	email ="";
	id=0;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
