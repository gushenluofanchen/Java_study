package test1;

public class User {
    //属性
    private String name;
    private String password;
    private String email;
    private String gender;
    private int age;

    //快捷键alt+insert
    //空参构造
    public User(){}
    //带全部参数的构造
    public User(String name,String password,String email,String gender,int age){
        this.name=name;
        this.name=name;
        this.name=name;
        this.name=name;
        this.name=name;
    }

    //行为
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
