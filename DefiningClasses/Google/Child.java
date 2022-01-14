package Exercise.DefiningClasses.Google_07;

public class Child {
    private String childName;
    private String childBirthday;

    public Child(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }
    @Override
    public String toString(){
        return String.format("%s %s",this.childName,this.childBirthday);
    }
}
