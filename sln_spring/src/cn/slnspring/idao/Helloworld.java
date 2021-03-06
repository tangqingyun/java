package cn.slnspring.idao;

import java.util.Collection;
import java.util.List;

import cn.slnspring.dao.IHelloworld;

public class Helloworld implements IHelloworld {
	private String say;
	private String name;
    private List<String> values;
    private Collection<String> colle;
    private String[] array;
	public Helloworld(String say, String name) {
		this.say = say;
		this.name = name;
	}

	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sayHello() {
		System.out.println(this.say);
	}
	
	public List<String> getValues() {
		return values;
	}

	public void setValues(List<String> list) {
		this.values = list;
	}

	public Collection<String> getColle() {
		return colle;
	}

	public void setColle(Collection<String> colle) {
		this.colle = colle;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	@Override
	public void sayContent() {
		System.out.println(this.say + "/" + this.name);
	}

}
