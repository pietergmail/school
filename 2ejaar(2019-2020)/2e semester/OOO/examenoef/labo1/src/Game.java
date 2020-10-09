public class Game implements Product{
    private String title;
    private String type;
    private String id;

    public Game(String title, String type, String id) {
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getprice(int days) {
        double price = (days * 3);
        return price;
    }
}