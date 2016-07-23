package com.test.pojo;

public class Users {
	private int id;
	private String name;
	private int age;
	private String sex;
	private String email;
	private String address;
    private String address1;
	public Users() {
		super();
	}

	public Users(int id, String name, int age, String sex, String email1,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.email = email1;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {

		System.out.println("1234");

		String a="1234";
		String b="1234";
		String c="1234";
		/*
		*添加注释
		*/
		String d="1234";
		String e="1234";
		String f="1234";
		String h="1234";
		String e="1234";
		String f="1234";
		String h="1234";
		String e="1234";
		String f="1234";
		String h="12345";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

        System.out.println("这是xxx修改的部分");
		
        System.out.print("王宁1的修改");

		return "返回代码郭帅";
       }   
}
