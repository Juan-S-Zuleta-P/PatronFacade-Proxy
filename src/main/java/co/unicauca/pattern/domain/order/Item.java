
package co.unicauca.pattern.domain.order;

/**
 *
 * @author Rivera
 */
public class Item {
    
    private Dish dish;
    private int amount;

    public Item() {
    }
    
    public Item(Dish dish, int amount){
        this.dish = dish;
        this.amount = amount;
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
