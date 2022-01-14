package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;
    public Animal(String name,int age,String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        if(name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if(age<1){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    private void setGender(String gender) {
        if(gender.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }

    public String produceSound(){
        return null;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
    public String toString(){
        StringBuilder sb= new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append(this.getName()).append(String.format(" %d ",this.getAge()))
                .append(this.getGender()).append(System.lineSeparator());
        sb.append(produceSound());
        return sb.toString().trim();

    }
}
