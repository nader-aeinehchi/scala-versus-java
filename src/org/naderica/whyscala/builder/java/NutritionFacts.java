package org.naderica.whyscala.builder.java;

/**
 * This examples was introduced by Joshua Bloch in 2008. Here, we have added the standard getters methods, equals,
 * hashcode and toString methods.
 * 
 * <p>
 * The purpose of this class is to build immutable objects in a flexible way.
 * 
 * @see <code>Main</code> method for its usage.
 * 
 * @link http://www.informit.com/articles/article.aspx?p=1216151&seqNum=2
 * 
 * 
 */
public class NutritionFacts {
    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }
    }

    public static void main(String[] args) {
        final NutritionFacts nutritionFacts = new NutritionFacts.Builder(10, 20).calories(2000).carbohydrate(130).build();
        System.out.println(nutritionFacts);

    }

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;

    private final int carbohydrate;

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NutritionFacts other = (NutritionFacts) obj;
        if (this.calories != other.calories) {
            return false;
        }
        if (this.carbohydrate != other.carbohydrate) {
            return false;
        }
        if (this.fat != other.fat) {
            return false;
        }
        if (this.servingSize != other.servingSize) {
            return false;
        }
        if (this.servings != other.servings) {
            return false;
        }
        if (this.sodium != other.sodium) {
            return false;
        }
        return true;
    }

    public int getCalories() {
        return this.calories;
    }

    public int getCarbohydrate() {
        return this.carbohydrate;
    }

    public int getFat() {
        return this.fat;
    }

    public int getServings() {
        return this.servings;
    }

    public int getServingSize() {
        return this.servingSize;
    }

    public int getSodium() {
        return this.sodium;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.calories;
        result = prime * result + this.carbohydrate;
        result = prime * result + this.fat;
        result = prime * result + this.servingSize;
        result = prime * result + this.servings;
        result = prime * result + this.sodium;
        return result;
    }

    @Override
    public String toString() {
        return "NutritionFacts [servingSize=" + this.servingSize + ", servings=" + this.servings + ", calories="
                + this.calories + ", fat=" + this.fat + ", sodium=" + this.sodium + ", carbohydrate="
                + this.carbohydrate + "]";
    }

}
