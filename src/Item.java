abstract class Item {

    private String title;

    public Item(){
        title = "This is a placeholder title.";
    }

    //overload constructor
    public Item(String name){
        title = name;
    }

    //abstract method getListing()
    public abstract String getListing();

    //getTitle
    public String getTitle(){
        return title;
    }

    //Override toString()
    @Override
    public String toString(){
        return ("This item's title is: " + title);
    }
}
