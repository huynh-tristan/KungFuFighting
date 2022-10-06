public class Drink {
    private Double[][] formula;

    public Drink(Double[][] formula) {
        this.formula = formula;
    }

    public double getIngredient(int medium, int ingredientNum) {
        return this.formula[medium][ingredientNum - 1];
    }
}
