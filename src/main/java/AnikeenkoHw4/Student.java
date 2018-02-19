package AnikeenkoHw4;



public class Student {


    private String name;


    private int mark;
     
    public int getMark() {
    	System.out.println("Mark : " + mark );
        return mark;
    }
    public void setMark(  int mark) {
        this.mark = mark;
    }
    public String getName() {
    	System.out.println("Name : " + name );
        return name;
    }
    public void setName( String name) {
        this.name = name;
    }
    
}