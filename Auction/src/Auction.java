public class Auction {

    private int initial_price;

    private long initial_ms;

    private int max_offer;

    private String maxOfferName;

    public Auction(int initial_price)
    {
        this.initial_ms = System.currentTimeMillis();
        this.initial_price = initial_price;
        this.max_offer = 0;
        this.maxOfferName = "";
        Thread t = new Thread( () -> {
            while(System.currentTimeMillis() - initial_ms != 3000) {}
            System.out.print(this.maxOfferName);
            System.out.println(max_offer);
        } );
        t.start();
    }

    public void makeOffer(int offer, String name)
    {
        synchronized (this.maxOfferName)
        {
            if(offer > this.max_offer)
            {
                this.max_offer = offer;
                this.maxOfferName = name;
            }
        }
    }
}
