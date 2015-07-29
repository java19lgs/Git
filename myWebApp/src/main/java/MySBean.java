import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

public class MySBean {

	private User user;
	private int id;
	private String nname;

	public MySBean(User user, int id, String nname) {
		super();
		this.user = user;
		this.id = id;
		this.nname = nname;
	}
	List<User> list;
	Set<User> set;
	Map<Object, Object> map;

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public Set<User> getSet() {
		return set;
	}

	public void setSet(Set<User> set) {
		this.set = set;
	}

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}

	public MySBean(int id, String nname) {
		this.id = id;
		this.nname = nname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public User getUser() {
		return user;
	}
	@Required							//jakscho potribno schob object zavgdy buv
	public void setUser(User user) {
		this.user = user;
	}

}
