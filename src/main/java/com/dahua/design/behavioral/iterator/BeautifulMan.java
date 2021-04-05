package com.dahua.design.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public abstract class BeautifulMan {

    private List<String> girlFriends = new ArrayList<>();

    public void addGirlFriend(String name) {
        girlFriends.add(name);
    }

    public void removeGirlFriend(String name) {
        girlFriends.remove(name);
    }

    public Itr getIterator(){
        return new Iterator();
    }

    class Iterator implements Itr {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < girlFriends.size();
        }

        @Override
        public String next() {
            String name = girlFriends.get(cursor);
            cursor++;
            return name;
        }

        @Override
        public String firstGirlFriend() {
            return girlFriends.get(0);
        }

        @Override
        public String currentGirlFriend() {
            return girlFriends.get(girlFriends.size() - 1);
        }
    }

    interface Itr {
        boolean hasNext();

        String next();

        String firstGirlFriend();

        String currentGirlFriend();
    }
}
