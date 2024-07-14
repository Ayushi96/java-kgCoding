public class LibraryItem {

    protected int itemId;
    protected String title;
    protected String author;

    public void LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    protected void checkout() {
        System.out.println("checked out book " +  title);
    }

    protected void returnItem() {
        System.out.println("returned item "+ itemId);
    }

}
