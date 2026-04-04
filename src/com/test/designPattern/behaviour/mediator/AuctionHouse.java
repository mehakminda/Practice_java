package com.test.designPattern.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

// Concrete Mediator
public class AuctionHouse implements AutionMediator{

    private String name;
    private  List<IColleague> bidderList;
    private double currentHighestBid;
    private IColleague currentHighestBidder;

    public AuctionHouse(String itemName, double startingPrice) {
        this.name = itemName;
        this.currentHighestBid = startingPrice;
        this.bidderList = new ArrayList<>();
        System.out.println("[+] Auction House created for item: " + itemName + " with initial bid of $" + startingPrice);
    }


    @Override
    public void registerBidder(IColleague bidder) {
        bidderList.add(bidder);
        System.out.println("[+] " + bidder.getName() + " has joined the auction for " + name);
    }

    @Override
    public void placeBid(IColleague bidder, double bidAmount) {

        // Check if the bid is valid
        if(bidAmount <= currentHighestBid){
            System.out.println(bidder.getName() + " bid of $" + bidAmount + " is too low. Current highest bid is $" + currentHighestBid);
            // Colleagues are not notified about the bid
            return;

        }

        // Update the highest bid
        currentHighestBid = bidAmount;
        currentHighestBidder = bidder;
        System.out.println("\n===> [New Bid Accepted]" + " Info: {Bidder: " + bidder.getName() + ", Bid Amount: " + bidAmount + "}");
        for(IColleague colleague: bidderList){
            if(!colleague.getName().equals(bidder.getName())){
                colleague.recieveNotification(bidAmount); //send notification to all other bidder about a new bid
            }
        }
    }

    @Override
    public void closeAuction() {
        if (currentHighestBidder != null) {
            System.out.println("\n===> [AUCTION UPDATE]");
            System.out.println("[+] Auction closed! Winner is " + currentHighestBidder.getName() +
                    " with a bid of $" + currentHighestBid + " for " + name);
        } else {
            System.out.println("Auction closed with no bids.");
        }


    }
}
