package lt.techin.darius;

import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PostStamp;

import java.util.ArrayList;
import java.util.List;

public class PhilatelistImplemented implements Philatelist {
    private List<PostStamp> poststamps = new ArrayList<>();
    private double sum;
    private double maxPrice;

    public PhilatelistImplemented() {
    }

    @Override
    public void addToCollection(PostStamp postStamp) {
        if (postStamp == null) {
            throw new IllegalArgumentException();
        }
        if (postStamp.getName() == null || postStamp.getName().isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (poststamps.contains(postStamp)) {
            throw new IllegalArgumentException();
        }
        poststamps.add(postStamp);
    }

    @Override
    public int getNumberOfPostStampsInCollection() {
        return poststamps.size();
    }

    @Override
    public void printAllPostStampNames() {
        for (PostStamp stamp : poststamps) {
            System.out.println(stamp.getName());
        }
    }

    @Override
    public void printPostStampsWithPriceGreaterThan(double givenPrice) {
        for (PostStamp stamp : poststamps) {
            if (stamp.getMarketPrice() > givenPrice) {
                System.out.println(stamp.getName());
            }
        }

    }

    @Override
    public boolean isPostStampInCollection(PostStamp postStamp) {
        return poststamps.contains(postStamp);
    }

    @Override
    public boolean isPostStampWithNameInCollection(String givenName) {
        for (PostStamp stamp : poststamps) {
            if (stamp.getName().equals(givenName)) return true;
        }
        return false;
    }

    @Override
    public double calculateTotalMarketPrice() {
        for (PostStamp stamp : poststamps) {
            sum += stamp.getMarketPrice();
        }
        return sum;
    }

    @Override
    public double getAveragePostStampPrice() {
        return calculateTotalMarketPrice() / getNumberOfPostStampsInCollection();
    }

    @Override
    public PostStamp getTheMostExpensivePostStampByMarketValue() {
        maxPrice = -1;
        PostStamp postWithMaxPrice = null;
        for (PostStamp stamp : poststamps) {
            if (stamp.getMarketPrice() > maxPrice) {
                maxPrice = stamp.getMarketPrice();
                postWithMaxPrice = stamp;
            }
        }
        return postWithMaxPrice;
    }

    @Override
    public List<PostStamp> findPostStampsByNameContaining(String nameFragment) {
        List<PostStamp> sortedPoststamps = new ArrayList<>();
        for (PostStamp stamp : poststamps) {
            if (stamp.getName().contains(nameFragment)) sortedPoststamps.add(stamp);
        }
        return sortedPoststamps;
    }

    @Override
    public List<PostStamp> getSortedPostStampsByName() {
        List<PostStamp> sorterList = new ArrayList<>();
        sorterList.addAll(poststamps);
        sorterList.sort(new NameComparator());
        return sorterList;
    }
}
