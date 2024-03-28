package base;

public class Base {
    private int id;
    private String description;

    public Base (){
        id = 0;
        description = "nothing";
    }
    public Base (int id, String description){
        this.id = id;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        String str = String.format("id: %d, description: %s", getId(), getDescription());
        return str;
    }

    private String privateMethod(){
        return "This is private message from Base class";
    }
    public String publicMethod(){
        return "This is public message from Base class";
    }
    protected String protectedMethod(){
        return "This is protected message from Base class";
    }
    String defaultMethod(){
        return "This is default message from Base class";
    }

    public static void main(String[] args) {
        Base base = new Base();
        System.out.println(base.toString());
    }
}
