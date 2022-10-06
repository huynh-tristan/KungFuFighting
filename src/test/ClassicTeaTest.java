import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicTeaTest {
    @Test
    public void one_ingredient_drink_is_able_to_store_and_return_values_for_no_change() {
        Double noChangeFormula[][] = {{1.5}, {2.0}, {2.0}};
        Drink drink = new Drink(noChangeFormula);
        int medium = 0;
        int ingredientNum = 1;
        assertEquals(1.5, drink.getIngredient(medium, ingredientNum));
    }
}
