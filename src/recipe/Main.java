package recipe;

public class Main {
    public static void main(String[] args) throws ErrorName {


        Products kolbasa = new Products("Колбаса", 300);
        Products morkov = new Products("Морковь", 300);
        Products milk = new Products("Молоко", 200);
        Products egg = new Products("Яйцо", 300);
        Products rice = new Products("Рис", 300);

        System.out.println(Products.getListProducts().size());

        Recipe cake = new Recipe("Пирог");
        Recipe porridge = new Recipe("Каша");
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(porridge.getNameRecipe());
        porridge.getRecipeProducts().put(milk,2);
        porridge.getRecipeProducts().put(rice,1);

        System.out.println(porridge.getRecipeProducts().keySet());
        System.out.println(porridge.getRecipeProducts().values());
        System.out.println(porridge.getSumProducts());
        porridge.expenses(porridge);
        System.out.println(porridge.getSumProducts());




    }
}
