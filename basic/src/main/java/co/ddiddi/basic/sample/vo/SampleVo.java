package co.ddiddi.basic.sample.vo;

public class SampleVo {

	String sample;
	String name;
	String uuid;
	
	public SampleVo(String sample, String name, String uuid) {
		super();
		this.sample = sample;
		this.name = name;
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSample() {
		return sample;
	}

	public void setSample(String sample) {
		this.sample = sample;
	}
	
	
}
