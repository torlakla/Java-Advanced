package Lab.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType,String bakingTechnique,double weight){
        setWeight(weight);
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);

    }

    private void setBakingTechnique(String bakingTechnique) {
        switch (bakingTechnique){
            case"Crispy":
            case "Chewy":
            case"Homemade":
                this.bakingTechnique=bakingTechnique;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setFlourType(String flourType) {
        if(flourType.equals("Wholegrain") || flourType.equals("White")){
            this.flourType=flourType;
        }else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if(weight<1 || weight>200){
            throw new IllegalArgumentException("Lab.PizzaCalories.Dough weight should be in the range [1..200].");
        }
        this.weight=weight;

    }

    public double calculateCalories(){
        double modifierBaking=0;
        double modifierDough=0;
        switch (bakingTechnique){
            case "Crispy":
                modifierBaking=0.9;
                break;
            case "Chewy":
                modifierBaking=1.1;
                break;
            case "Homemade":
                modifierBaking=1.0;
                break;
        }
        switch (flourType){
            case "Wholegrain":
                modifierDough=1.0;
                break;
            case"White":
                modifierDough=1.5;
                break;
        }

        return (this.weight*2.0)*modifierBaking*modifierDough;
    }
}
