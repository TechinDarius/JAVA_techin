package lt.techin.socNet;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;


import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class MySocialNetwork implements SocialNetwork {
    Collection<Friend> myFriends = new HashSet<>();

    @Override
    public void addFriend(Friend friend) {
        if (friend == null) throw new IllegalArgumentException();
        if (!myFriends.contains(friend)) {
            myFriends.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return myFriends.size();
    }

    @Override
    public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {
        if (firstName == null || lastName == null) throw new IllegalArgumentException();
        return myFriends.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)).findFirst().orElseThrow(() -> new FriendNotFoundException(firstName, lastName));
    }

    @Override
    public Collection<Friend> findByCity(String city) {
        if (city == null) throw new IllegalArgumentException();
        return myFriends.stream().filter(f -> f.getCity().contains(city)).toList();
    }

    @Override
    public Collection<Friend> getOrderedFriends() {

        return myFriends.stream().sorted(Comparator.comparing(Friend::getCity).thenComparing(Friend::getLastName).thenComparing(Friend::getFirstName)).toList();
    }
}
