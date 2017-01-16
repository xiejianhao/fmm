package testemun;

public enum TestType {

	
	STAGES("分期",1),
	
	LOAN("贷款",2),
	
	DISPOSABLE("一次性",3),
	
	COMPANY("向公司借款",4);
	
	private String name;
	private int value;

	private TestType(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static String getNameByValue(int value) {
		TestType[] esc = TestType.values();
		for (TestType a : esc) {
			if (a.getValue() == value) {
				return a.getName();
			}
		}
		return "";
	}

}
