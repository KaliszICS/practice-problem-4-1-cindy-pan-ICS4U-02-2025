public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;
    private String hairColour;
    private String eyeColour;
    public Person(String name1, int age1, int height1, int weight1,  String eyeColour1,String hairColour1){
        this.name = name1;
        this.age = age1;
        this.height=height1;
        this.weight=weight1;
        this.hairColour=hairColour1;
        this.eyeColour=eyeColour1;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public int getHeight(){
        return this.height;
    }
    public int getWeight(){
        return this.weight;
    }
    public String getHairColour(){
        return this.hairColour;
    }
    public String getEyeColour(){
        return this.eyeColour;
    }
}
