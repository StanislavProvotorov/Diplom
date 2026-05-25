package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    Burger burger;

    @Mock
    Bun mockBun;

    @Mock
    Ingredient mockIngredients1;

    @Mock
    Ingredient mockIngredients2;

    @Before
    public void setUp() {
        burger = new Burger();
    }

    @Test
    public void setBunsTest(){
        burger.setBuns(mockBun);

        assertEquals(mockBun, burger.bun);
    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(mockIngredients1);

        assertEquals(mockIngredients1, burger.ingredients.get(0));
    }

    @Test
    public void removeIngredientTest() {
        burger.addIngredient(mockIngredients1);
        burger.addIngredient(mockIngredients2);

        burger.removeIngredient(0);

        assertEquals(mockIngredients2, burger.ingredients.get(0));
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(mockIngredients1);
        burger.addIngredient(mockIngredients2);

        burger.moveIngredient(0, 1);

        assertEquals(mockIngredients2, burger.ingredients.get(0));
    }
}