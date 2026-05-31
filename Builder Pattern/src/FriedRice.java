import java.util.Locale;

public class FriedRice {
    private final boolean rice;
    private final boolean vegetables;
    private final boolean eggs;
    private final boolean chicken;

    private FriedRice(Builder builder){
        this.rice = builder.rice;
        this.vegetables = builder.vegetables;
        this.eggs = builder.eggs;
        this.chicken = builder.chicken;
    }

    @Override
    public String toString(){
        StringBuilder ingredients = new StringBuilder();

        if(rice) ingredients.append("Rice, ");
        if(vegetables) ingredients.append("Vegetables, ");
        if(eggs) ingredients.append("Eggs, ");
        if(chicken) ingredients.append("Chicken, ");

        ingredients.delete(ingredients.length()-2, ingredients.length()); //it removes the last comma and space

        return  ingredients.toString();
    }

    public static class Builder{
        private boolean rice;
        private boolean vegetables;
        private boolean eggs;
        private boolean chicken;

        public Builder withRice(){
            this.rice = true;
            return this;
        }

        public Builder withVegetables(){
            this.vegetables = true;
            return this;
        }

        public Builder withEggs(){
            this.eggs = true;
            return this;
        }

        public  Builder withChicken(){
            this.chicken = true;
            return this;
        }

        public FriedRice build(){
            return new FriedRice(this);
        }
    }

}
